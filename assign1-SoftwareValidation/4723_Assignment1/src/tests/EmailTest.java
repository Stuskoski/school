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
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email; //for email
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.jvnet.mock_javamail.Mailbox;

/**
 * TEST PLAN
 * @author Augustus Rutkoski - jkj449
 * CS 4723 Software Validation
 * Assignment1 40 test cases for Apache Mail
 * 
 * In-depth explanation of each test case available above the methods
 * 
 * Test ID						Quick Description						Inputs
 * -----------------------------------------------------------------------------------------------------------------
 *testUpdateContentType1			correct functionality						"text/html"
 *testUpdateContentType2			correct functionality w/ charset			"text/html;charset=UTF-8"
 *testUpdateContentType3			invalid input								"invalidString"
 *testUpdateContentType4			multiple calls								"text/html;charset=UTF-8","application/zip","image/gif","application/pdf"
 *testUpdateContentType5			invalid type/valid charset					"invalidString;charset=UTF-8"
 *
 *testGetMailSession1				correct functionality						n/a
 *testGetMailSession2				exception throwing							n/a
 *testGetMailSession3				multiple calls								n/a
 *		
 *testSetFrom1						correct functionality						"augustusrutkoskisoftwarevalid@gmail.com"
 *testSetFrom2						invalid input								"augustusrutkoskisoftwarevalid@"
 *testSetFrom3						multiple calls/inputs						"augustusrutkoskisoftwarevalid@gmail.com","stuskoski@gmail.com"
 *testSetFrom4						large # of calls/validation					"Stuskoski@gmail.com[0-499]"
 *
 *testAddCc1						correct functionality						array{"Stuskoski@yahoo.com", "Stusdaboss@yahoo.com", "Stuskoski@gmail.com"}
 *testAddCc2						exception throwing							array{"Stuskoski@yahoo.com", "Stusdabossyahoo.com", "Stuskoskigmail"}
 *testAddCc3						large # of emails							array{"Stuskoski"+[0-99]+"@yahoo.com"}
 *
 *testAddBcc1						correct functionality						array{"Stuskoski@yahoo.com", "Stusdaboss@yahoo.com", "Stuskoski@gmail.com"}
 *testAddBcc2						exception throwing							array{"Stuskoski@yahoo.com", "Stusdaboss@yahoo.com", "Stuskoskigmail.com"}
 *testAddBcc3						large # of emails							array{"Stuskoski"+[0-99]+"@yahoo.com"}
 *
 *testAddReplyTo1					correct functionality						emailTest = "Stuskoski@gmail.com";  nameTest = "Augustus";
 *testAddReplyTo2					exception throwing							emailTest = "Stuskoski";  nameTest = "Augustus";
 *
 *testAddHeader1					correct functionality						valueTest = "Stuskoski@gmail.com"; nameTest = "Augustus";
 *testAddHeader2					exception throwing							nameTest = null;  valueTest = "Stuskoski@gmail.com"; 	
 *testAddHeader3					exception throwing							nameTest = "";  valueTest = "Stuskoski@gmail.com"; 
 *testAddHeader4					exception throwing							nameTest = "Augustus";  valueTest = null; 	
 *testAddHeader5					exception throwing							nameTest = "Augustus";  valueTest = ""; 	
 *	
 *testBuildMimeMessage1				exception(IllegalStateException)			n/a
 *testBuildMimeMessage2				exception(EmailException)					n/a 
 *
 *testSend1							correct functionality						n/a
 *testSend2							exception(EmailException)					n/a	
 *testSend3							exception(IllegalStateException)			n/a
 *testSend4							correct functionality(more detail)			n/a
 *
 *testGetSentDate1					correct functionality						n/a
 *testGetSentDate2					exception throwing							n/a
 *testGetSentDate3					large # of emails(5000)						n/a
 *
 *testGetHostName1					correct functionality						n/a
 *testGetHostName2					correct functionality(more detail)			n/a
 *testGetHostName3					multiple calls/validation					n/a
 *
 *testGetSocketConnectionTimeout1	correct functionality/validation			n/a
 *testGetSocketConnectionTimeout2	correct functionality(default value)		n/a
 *testGetSocketConnectionTimeout3	correct functionality(value set/validated)	n/a
 *	
 */
public class EmailTest {

