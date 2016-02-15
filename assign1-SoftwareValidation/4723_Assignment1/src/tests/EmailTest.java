package tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email; //for email
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.jvnet.mock_javamail.Mailbox;

public class EmailTest {

	/**
	 * testUpdateContentType1
	 */
	@Test
	public void testUpdateContentType1() {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		try {
			email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
			email.setSubject("Test Email");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("Stuskoski@yahoo.com");
			assertFalse(email.send().isEmpty());
		} catch (EmailException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		}
	}

	/**
	 * testGetMailSession1
	 */
	@Test
	public void testGetMailSession1() {
		fail("Not yet implemented");
	}

	/**
	 * testSetFromString1
	 */
	@Test
	public void testSetFromString1() {
		fail("Not yet implemented");
	}

	/**
	 * testAddCcString tests the correct functionality of the addCc 
	 * function in the Apache Mail Class.  This test creates a
	 * static array with 3 valid email addresses which is passed
	 * into addCc.
	 * 
	 * This test is expected to pass.
	 * 
	 * If an exception happens, the test will fail.
	 * 
	 * The 3 valid emails are Stuskoski@yahoo.com, Stusdaboss@yahoo.com,
	 * and Stuskoski@gmail.com
	 */
	@Test
	public void testAddCc1() {
		String emails[] = {"Stuskoski@yahoo.com", "Stusdaboss@yahoo.com", "Stuskoski@gmail.com"};
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		try {
			email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
			email.setSubject("Test Email");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("Stuskoski@yahoo.com");
			assertTrue(email.addCc(emails) == email); //Main function to test
			email.send();
		} catch (EmailException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		}
	}
	
	
	/**
	 * testAddCc2 tests the exception throwing capability
	 * of the addCc() function in Apache Mail Commons.
	 * 
	 * I originally declare a static array of Strings with
	 * 1 valid email and 2 invalid emails.  The emails are
	 * as follows: Stuskoski@yahoo.com, Stusdabossyahoo.com,
	 * and Stuskoskigmail.
	 * 
	 * The expected result of this test is for the test to
	 * pass because I believe the Array passed to the function
	 * will cause an exception to be thrown.  
	 * 
	 * Test will fail if no exception is thrown, pass otherwise.
	 * 
	 * Expected result: Pass
	 * @throws EmailException
	 */
	@Test(expected = EmailException.class) 
	public void testAddCc2() throws EmailException {
		String emails[] = {"Stuskoski@yahoo.com", "Stusdabossyahoo.com", "Stuskoskigmail"};
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
		email.setSubject("Test Email");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("Stuskoski@yahoo.com");
		email.addCc(emails); //Main function to test
		email.send();
		fail("The message sent successfully, no exception thrown.");
	}
	
	
	/**
	 * testAddCc3 will test addCc() under a
	 * heavier load.  This test creates an
	 * array of Strings with 100 valid email
	 * addresses.
	 * 
	 * addCc() is called after with the large
	 * array of email addresses in an attempt
	 * to CC all of them to the email.
	 * 
	 * If any exception is throw during the
	 * test the test will fail.  If the function
	 * successfully adds all the email addresses
	 * and send has no problem, the test passes.
	 * 
	 * Expected result: pass
	 */
	@Test
	public void testAddCc3() {
		String emails[] = new String[100];
		
		for(int i=0; i<100; i++){
			emails[i] = "Stuskoski"+i+"@yahoo.com";
		}
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		try {
			email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
			email.setSubject("Test Email");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("Stuskoski@yahoo.com");
			email.addCc(emails);
			email.send();
		} catch (EmailException e) {
			fail("Test failed. Exception was thrown." + e.getMessage());
		}
	}

