package com.compbuilder.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.compbuilder.model.Cart;
import com.compbuilder.model.CompBean;

/**
 * Servlet implementation class FinalizePurchase
 */
@WebServlet("/finalize")
public class FinalizePurchase extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalizePurchase() 
    {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Cart cartBean = new Cart();
		HttpSession session = request.getSession();
		
		cartBean = (Cart) session.getAttribute("Cart");
		
		ArrayList<CompBean> itemList = cartBean.getItems();
        
        String itemListing = "";
        
        if (itemList != null)
		{
			
			for (CompBean b : itemList)
			{
				itemListing = itemListing + b.getModelName() + "\t" + b.getTotalCost() + "\n";
			}
			
		}
		
		String name = request.getParameter("name");
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");
		String creditCardOwner = request.getParameter("card-holder-name");
		String creditCardNumber = request.getParameter("card-number");
		String expirationdDate = request.getParameter("expirationdate");
		String cvv = request.getParameter("cvv");
		
		String name1 = request.getParameter("Name");
        String email = request.getParameter("email");
        String comments = request.getParameter("comments");
        final String username = "rodenstest@gmail.com";
        final String password = "Ooju9aix";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session mailsession = Session.getInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(mailsession);
            message.setFrom(new InternetAddress(email));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("rodenstest@gmail.com"));
            message.setReplyTo(InternetAddress.parse(email));
            message.setSubject("Support Email");
            message.setText(name + " has made the following purchase(s): " + itemListing + "\n" + "for a total of $" + cartBean.Total());

            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

        session.setAttribute("Cart", cartBean);
		RequestDispatcher dispatcher = getServletConfig().getServletContext().getRequestDispatcher("/confirmation.jsp");
		dispatcher.forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	
		
	}

}
