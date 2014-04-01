package com.za.tutorial.ajax;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AjaxServlet03")
public class AjaxServlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
    String topicName = request.getParameter("topicName");
  
    if(topicName != null){
       response.setContentType("text/html");
       response.getWriter().write(generateJSONData(topicName));
     
    }
   }
   public String generateJSONData(String topicName) {
	   StringBuffer returnData = null;
	   if (topicName.equals("java")) {
		   returnData = new StringBuffer("{\"topic\":{");
		   returnData.append("\"name\": \"JAVA\",");
		   returnData.append("\"tutorial\": [");
		   returnData.append("{\"name\": \"Introduction to java socket\"},");
		   returnData.append("{\"name\": \"Introduction to RMI\"},");
		   returnData.append("{\"name\": \"equals method\"}]");
		   returnData.append("}}");
        } else if (topicName.equals("oodp")) {
		   returnData = new StringBuffer("{\"topic\":{");
		   returnData.append("\"name\": \"JAVA\",");
		   returnData.append("\"tutorial\": [");
		   returnData.append("{\"name\": \"FactoryMethod\"},");
		   returnData.append("{\"name\": \"Abstarct Factory\"},");
		   returnData.append("{\"name\": \"Singlrton\"},");
		   returnData.append("{\"name\": \"Command\"}]");
		   returnData.append("}}");
	   } else{
		   returnData = new StringBuffer("{\"topic\":{");
		   returnData.append("\"name\": \"Topic: "+topicName+"\", ");
		   returnData.append("\"tutorial\": [");
		   returnData.append("{\"name\": \"no tutroaila found\"}]");
		   returnData.append("}}");
	   }
	   
	   return returnData.toString();
	   
   }
   
   
   }

