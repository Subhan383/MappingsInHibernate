package com.org.mappings.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DoctorMain {

	public static void main(String[] args) {

		SessionFactory factory = getSessionFactory();
		Session session = factory.getCurrentSession();
		Transaction trans = session.beginTransaction();

		Patient patient = new Patient();
		patient.setPatientId(83);
		patient.setPatientName("Vamsi");

		Doctor doc = new Doctor();
		doc.setDoctorId(383);
		doc.setName("Sailaja");
		doc.setAddress("Chennai");
		doc.setPatient(patient);

		DoctorSpeciality speciality = new DoctorSpeciality();
		speciality.setDoctor(doc);
		speciality.setSkillId(23);
		speciality.setSpecialityFee(10000);
		speciality.setSpecialityName("Cardialogist");

		session.save(doc);
		session.save(speciality);
		session.save(patient);
		trans.commit();

	}

	private static SessionFactory getSessionFactory() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		return factory;
	}

}
