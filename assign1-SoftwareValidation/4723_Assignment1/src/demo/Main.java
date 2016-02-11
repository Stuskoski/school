package demo;

import java.util.List;

import javax.mail.Message;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email; //for email
import org.apache.commons.mail.SimpleEmail;
import org.jvnet.mock_javamail.Mailbox;

public class Main {

	/**
	 * test using mock_javamail 
	 * http://mvnrepository.com/artifact/org.jvnet.mock-javamail/mock-javamail/1.9
	 */
	public static void testWithMock() {
		Mailbox.clearAll();
        try {
        	Email email = new SimpleEmail();
        	email.setHostName("gmail.com");
        	email.setFrom("Stuskoski@gmail.com");
        	email.setSubject("Test Email");
        	email.setMsg("This is a test mail ... :-)");
        	email.addTo("Stuskoski@yahoo.com");
        	email.send();
        	
		} catch(Exception e) {
			System.out.println("Ouch: " + e.getMessage());
			e.printStackTrace();
		}

        try {
			List<Message> inbox = Mailbox.get("Stuskoski@yahoo.com");
			
			System.out.println("inbox size is "+ inbox.size());
			//if inbox size is 0 then the email did not send correctly
			//or was not received correctly
			if(inbox.size() > 0) {
				System.out.println(inbox.get(0).getSubject());
				System.out.println(inbox.get(0).getContent());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * In order for real use of gmail for SMTP to work
	 * you will need to go to your Google account settings in the Connected apps & sites page
	 * and turn "Allow less secure apps" to ON
	 */
	public static void testForReal() {
		//example that really sends through gmail
		//you need a gmail account for this and must enable less secure apps to send 
		//using your gmail credentials
		try {
			
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("<your gmail address>", "<your gmail pw>"));
			//email.setDebug(true);
			email.setSSLOnConnect(true);
			email.setFrom("<your gmail address>");
			email.setSubject("Test Email");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("<to email address>");
			email.send();
			
		} catch(Exception e) {
			System.out.println("Ouch: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {

		//testForReal();
		
		testWithMock();

	}

}
