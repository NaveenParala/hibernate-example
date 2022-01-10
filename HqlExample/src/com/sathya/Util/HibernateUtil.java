package com.sathya.Util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
  
	private static SessionFactory factory;
	private HibernateUtil()
	{}
	public  synchronized static SessionFactory getSessionFactory()
	{
		if(factory==null){
			Configuration conf=new Configuration().configure("com/sathya/config/hibrnate.cfg.xml");
			ServiceRegistry regisrty=new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
			factory=conf.buildSessionFactory(regisrty);
		}
		return factory;
	}
}