	/**
	 * testUpdateContentType1 tests the correct functionality
	 * of updateContentType().  To change the content type of
	 * the email, the updateContentType() function is used.
	 * 
	 * I pass the valid String parameter "text/html" into the
	 * function to change the content type.
	 * 
	 * The test will pass if no exceptions are thrown and send
	 * completes successfully.
	 * The test will fail if any exceptions are thrown causing
	 * the send to fail.
	 * 
	 * Expected result: pass, valid parameter passed.
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
			email.updateContentType("text/html");
			email.send();
		} catch (EmailException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		}
	}
	
	
	/**
	 * testUpdateContentType2 expands a bit further
	 * than our previous test testUpdateContentType1.
	 * In addition to setting the content type I also
	 * send a charset with the string into the function
	 * updateContentType().
	 * i.e updateContentType("text/html;charset=UTF-8")
	 * 
	 * The test will pass with the similar requirements
	 * as the previous test.  The test will pass if no
	 * exceptions are thrown and if send() completes
	 * successfully.
	 * The test will fail if any exception is thrown
	 * interruption completion of the method.
	 * 
	 * Expected result: pass, valid string passed
	 */
	@Test
	public void testUpdateContentType2() {
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
			email.updateContentType("text/html;charset=UTF-8");
			email.send();
		} catch (EmailException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		}
	}
	
	
	/**
	 * testUpdateContentType3 tests the possibility of sending
	 * an invalid string in the function updateContentType().
	 * 
	 * There are a list of valid Strings to pass into the function
	 * found via Google, I pass a String that is not listed anywhere.
	 * 
	 * The test will pass as long as the correct exception is thrown,
	 * i.e sending failed.
	 * The test will fail if send() completes in which a fail() will
	 * be executed.
	 * 
	 * Expected result: Test will pass, exception is thrown due to incorrect
	 * String.
	 * @throws EmailException 
	 */
	@Test(expected = EmailException.class)
	public void testUpdateContentType3() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
		email.setSubject("Test Email");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("Stuskoski@yahoo.com");
		email.updateContentType("invalidString");
		email.send();
		fail("Send completed, no exception thrown.");

	}
	
	
	/**
	 * testUpdateContentType4 tests the possibility of
	 * having someone forgetting to remove previous
	 * declarations of updateContentType() in their
	 * program.  For this test I have 4 calls to 
	 * updateContentType, each with a different valid
	 * String passed through:
	 * 
	 * "text/html;charset=UTF-8"
	 * "application/zip"
	 * "image/gif"
	 * "application/pdf"
	 * 
	 * I then go further to retrieve the email from the
	 * mailbox and check it's Content Type.  I believe
	 * the last call will be the correct Content Type so 
	 * that is the one I check against.
	 * 
	 * If any exceptions are thrown the test fails.
	 * The test will pass if no exceptions are thrown,
	 * email is sent correctly, and the Content Type
	 * matches the last call to updateContentType().
	 */
	@Test
	public void testUpdateContentType4() {
		Mailbox.clearAll();
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
			email.updateContentType("text/html;charset=UTF-8");
			email.updateContentType("application/zip");
			email.updateContentType("image/gif");
			email.updateContentType("application/pdf");
			email.send();
			
			List<Message> inbox = Mailbox.get("Stuskoski@yahoo.com");
			assertTrue(inbox.get(0).getContentType().equals("application/pdf"));
			
		} catch (EmailException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		} catch (AddressException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		} catch (MessagingException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		}
	}
	
	
	/**
	 * testUpdateContentType5 is the last test for updateContentType
	 * and tests the possibility of having an invalid contentType in
	 * the first half but having a correct charset.
	 * 
	 * The test will pass if an exception is thrown.
	 * The test will fail if an exception is not thrown or in the message
	 * gets sent.
	 * 
	 * Expected result: pass, exception thrown.
	 */
	@Test(expected = EmailException.class)
	public void testUpdateContentType5() throws EmailException{
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
		email.setSubject("Test Email");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("Stuskoski@yahoo.com");
		email.updateContentType("invalidString;charset=UTF-8");
		email.send();
		fail("Send went through, no exception thrown.");
	}

	/**
	 * testGetMailSession1 tests the correct functionality of
	 * getMailSession().  getMailSession() returns the current
	 * mail session, and will create one if necessary.  I call
	 * the function after a valid email session has been started
	 * and convert the session to a string.  I then check if the 
	 * String is present with a toString and length > 0 check.
	 * 
	 * The test will pass if a session is returned from the 
	 * function and no exceptions are thrown with the call.
	 * 
	 * Test will fail if an exception is thrown.
	 * 
	 * Expected result: pass
	 */
	@Test
	public void testGetMailSession1() {
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
			assertTrue(email.getMailSession().toString().length() > 0);
			email.send();
		} catch (EmailException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		}
	}
	
	/**
	 * testGetMailSession2 will test the exception throwing
	 * capabilities of the getMailSession() function call.
	 * According to the documentation, the function will
	 * throw an EmailException if the host name was not
	 * set.  
	 * 
	 * To replicate the error I will simply not set the 
	 * host name to "smtp.gmail.com" and check if the
	 * correct exception is thrown.
	 * 
	 * The test will pass if the correct exception is thrown
	 * and will fail otherwise.
	 * 
	 * Expected result: pass, exception thrown.
	 */
	@Rule
	public ExpectedException mailSession = ExpectedException.none();
	@Test
	public void testGetMailSession2() throws EmailException{
		Email email = new SimpleEmail();
		//email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
		email.setSubject("Test Email");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("Stuskoski@yahoo.com");
		mailSession.expect(org.apache.commons.mail.EmailException.class);
		email.getMailSession();
		fail("No exception thrown.  Fail!");
		email.send();
	}
	
	/**
	 * testGetMailSession3 tests the correct functionality of getMailSession()
	 * but in an attempt to break it.  With this test multiple calls to 
	 * getMailSession() are called to make sure no exceptions are thrown.
	 * This test makes sure getMailSession() is not altering any information
	 * that will prevent further calls to getMailSession() from executing correctly.
	 * 
	 * The test will pass if all goes well and execution completes with no
	 * exceptions thrown.
	 * The test will fail if any exceptions are thrown.
	 * 
	 * Expected result: pass, multiple calls to getMailSession() are fine to do.
	 */
	@Test
	public void testGetMailSession3() {
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
			email.getMailSession();
			email.getMailSession();
			email.getMailSession();
			email.getMailSession();
			email.send();
		} catch (EmailException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		}
	}

	/**
	 * testSetFrom1 will test the correct
	 * functionality of the setFrom function.
	 * I will pass a valid email address into
	 * the function which will be added to the 
	 * email.  If any exceptions are thrown
	 * which prevents the email from correctly
	 * sending the test will fail.
	 * 
	 * The test will pass if the email goes through
	 * and sends correctly.
	 * 
	 * Expected result: pass
	 */
	@Test
	public void testSetFrom1() {
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
			assertTrue(email.send().length() > 0);
		} catch (EmailException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		}
	}
	
	
	/**
	 * testSetFrom2 will test the invalid email
	 * detection of the setFrom class.  I will
	 * add an invalid email "augustusrutkoskisoftwarevalid@"
	 * to the function and test for an exception to be 
	 * thrown.
	 * 
	 * The test will pass if an exception is thrown
	 * and will fail if the email is sent successfully.
	 * 
	 * Expected result: pass, exception thrown
	 * @throws EmailException 
	 */
	@Test(expected = EmailException.class)
	public void testSetFrom2() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		email.setFrom("augustusrutkoskisoftwarevalid@");
		email.setSubject("Test Email");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("Stuskoski@yahoo.com");
		email.send();
		fail("Send went through.  Fail!");
	}
	
	/**
	 * testSetFrom3 will test the case if a programmer
	 * accidentally calls setFrom() twice in their program.
	 * I will call setFrom() intially with the valid email
	 * "augustusrutkoskisoftwarevalid@gmail.com", I will then 
	 * call the function again but with a second valid email
	 * of "stuskoski@gmail.com"  I will then compare and
	 * test if no exceptions were thrown as well as which
	 * email was the sentFrom().
	 * 
	 * I believe there will be no exceptions thrown and the
	 * second email will be email in the setFrom() instead
	 * of the first.
	 * 
	 * Expected result: pass, second email present
	 */
	@Test
	public void testSetFrom3() {
		Email email = new SimpleEmail();
		String testEmailAddress = "Stuskoski@gmail.com";
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		try {
			email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
			email.setFrom(testEmailAddress); //2nd call to the function.
			email.setSubject("Test Email");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("Stuskoski@yahoo.com");
			email.send();
			assertTrue(email.getFromAddress().toString().equals(testEmailAddress));
		} catch (EmailException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		}
	}
	
	
	/**
	 * testSetFrom4 will expand a little further on the findings of 
	 * testSetFrom3.  I will put the setFrom is a large loop that will
	 * constantly change the setFrom address.  Assume all the emails
	 * changed in the loop are valid. I will then compare the last
	 * email in setFrom() to what it should be.
	 * 
	 * The forloop will simply append a series of numbers to the email
	 * "Stuskoski@gmail.com".
	 * 
	 * The test will pass if the setFrom() email is the correct email
	 * i.e the last one, and no exceptions were thrown.
	 * The test will fail otherwise.
	 * 
	 * Expected result: pass, email is what is should be.
	 */
	@Test
	public void testSetFrom4() {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		try {
			for(int i=0; i<500; i++){
				email.setFrom("Stuskoski"+i+"@gmail.com");
			}
			email.setSubject("Test Email");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("Stuskoski@yahoo.com");
			email.send();
			assertTrue(email.getFromAddress().toString().equals("Stuskoski499@gmail.com"));
		} catch (EmailException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
		}
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
	 * testAddReplyTo1 will test the correct usage of 
	 * the function addReplyTo().  I pass a valid email 
	 * address:
	 * "Stuskoski@gmail.com" and a valid name:
	 * "Augustus"
	 * to the function which will be added as a reply 
	 * address to the email contents.
	 * 
	 * The test will pass if all goes well and no errors
	 * are thrown. I also test if the correct email address/name
	 * are on the replyTo list by reading the email and
	 * checking the property. 
	 * The test will fail if the sending fails or if any
	 * exceptions are thrown during execution.
	 * 
	 * I expect the test to pass with no exceptions thown.
	 */
	@Test
	public void testAddReplyTo1() {
		Mailbox.clearAll();
        try {
        	String emailTest = "Stuskoski@gmail.com";
        	String nameTest = "Augustus";
        	Email email = new SimpleEmail();
        	email.setHostName("gmail.com");
        	email.setFrom("Stuskoski@gmail.com");
        	email.setSubject("Test Email");
        	email.setMsg("This is a test mail ... :-)");
        	email.addTo("Stuskoski@yahoo.com");
        	email.addReplyTo(emailTest, nameTest);
        	assertTrue(email.getReplyToAddresses().get(0).toString().equals(nameTest+" <"+emailTest+">"));
        	email.send();
		} catch(Exception e) {
			fail("Exception thrown. "+ e.getMessage());
		}

        try {
			List<Message> inbox = Mailbox.get("Stuskoski@yahoo.com");
			
			//if inbox size is 0 then the email did not send correctly
			//or was not received correctly
			if(inbox.size() > 0) {
				//do nothing
			}else{
				fail("Msg not sent/received");
			}
		} catch (Exception e) {
			fail("Exception thrown. "+ e.getMessage());
		}
	}
	
	/**
	 * testAddReplyTo2 will test the exception throwing
	 * capability of addReplyTo().  In the documentation,
	 * it states that the function will throw an EmailException
	 * with an incorrect email address.
	 * 
	 * I pass an invalid email address:
	 * "Stuskoski"
	 * to the function to test if an exception is thrown.
	 * 
	 * The test will pass if the correct exception is thrown.
	 * The test will fail if the send goes through and no
	 * exceptions are thrown during execution.
	 * 
	 * Expected Result: Pass, exception thrown
	 */
	@Test(expected = EmailException.class)
	public void testAddReplyTo2() throws EmailException{
		Mailbox.clearAll();
        	String emailTest = "Stuskoski";
        	String nameTest = "Augustus";
        	Email email = new SimpleEmail();
        	email.setHostName("gmail.com");
        	email.setFrom("Stuskoski@gmail.com");
        	email.setSubject("Test Email");
        	email.setMsg("This is a test mail ... :-)");
        	email.addTo("Stuskoski@yahoo.com");
        	email.addReplyTo(emailTest, nameTest);
        	email.send();
        	fail("No exception thrown, send went through.");
        try {
			List<Message> inbox = Mailbox.get("Stuskoski@yahoo.com");
			
			//if inbox size is 0 then the email did not send correctly
			//or was not received correctly
			if(inbox.size() > 0) {
				//do nothing
			}
		} catch (Exception e) {
			fail("Wrong exception thrown. "+ e.getMessage());
		}
	}

	/**
	 * testAddHeader1 tests the correct functionality of testAddHeader().
	 * I pass a valid name, value to the function to correctly add
	 * the header to the email.
	 * I then send the email and wait for it in the inbox.  Once the email
	 * has arrived, I use getHeader(name) for the email and check if it is
	 * not null.
	 * 
	 * The test will pass as long as the value returned from getHeader(name) 
	 * is not null meaning that a header was found in the email.  The function
	 * returns null if no header is found.
	 * The test will fail if no header is found or if any exceptions are
	 * thrown during execution.
	 * 
	 * Expected result: Pass, header correctly added.
	 */
	@Test
	public void testAddHeader1() {
		Mailbox.clearAll();
		String valueTest = "Stuskoski@gmail.com";
    	String nameTest = "Augustus";
        try {
        	
        	Email email = new SimpleEmail();
        	email.setHostName("gmail.com");
        	email.setFrom("Stuskoski@gmail.com");
        	email.setSubject("Test Email");
        	email.setMsg("This is a test mail ... :-)");
        	email.addTo("Stuskoski@yahoo.com");
        	email.addHeader(nameTest, valueTest); //test
        	email.send();
		} catch(Exception e) {
			fail("Exception thrown. "+ e.getMessage());
		}

        try {
			List<Message> inbox = Mailbox.get("Stuskoski@yahoo.com");
			
			//if inbox size is 0 then the email did not send correctly
			//or was not received correctly
			if(inbox.size() > 0) {
				assertTrue(inbox.get(0).getHeader(nameTest) != null);
			}else{
				fail("Msg not sent/received");
			}
		} catch (Exception e) {
			fail("Exception thrown. "+ e.getMessage());
		}
	}
	
	
	/**
	 * testAddHeader2 tests the exception throwing capabilities
	 * of the addHeader() function call.  According to the documentation
	 * an IllegalArguementException is thrown if either name or value is 
	 * null or empty. (All cases tested further down)
	 * For this test I will only add one null in the name value.
	 * 
	 * The test will pass if the expected exception is thrown.
	 * Will fail if no exception is thrown.
	 * 
	 * Expected result: pass, exception thrown correctly.
	 * @throws EmailException 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testAddHeader2() throws EmailException,  IllegalArgumentException{
		Mailbox.clearAll();
		String nameTest = null;
		String valueTest = "Stuskoski@gmail.com"; 	
        	Email email = new SimpleEmail();
        	email.setHostName("gmail.com");
        	email.setFrom("Stuskoski@gmail.com");
        	email.setSubject("Test Email");
        	email.setMsg("This is a test mail ... :-)");
        	email.addTo("Stuskoski@yahoo.com");
        	email.addHeader(nameTest, valueTest); //test
        	email.send();
	}
	
	/**
	 * testAddHeader3 tests the exception throwing of
	 * the addHeader() function.
	 * Documentation states an IllegalArgumentException
	 * is thrown if name or value is either null or
	 * empty in addHeader().
	 * 
	 * For this test I test if name being empty
	 * will throw the correct exception.
	 * 
	 * The test will pass if the correct exception is thrown
	 * and will fail if otherwise.
	 * 
	 * Expected result: Pass, IllegalArgumentException thrown
	 * 
	 * @throws EmailException
	 * @throws IllegalArgumentException
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testAddHeader3() throws EmailException,  IllegalArgumentException{
		Mailbox.clearAll();
		String nameTest = "";
		String valueTest = "Stuskoski@gmail.com"; 	
        	Email email = new SimpleEmail();
        	email.setHostName("gmail.com");
        	email.setFrom("Stuskoski@gmail.com");
        	email.setSubject("Test Email");
        	email.setMsg("This is a test mail ... :-)");
        	email.addTo("Stuskoski@yahoo.com");
        	email.addHeader(nameTest, valueTest); //test
        	email.send();
	}
	
	/**
	 * testAddHeader4() tests one of the last two remaining
	 * value cases leftover for the addHeader() function.
	 * 
	 * This test will see if the correct exception is thrown
	 * if the value variable is null.
	 * 
	 * Test will pass if IllegalArgumentException is thrown
	 * and will fail otherwise.
	 * 
	 * Expected result: 
	 * @throws EmailException
	 * @throws IllegalArgumentException
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testAddHeader4() throws EmailException,  IllegalArgumentException{
		Mailbox.clearAll();
		String nameTest = "Augustus";
		String valueTest = null; 	
        	Email email = new SimpleEmail();
        	email.setHostName("gmail.com");
        	email.setFrom("Stuskoski@gmail.com");
        	email.setSubject("Test Email");
        	email.setMsg("This is a test mail ... :-)");
        	email.addTo("Stuskoski@yahoo.com");
        	email.addHeader(nameTest, valueTest); //test
        	email.send();
	}
	
	
	/**
	 * testAddHeader5 the last of the tests for addHeader().
	 * This test will check the last value case for addHeader()
	 * in which value will be an empty string.
	 * 
	 * The test passes if the correct exception is thrown
	 * (IllegalArgumentException) and will fail if any
	 * other case happens.
	 * 
	 * Expected result: Pass, IllegalArgumentException thrown.
	 * @throws EmailException
	 * @throws IllegalArgumentException
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testAddHeader5() throws EmailException,  IllegalArgumentException{
		Mailbox.clearAll();
		String nameTest = "Augustus";
		String valueTest = ""; 	
        	Email email = new SimpleEmail();
        	email.setHostName("gmail.com");
        	email.setFrom("Stuskoski@gmail.com");
        	email.setSubject("Test Email");
        	email.setMsg("This is a test mail ... :-)");
        	email.addTo("Stuskoski@yahoo.com");
        	email.addHeader(nameTest, valueTest); //test
        	email.send();
	}

	/**
	 * testBuildMimeMessage1 tests the exception throwing capability
	 * of buildMimeMessage().  Documentation states that if the 
	 * MimeMessage was already built an IllegalStateException
	 * will be thrown.
	 * 
	 * With the MimeMessage built prior, in this test I will call
	 * buildMimeMessage() with the intention of purposefully causing
	 * an IllegalStateException to be thrown.
	 * 
	 * The test will pass if the correct exception is thrown.
	 * The test will fail if the wrong exception is thrown or if
	 * sending completes with no exceptions being thrown at all.
	 * 
	 * Expected result:  Well this one is a bit confusing since
	 * documentation is vague but I believe the correct exception
	 * will be thrown. Pass.
	 */
	@Test(expected = IllegalStateException.class)
	public void testBuildMimeMessage1() throws EmailException, IllegalStateException{
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("augustusrutkoskisoftwarevalid@gmail.com", "softwareValid"));
		email.setSSLOnConnect(true);
		email.setFrom("augustusrutkoskisoftwarevalid@gmail.com");
		email.setSubject("Test Email");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("Stuskoski@yahoo.com");
		email.buildMimeMessage();
		email.send();
		fail("No exception thrown.");
	}
	
	/**
	 * testBuildMimeMessage2 is meant to test the other exception
	 * throwing for buildMimeMessage().  This test expects an
	 * EmailException instead of IllegalStateException.
	 * I call buildMimeMessage() before any of the email details
	 * are passed to cause an EmailException to be thrown.
	 * 
	 * The test will pass if an EmailException is thrown.
	 * The test will fail if no exception is thrown or if
	 * the wrong exception is thrown.
	 * 
	 * Expected result: Pass, correct exception thrown.
	 * @throws EmailException
	 * @throws IllegalStateException
	 */
	@Test(expected = EmailException.class)
	public void testBuildMimeMessage2() throws EmailException, IllegalStateException{
		Email email = new SimpleEmail();
		email.buildMimeMessage();
		email.setHostName("gmail.com");
		email.setFrom("Stuskoski@gmail.com");
		email.setSubject("Test Email");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("Stuskoski@yahoo.com");
		email.send();
		fail("No exception thrown.");
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
	 * testSend4 tests the correct functionality of the
	 * send() function again but in more detail.
	 * Send returns the message id of the sent email
	 * so I simply check if that message id matches the
	 * actual message id pulled from the email itself.
	 * 
	 * The test will pass if the two values match and no
	 * exceptions are thrown.
	 * The test will fail if any exception is thrown or
	 * the message is unable to send.
	 * 
	 * Expected result: pass, values will match
	 * 
	 * @throws MessagingException
	 */
	@Test
	public void testSend4() {
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
			assertTrue(email.send().equals(email.getMimeMessage().getMessageID()));
			//assertFalse(email.send().isEmpty());
		} catch (EmailException | MessagingException e) {
			fail("Send failed, exception thrown. " + e.getMessage());
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
			
			for(int i=0; i<5000; i++){//5000
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
				for(int i=0; i<5000; i++){//5000
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
			assertTrue(email.getHostName().length() > 0);
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
	 * testGetHostName3 tests if getHostName() will
	 * get the correct host name if multiple set hosts
	 * are called.
	 * For this test I will call multiple set host functions
	 * and eventually call getHostName().  getHostName() should
	 * return the last hostname set.
	 * 
	 * The test will pass if the two values match.
	 * The test will fail if the two values don't match or
	 * any exceptions are thrown.
	 * 
	 * Expected result: pass, values match
	 */
	@Test
	public void testGetHostName3() {
		Email email = new SimpleEmail();
		String host = "smtp.gmail.com";
		email.setHostName("test1@test.com");
		email.setHostName("test2@test.com");
		email.setHostName("test3@test.com");
		email.setHostName("test4@test.com");
		email.setHostName("test5@test.com");
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
	 * testGetSocketConnectionTimeout1 tests the general functionality
	 * of getSocketConnectionTimeout().  The function is a simple getter
	 * that returns the timeout of the socket as an int.
	 * This test will check that the return value is an integer.
	 * I cast the original value to Integer since int->Integer
	 * and assertTrue that it is an instanceof Integer.
	 * 
	 * The test will pass as long as some int is returned with
	 * the function call and will fail otherwise or if some
	 * exception is thrown during execution.
	 * 
	 * Expected result: pass, function will return an int that
	 * is casted to an Integer
	 */
	@Test
	public void testGetSocketConnectionTimeout1() {
		Mailbox.clearAll();
        try {
        	Email email = new SimpleEmail();
        	email.setHostName("gmail.com");
        	email.setFrom("Stuskoski@gmail.com");
        	email.setSubject("Test Email");
        	email.setMsg("This is a test mail ... :-)");
        	email.addTo("Stuskoski@yahoo.com");
        	assertTrue((Integer)email.getSocketConnectionTimeout() instanceof java.lang.Integer);
        	email.send();
		} catch(Exception e) {
			fail("Exception thrown. "+ e.getMessage());
		}
	}
	
	/**
	 * testGetSocketConnectionTimeout2 tests the default value 
	 * set for socket timeouts.  According to the documentation
	 * the default time set is 60 seconds but the function returns
	 * the int value in terms of milliseconds:
	 * 60sec = 60000ms
	 * 
	 * The test will pass if the int passed back after the function
	 * call is 60000 and none else.
	 * The test will fail if the default value is not 60000ms or if
	 * any exceptions arise during execution.
	 * 
	 * Expected result: Pass, default value is 60000 since socketTimeout
	 * is not set anywhere else.
	 */
	@Test
	public void testGetSocketConnectionTimeout2() {
		Mailbox.clearAll();
        try {
        	Email email = new SimpleEmail();
        	email.setHostName("gmail.com");
        	email.setFrom("Stuskoski@gmail.com");
        	email.setSubject("Test Email");
        	email.setMsg("This is a test mail ... :-)");
        	email.addTo("Stuskoski@yahoo.com");
        	assertTrue(email.getSocketConnectionTimeout() == 60000);
        	email.send();
		} catch(Exception e) {
			fail("Exception thrown. "+ e.getMessage());
		}
	}
	
	
	/**
	 * testGetSocketConnectionTimeout3 tests the correct functionality
	 * of getSocketConnectionTimeout() again but in a different way.
	 * In this test I set a socket timeout with setSocketConnectionTimeout
	 * with the variable int testMS = 10000.
	 * I then test if getSocketConnectionTimeout() returns the same value
	 * testMS and assertTrue.
	 * 
	 * The test will pass if the timeout time was set and returned in the
	 * same condition.
	 * The test fails if the two values are not equal and if any exceptions
	 * are thrown during execution.
	 * 
	 * Expected result: pass, the two values will match after the set and get.
	 */
	@Test
	public void testGetSocketConnectionTimeout3() {
		Mailbox.clearAll();
        try {
        	int testMS = 10000;
        	Email email = new SimpleEmail();
        	email.setHostName("gmail.com");
        	email.setFrom("Stuskoski@gmail.com");
        	email.setSubject("Test Email");
        	email.setMsg("This is a test mail ... :-)");
        	email.addTo("Stuskoski@yahoo.com");
        	email.setSocketConnectionTimeout(testMS);
        	assertTrue(email.getSocketConnectionTimeout() == testMS);
        	email.send();
		} catch(Exception e) {
			fail("Exception thrown. "+ e.getMessage());
		}
	}

}
