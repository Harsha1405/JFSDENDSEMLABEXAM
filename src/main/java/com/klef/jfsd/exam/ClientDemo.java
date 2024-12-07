package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
	public static void main(String []args)
	{
		Configuration cfg=new Configuration();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Device d=new Device();
		d.setId(1);
		d.setBrand("Apple");
		d.setModel("2020");
		d.setPrice(123.45);
		s.save(d);
		t.commit();
		System.out.println("Device inserted");
		
		Smartphone sp=new Smartphone();
		sp.setOperatingSystem("Windows");
		sp.setCameraResolution("24 mega pixel");
		s.save(sp);
		t.commit();
		System.out.println("SmartPhone inserted");
		
		Tablet tb=new Tablet();
		tb.setScreensize(25);
		tb.setBatterylife("2 years");
		s.save(tb);
		t.commit();
		System.out.println("Tablet inserted");
		
		
	}

}
