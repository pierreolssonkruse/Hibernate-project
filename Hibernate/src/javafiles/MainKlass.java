package javafiles;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainKlass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		KlassKamrat pierre = new KlassKamrat();
		pierre.setId(2);
		pierre.setFname("Pierre");
		pierre.setLname("Olsson Kruse");
		pierre.setHobby("kissa kiss");
		pierre.setBirthYear(1982);
		pierre.setMobile(7001);
		
		s.save(pierre);
		s.flush();
		tx.commit();
		s.close();

	}

}