	/**
	 * testAddBcc1 tests whether the addBcc(String... email)
	 * works when adding email address for bcc.
	 * 
	 * I pass a String array with 3 valid email addresses to the 
	 * function.
	 * 
	 * addBcc() returns an email upon success so that will be my 
	 * check to assertTrue that the function returned an object
	 * email.  If the function does not return the object or throws
	 * an exception the test will fail.
	 * 
	 * Emails passed: Stuskoski@yahoo.com, Stusdaboss@yahoo.com, Stuskoski@gmail.com
	 * 
	 * Expected result: pass
	 */
	@Test
	public void testAddBcc1() {
		String emails[] = {"Stuskoski@yahoo.com", "Stusdaboss@yahoo.com", "Stuskoski@gmail.com"};
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		try {
			email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
			email.setSubject("Test Email");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("Stuskoski@yahoo.com");
			assertTrue(email.addBcc(emails) == email);
			email.send();
		} catch (EmailException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		}
	}
	
	
	/**
	 * testAddBcc2 tests whether the addBcc(String... email)
	 * will throw an EmailException with an invalid email
	 * address like stated in the documentation.
	 * 
	 * I pass a String array with 2 valid email addresses and 1 invalid
	 * email address to the function.
	 * 
	 * addBcc() returns an email upon success so that will be my 
	 * check to assertTrue that the function returned an object
	 * email.  If the function does not return the object or throws
	 * an exception the test will fail.
	 * 
	 * Emails passed: Stuskoski@yahoo.com, Stusdaboss@yahoo.com, Stuskoskigmail.com <-- (No @ symbol -- Invalid email) 
	 * 
	 * Expected result: EmailException Thrown
	 */
	@Test(expected = EmailException.class) 
	public void testAddBcc2() throws EmailException{
		String emails[] = {"Stuskoski@yahoo.com", "Stusdaboss@yahoo.com", "Stuskoskigmail.com"};
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
		email.setSubject("Test Email");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("Stuskoski@yahoo.com");
		email.addBcc(emails);
		fail("Exception not thrown with invalid email address.");
		email.send();
	
	}
	
	
	/**
	 * testAddBcc3 will test the addBcc function to 
	 * determine if the function handles a large array
	 * of emails correctly.  An array is created with
	 * 100 valid emails in which each one will be bcc'd
	 * into the email.
	 * 
	 * The test will pass if the whole method executes 
	 * without and exception being thrown.  Fails with
	 * a message if any exception is thrown.
	 * 
	 * Expected result: pass
	 */
	@Test
	public void testAddBcc3() {
		String emails[] = new String[100];
		
		for(int i=0; i<100; i++){
			emails[i] = "Stuskoski"+i+"@yahoo.com";
		}
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		try {
			email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
			email.setSubject("Test Email");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("Stuskoski@yahoo.com");
			email.addBcc(emails);
			email.send();
		} catch (EmailException e) {
			fail("Test failed. Exception was thrown." + e.getMessage());
		}
	}

	/**
	 * testAddReplyTo1
	 */
	@Test
	public void testAddReplyTo1() {
		fail("Not yet implemented");
	}

	/**
	 * testAddHeader1
	 */
	@Test
	public void testAddHeader1() {
		fail("Not yet implemented");
	}

	/**
	 * testBuildMimeMessage1
	 */
	@Test
	public void testBuildMimeMessage1() {
		fail("Not yet implemented");
	}

	/**
	 * testSend1 will test the send function in the Apache Commons Mail.
	 * Send function will return a string upon success.
	 * This test will determine if a string was sent back
	 * meaning the email was sent successfully.
	 * 
	 * All information is correct so the email should go through.
	 * String returned is a lengthy number resembling some details 
	 * for the sent email.
	 */
	@Test
	public void testSend1() {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		try {
			email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
			email.setSubject("Test Email");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("Stuskoski@yahoo.com");
			assertFalse(email.send().isEmpty());
		} catch (EmailException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		}
	}
	
