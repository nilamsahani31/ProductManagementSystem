package com.nilam.product.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProviderUtil {
	
	private static SessionFactory factory = null;
	
	public static SessionFactory getFactoryProvider() {
			
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory factory = cfg.buildSessionFactory();
			return factory;
			
	}
	public static void closeFactory() {
		if(factory!=null) {
		  factory.close();
			
		}
	}

}
