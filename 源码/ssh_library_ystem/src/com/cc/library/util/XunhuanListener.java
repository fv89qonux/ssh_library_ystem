package com.cc.library.util;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.cc.library.dao.BookDao;
import com.cc.library.dao.impl.BookDaoImpl;
import com.cc.library.domain.Book;
import com.cc.library.domain.PageBean;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class XunhuanListener implements ServletContextListener{
	private static SessionFactory factory;  
	
	public void contextInitialized(ServletContextEvent arg0) {
		Timer timer=new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				Configuration cfg=new Configuration().configure("hibernate/hibernate.cfg.xml");  
				//建立SessionFactory  
				factory = cfg.buildSessionFactory();  
				Session session = factory.openSession();
				String sql = "SELECT count(*) FROM Book";
				List list = session.createQuery(sql).list();
				session.close();
				factory.close();
			
			}
		},1000,2000);


	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

}