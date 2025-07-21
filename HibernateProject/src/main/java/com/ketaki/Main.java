package com.ketaki;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//            Student s1 = new Student();
//            s1.setsName("PQR");
//            s1.setRollNo(6);
//            s1.setsAge(18);

//            Configuration cfg = new Configuration();
//            cfg.addAnnotatedClass(com.ketaki.Student.class);
//            cfg.configure();

            //**********************************Create table and store values*************************************************
           /* SessionFactory sf= new Configuration().addAnnotatedClass(com.ketaki.Student.class).configure().buildSessionFactory();//cfg.buildSessionFactory();
            Session session= sf.openSession();

            Transaction transaction = session.beginTransaction();
            session.persist(s1);

            transaction.commit();

            session.close();
            sf.close();
            System.out.println(s1);*/

            //Get the data
            /*Student s2 = new Student();

            SessionFactory sf= new Configuration().addAnnotatedClass(com.ketaki.Student.class).configure().buildSessionFactory();//cfg.buildSessionFactory();
            Session session= sf.openSession();

            s2= session.get(Student.class,1);

            session.close();
            sf.close();
            System.out.println(s2);*/

//***********************************************Update or Delete*****************************************************

//            SessionFactory sf= new Configuration().addAnnotatedClass(com.ketaki.Student.class).configure().buildSessionFactory();//cfg.buildSessionFactory();
//            Session session= sf.openSession();
//
//            Transaction transaction =session.beginTransaction();

            //*************************************************Save or update*******************************************
            //session.merge(s1);
            //**********************************************Get and delete********************************************
//            Student s2 = new Student();
//            s2=session.get(Student.class,6);
//            session.remove(s2);
//
//            transaction.commit();
//            session.close();
//            sf.close();
//            System.out.println(s1);

            //***************************************Mappings One to One , One to Many and Many to one , Many to Many********************
//            Laptop l1 = new Laptop();
//            l1.setLid(1);
//            l1.setBrand("Dell");
//            l1.setModel("Inspiron");
//            l1.setRam(16);
//
//            Laptop l2 = new Laptop();
//            l2.setLid(2);
//            l2.setBrand("Asus");
//            l2.setModel("Rog");
//            l2.setRam(16);
//
//            Laptop l3 = new Laptop();
//            l3.setLid(3);
//            l3.setBrand("Apple");
//            l3.setModel("Macbook Air");
//            l3.setRam(8);
//
//            Person p1 = new Person();
//            p1.setPid(1);
//            p1.setPname("Ketaki");
//            p1.setTech("Java");
            //p1.setLaptop(l1);
            //p1.setLaptops(Arrays.asList(l1,l2));

//            Person p2 = new Person();
//            p2.setPid(2);
//            p2.setPname("Cat");
//            p2.setTech("Python");
            //p1.setLaptop(l1);

//            Person p3 = new Person();
//            p3.setPid(3);
//            p3.setPname("Meow");
//            p3.setTech("JavaScript");
            //p1.setLaptop(l1);

//            p1.setLaptops(Arrays.asList(l1,l2));
//            p2.setLaptops(Arrays.asList(l2,l3));
//            p3.setLaptops(Arrays.asList(l1));
            //l1.setPerson(p1);
            //l2.setPerson(p1);

//            l1.setPersons(Arrays.asList(p1,p3));
//            l2.setPersons(Arrays.asList(p1,p2));
//            l3.setPersons(Arrays.asList(p2));

//            p1.setLaptops(Arrays.asList(l1,l2));
//            p2.setLaptops(Arrays.asList(l3));

            //SessionFactory sf= new Configuration().addAnnotatedClass(com.ketaki.Person.class).configure().buildSessionFactory();//cfg.buildSessionFactory();
//           SessionFactory sf= new Configuration().addAnnotatedClass(com.ketaki.Person.class).addAnnotatedClass(com.ketaki.Laptop.class).configure().buildSessionFactory();
//            Session session= sf.openSession();
//
//            Transaction transaction =session.beginTransaction();
//
//            session.persist(l1);
//            session.persist(l2);
//            session.persist(l3);
//
//            session.persist(p1);
//            session.persist(p2);
            //session.persist(p3);

//            transaction.commit();

            //Person p2= session.get(Person.class,1);
           // System.out.println(p2);

           // Person p4= session.get(Person.class,2);
            //System.out.println(p4);

//            session.close();
//
//            Session session1= sf.openSession();
//
//            Person p4= session1.get(Person.class,2);
//            System.out.println(p4);
//
//            session1.close();
//            sf.close();

            //**********************HQL****************************************

//            SessionFactory sf= new Configuration().addAnnotatedClass(com.ketaki.Laptop.class).configure().buildSessionFactory();
//            Session session= sf.openSession();

//            //SQL:-  select * from laptop where ram=16
//            //HQL :- from Laptop where ram =16

            //Query q= session.createQuery("from Laptop where ram =16");
//        String brand="Dell";
//        Query q=  session.createQuery("from Laptop where brand like ?1");
//        q.setParameter(1,brand);
//        List<Laptop> laptops= q.getResultList();

//        Query q=  session.createQuery("select model from Laptop where brand like ?1");
//        q.setParameter(1,brand);
//        List<String> laptops= q.getResultList();
//        System.out.println(laptops);

//        Query q=  session.createQuery("select brand, model from Laptop where brand like ?1");
//        q.setParameter(1,brand);
//         List<Object[]> laptops= q.getResultList();
//
//         for (Object[] data : laptops){
//             System.out.println((String)data[0]+" "+(String)data[1]);
//         }

//          Laptop l1 =session.get(Laptop.class,1);
//        Laptop l1 =session.byId(Laptop.class).getReference(1);
//        System.out.print(l1);

//        session.close();
//        sf.close();
//**************L2 cache implementation using Ehcache*************************

        SessionFactory sf= new Configuration().addAnnotatedClass(com.ketaki.Laptop.class).configure().buildSessionFactory();
        Session session= sf.openSession();

        Laptop l1 =session.get(Laptop.class,1);
        System.out.println(l1);

        session.close();

        Session session1 = sf.openSession();

        Laptop l2 =session1.get(Laptop.class,1);
        System.out.println(l2);

        session1.close();
        sf.close();


        }
}
