package com.example.maven.hibernate.HibernateAnnotationMappingExample;

import org.hibernate.Session;



/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        Stock stock = new Stock();

        stock.setStockCode("0002");
        stock.setStockName("two");

        session.save(stock);
        session.getTransaction().commit();
    }
}