	/**
	 * testSend2 is meant to confirm the email
	 * class successfully throws an exception whenever
	 * an email tries to send and fails.
	 * 
	 * I commented out the addTo to cause the send function
	 * to fail since there is no destination for the email
	 * to be sent to.  Test fails if send does not
	 * throw an exception.
	 * 
	 * Little different way of doing things by specifying a
	 * rule and checking is that rule has the correct
	 * expected exception.  Fails if incorrect exception.
	 */
	@Rule
	public ExpectedException thrownSend = ExpectedException.none();
	@Test
	public void testSend2() throws EmailException{
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid1"));
		email.setSSLOnConnect(true);
			email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
			email.setSubject("Test Email");
			email.setMsg("This is a test mail ... :-)");
			//email.addTo("Stuskoski@yahoo.com"); Line commented out to throw EmailException
			thrownSend.expect(EmailException.class);
			email.send();
			fail("Test failed.  Email sent without exception thrown.");
	}
	
	
	/**
	 * testSend3 is designed to test the IllegalStateException
	 * thrown by the send() function in Apache Commons Mail.
	 * 
	 * Documentation states that the function will throw
	 * the exception if the MimeMessage was already built, ie
	 * buildMimeMessage()was already called.  Upon sending
	 * the message buildMimeMessage() is called so if a second
	 * send() is called, an exception should be thrown.
	 * 
	 * This class fails if IllegalStateException is not thrown.
	 * Uses an expected @Test instead of a @rule like above to
	 * validate the correct exception.  Both are valid ways.
	 */
	@Test(expected = IllegalStateException.class) 
	public void testSend3() {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		try {
			email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
			email.setSubject("Test Email");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("Stuskoski@yahoo.com");
			email.send();
			email.send();
			fail("Expected an IllegalStateException to be thrown after 2nd send() was called.");
		} catch (EmailException e) {
			System.out.println("testSend3 passed!");
		}
	}

	/**
	 * testGetSentDate1 will test the correct functionality
	 * of the getSentDate function in Apache Mail Class.
	 * 
	 * The function gets the date of an existing email in
	 * an inbox.  As long as the email exists and is valid
	 * the function should work just fine.
	 * 
	 * I empty out the mailbox to clear all previous emails.  
	 * I then send a new valid email with no errors.  I call
	 * getSentDate on index 0 of the mailbox to get the sent
	 * date which should be today since I sent it.
	 * 
	 * This test should pass since all parameters are correct
	 * for all the functions.
	 * 
	 * Expected result: pass
	 */
	@Test
	public void testGetSentDate1() {
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
			fail("Exception thrown when sending.");
		}

