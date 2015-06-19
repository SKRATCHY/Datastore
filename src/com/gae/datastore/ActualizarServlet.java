package com.gae.datastore;


import java.io.IOException;




import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

@SuppressWarnings("serial")
public class ActualizarServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException,ServletException {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Query q = new Query();
		PreparedQuery pq = ds.prepare(q);
		for(Entity e1:pq.asIterable()){			
			if(e1.getProperty("ID").toString().equals(req.getParameter("IDoriginal").toString())){
				e1.setProperty("ID", req.getParameter("ID"));
				e1.setProperty("Nombre", req.getParameter("Nombre"));
				e1.setProperty("Apellido", req.getParameter("Apellido"));
				e1.setProperty("Edad", req.getParameter("Edad"));
				e1.setProperty("Email", req.getParameter("Email"));
				ds.put(e1);
			}
			
			
		}
		
		
		
	}
}
