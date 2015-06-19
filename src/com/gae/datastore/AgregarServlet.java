package com.gae.datastore;


import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@SuppressWarnings("serial")
public class AgregarServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException,ServletException {
			
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Entity en = new Entity("User", req.getParameter("ID"));
		en.setProperty("ID", req.getParameter("ID"));
		en.setProperty("Nombre", req.getParameter("Nombre"));
		en.setProperty("Apellido", req.getParameter("Apellido"));
		en.setProperty("Edad", req.getParameter("Edad"));
		en.setProperty("Email", req.getParameter("Email"));
		ds.put(en);
		
	}
}
