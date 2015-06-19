package com.gae.datastore;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

@SuppressWarnings("serial")
public class GAEDatastoreServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
			
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();		
		Query q = new Query();
		PreparedQuery pq = ds.prepare(q);
		req.setAttribute("pq",pq);
		
		RequestDispatcher rq = req.getRequestDispatcher("listado.jsp");
		try {
			rq.forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
