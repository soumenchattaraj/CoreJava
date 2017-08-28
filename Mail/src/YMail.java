
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/*
 * yahoo mail is working.
 * gmail is not working authentication problem.
 * turn off the antivirus ex.avast else throwing error(yet to fig. out why???)
*/
public class YMail {

	public static void main(String[] args) {
	
		    String ghost, port, emailid,username, password,yhost;
		    Properties props = System.getProperties();
		    Session l_session = null;

		 
		        yhost = "smtp.mail.yahoo.com";
		        ghost = "smtp.gmail.com";
		        port = "587";
		        emailid = "****@yahoo.in";
		        username = "*****";
		        password = "*****";

		      
		        props.put("mail.smtp.starttls.enable", "true");
		        props.put("mail.smtp.host", yhost);
		        props.put("mail.smtp.auth","true");
		        props.put("mail.debug", "false");
		        props.put("mail.smtp.port", port);
		      
		        //props.put("mail.TLS", "true");
		      

		  

		        l_session = Session.getInstance(props,
		                new javax.mail.Authenticator() {
		                    protected PasswordAuthentication getPasswordAuthentication() {
		                        return new PasswordAuthentication(username, password);
		                    }
		                });

		        l_session.setDebug(true); // Enable the debug mode

		   
		        try {
		            //System.out.println("Sending Message *********************************** ");
		            MimeMessage message = new MimeMessage(l_session);
		           
		            //System.out.println("mail id in property ============= >>>>>>>>>>>>>> " + emailid);
		            //message.setFrom(new InternetAddress(emailid));
		            message.setFrom(new InternetAddress(emailid));

		            message.addRecipient(Message.RecipientType.TO, new InternetAddress("******@gmail.com"));
		          //  message.addRecipient(Message.RecipientType.BCC, new InternetAddress(AppConstants.fromEmail));
		            message.setSubject("hello test mail");
		            message.setContent("this is a test mail from yahoo!", "text/html");

		            
		            Transport.send(message);
		            System.out.println("Message Sent");
		        } catch (MessagingException mex) {
		            mex.printStackTrace();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }

		}



}