        try {
			List<Message> inbox = Mailbox.get("Stuskoski@yahoo.com");
			
			//if inbox size is 0 then the email did not send correctly
			//or was not received correctly
			if(inbox.size() > 0) {
				inbox.get(0).getSentDate();
			}else{
				fail("Test failed, message not sent correctly.");
			}
		} catch (Exception e) {
			fail("Exception thrown when accessing email.");
		}
	}

	
	/**
	 * tesGetSentDate2 is designed to test the exception
	 * throwing of the getSentDate() function.  In this 
	 * test I will send a valid email to the mailbox.
	 * 
	 * Instead of reading the valid email and getting the
	 * date of that one, I instead call an invalid index
	 * of 1 instead of 0.  
	 * 
	 * This invalid index should throw an exception since
	 * the email does not exist.
	 * 
	 * The expected result is an exception throw which will
	 * be expected and cause the test to pass.
	 * @throws MessagingException 
	 */
	@Test (expected = java.lang.IndexOutOfBoundsException.class) 
	public void testGetSentDate2() throws java.lang.IndexOutOfBoundsException, MessagingException {
		Mailbox.clearAll();
		
		try {
        	Email email = new SimpleEmail();
        	email.setHostName("gmail.com");
        	email.setFrom("Stuskoski@gmail.com");
        	email.setSubject("Test Email");
        	email.setMsg("This is a test mail with wrong index :(");
        	email.addTo("Stuskoski@yahoo.com");
        	email.send();
        	
		} catch(Exception e) {
			fail("Exception thrown when sending.");
		}

      
			List<Message> inbox = Mailbox.get("Stuskoski@yahoo.com");
			
			//if inbox size is 0 then the email did not send correctly
			//or was not received correctly
			if(inbox.size() > 0) {
				inbox.get(1).getSentDate(); //call an email that does not exist. Should throw an exception.
			}else{
				fail("Test failed, message not sent correctly.");
			}
	}
	
	
	/**
	 * testGetSentDate3 is designed to test the ability 
	 * of getSentDate() with a large amount of emails.
	 * 
	 * We all have inboxes that we fail to clear and
	 * large amount of mail gets accumulated inside.
	 * I want to determine that getSentDate() will
	 * not throw an error with a large, full inbox.
	 * 
	 * I will first clear the initial mail box.  After
	 * clearing the mailbox I will create and send
	 * 5000 emails to the inbox.  After all the emails
	 * have been sent I will loop through all of them
	 * and call getSentDate() and print out the dates.
	 * 
	 * If any exceptions are thrown during the execution
	 * of the method, the test fails.  Passes otherwise.
	 * 
	 * Expected result: pass
	 */
	@Test
	public void testGetSentDate3() {
		Mailbox.clearAll();
		
		try {
			
			for(int i=0; i<5000; i++){
				Email email = new SimpleEmail();
	        	email.setHostName("gmail.com");
	        	email.setFrom("Stuskoski@gmail.com");
	        	email.setSubject("Test Email");
	        	email.setMsg("This is a test mail ... :-)");
	        	email.addTo("Stuskoski@yahoo.com");
	        	email.send();
			}
		} catch(Exception e) {
			fail("Exception thrown when sending large amount of messages.");
		}

        try {
			List<Message> inbox = Mailbox.get("Stuskoski@yahoo.com");
			
			//if inbox size is 0 then the email did not send correctly
			//or was not received correctly
			if(inbox.size() > 0) {
				for(int i=0; i<5000; i++){
					inbox.get(i).getSentDate();
					/**
					 * System.out is commented out now.
					 * I verified that they do indeed print
					 * though.
					 */
					//System.out.println(inbox.get(i).getSentDate() + "\t Message: " + i);
				}
			}else{
				fail("Test failed, message not sent correctly.");
			}
		} catch (Exception e) {
			fail("Exception thrown when accessing large inbox.");
		}
	}
	
	/**
	 * testGetHostName1 tests the correct functionality of 
	 * the getHostName() function. getHostName() returns 
	 * the set host name of the current email it is called
	 * against.
	 * 
	 * The expected result of this test is a pass, since I 
	 * believe the function will return a string.  Whether it
	 * is the correct string or not is tested in the next
	 * test.
	 * 
	 * The test will pass if getHostName() returns any String
	 * and will fail otherwise.
	 * 
	 * "smtp.gmail.com" is used in setHostName.
	 */
	@Test
	public void testGetHostName1() {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		try {
			email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
			email.setSubject("Test Email");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("Stuskoski@yahoo.com");
			email.send();
			assertTrue(email.getHostName() == "smtp.gmail.com");
			//System.out.println(email.getHostName());
		} catch (EmailException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		}
	}
	
	/**
	 * testGetHostName2 tests the correctly
	 * functionality of getHostName() a little
	 * further than the previous test.
	 * 
	 * While the previous test only tested if
	 * the function returned a string, this 
	 * test will determine if the string passed
	 * back is correct.
	 * 
	 * When setHostName() is called, the host name
	 * is set for the email.  So when getHostName
	 * is called on the same email they should be 
	 * the same value.
	 * 
	 * The expected result of this test is a pass
	 * since both are getting the same string of 
	 * "smtp.gmail.com".  
	 * 
	 * Pass is string matches, else fail.
	 */
	@Test
	public void testGetHostName2() {
		Email email = new SimpleEmail();
		String host = "smtp.gmail.com";
		email.setHostName(host);
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		try {
			email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
			email.setSubject("Test Email");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("Stuskoski@yahoo.com");
			email.send();
			assertTrue(email.getHostName() == host);
			//System.out.println(email.getHostName());
		} catch (EmailException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		}
	}

	/**
	 * testGetSocketConnectionTimeout
	 */
	@Test
	public void testGetSocketConnectionTimeout() {
		fail("Not yet implemented");
	}

}
