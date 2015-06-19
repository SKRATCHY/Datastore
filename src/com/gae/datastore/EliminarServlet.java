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
public class EliminarServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		Query q = new Query();
		PreparedQuery pq = ds.prepare(q);
		for(Entity e1:pq.asIterable()){
			
			if(e1.getProperty("ID").toString().equals(req.getParameter("ID").toString())){
				ds.delete(e1.getKey());
			}
			
			
		}
		
		
		
	}
}
