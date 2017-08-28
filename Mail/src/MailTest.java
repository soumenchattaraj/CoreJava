import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailTest {

	public static void main(String[] args) {
		 String host="mail.javatpoint.com";  
		  final String user="******@gmail.com";//change accordingly  
		  final String password="******";//change accordingly  
		    
		  String to="******@gmail.com";//change accordingly  
		  
		   //Get the session object  
		   Properties props = new Properties();  
		   			  /*props.put("mail.smtp.host","smtp.gmail.com");    
		   			  props.put("mail.smtp.socketFactory.port","465");    
		   			  props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");    
		   			  props.put("mail.smtp.auth","true");    
		   			  props.put("mail.smtp.port","465");    
		   			  */
				    props.put("mail.smtp.auth", "true");
			        props.put("mail.smtp.starttls.enable", "true");
			        props.put("mail.smtp.host", "smtp.gmail.com");
			        props.put("mail.smtp.port", "587");
		   Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator()
		   {  
		      protected PasswordAuthentication getPasswordAuthentication() 
		      {  
		    	  return new PasswordAuthentication(user,password);  
		      }  
		    });  
		  
		   //Compose the message  
		    try {  
		     MimeMessage message = new MimeMessage(session);  
		     message.setFrom(new InternetAddress(user));  
		     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
		     message.setSubject("javatpoint");  
		     message.setText("This is simple program of sending email using JavaMail API");  
		       
		    //send the message  
		     Transport.send(message);  
		  
		     System.out.println("message sent successfully...");  
		   
		     } catch (MessagingException e) {e.printStackTrace();}  
		 }  

	//}

}
