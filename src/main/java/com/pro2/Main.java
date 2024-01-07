package com.pro2;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {
	
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Employee.class);
        
 
        // Create Session Factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
 
        
        while(true)
        {
        	System.out.println("1.AddEmployee\n2.UpdateEmployee\n3.ManagerHirarichy\n4.Resign\n5.ChangePro\n6.Exit");
        	int n=sc.nextInt();
        	
        	switch(n) 
        	{
        	case 1: // Initialize Session Object
        		System.out.println("Enter Data to Add new employee");
        		Session session = sessionFactory.openSession();
                
                System.out.println("enter id");
                int a=sc.nextInt();
                
                //check weather the id exists or not
//                Employee z=session.get(Employee.class, a);
//                if(z.getId()==a)
//                {
//                	System.out.println("Dublicate Id");
//                	System.out.println("Try again with new Id");
//                	System.exit(0);
//                }
        
                
                System.out.println("enter name");
                String b=sc.next();
                
                System.out.println("enter mail");
                String c=sc.next();
                
                System.out.println("enter desig");
                String d=sc.next();
                
                System.out.println("enter Manager");
                String e=sc.next();
                
                System.out.println("enter dep1");
                String f=sc.next();
                
                System.out.println("enter project");
                String g=sc.next();
                
                System.out.println("enter pick");
                String h=sc.next();
                
                System.out.println("enter drop");
                String i=sc.next();
                
                System.out.println("enter status");
                String j=sc.next();
                
                System.out.println("project date YYYY-MM-DD");
                String date=sc.next();
                
                Employee s1 = new Employee(a,b,c,d,e,f,g,h,i,j,date);
                session.beginTransaction();
        
                session.save(s1);
         
                session.getTransaction().commit();
                
                break;
                
        	case 2: System.out.println("Enter Id to update");
        		int k=sc.nextInt();
        		
        		Session session1 = sessionFactory.openSession(); 
                Transaction t=session1.beginTransaction();
        		
        		Employee e1=session1.get(Employee.class, k); 
        		if(e1.getId()==k && e1.getStatus().equals("active"))
        		{
        			System.out.println("Enter new details to update");
        			
        			System.out.println("Enter Name");
        			e1.setName(sc.next());
        			System.out.println("Enter eMail");
        			e1.setMail(sc.next());
        			System.out.println("Enter eDesig");
        			e1.setDesig(sc.next());
        			System.out.println("Enter Pickup");
        			e1.setPick(sc.next());
        			System.out.println("Enter Drop");
        			e1.setDrop(sc.next());
        		
        			session1.save(e1);
        			t.commit();
        			sessionFactory.close(); 
        		}
        		else
        		{
        			System.out.println("Invalid Id/ Resgsined");
        		}
                sessionFactory.close(); 
                break;
                
        	case 3: System.out.println("Enter your name show employees under you");
        	        String o=sc.next();
        	        
        	        Session session3=sessionFactory.openSession(); 
        	        Transaction t4= session3.beginTransaction();
        	        String hql="from Employee";
        	        Query q= session3.createQuery(hql);
        	        //q.setParameter(":M", o);
        	        
        	        List<Employee> result= q.list();
        	        for(Employee s4: result)
        	        {
        	        	if(s4.getMan().equals(o))
        	        	{
        	        	  System.out.println("Id : "+s4.getId()+" Name: "+s4.getName()+" Status: "+s4.getStatus());
        	        	 //System.out.println(s4);
        	        	}
        	        }
        	          
        	        //Employee s4=session3.get(Employee.class, o); 
        	        
        	        t4.commit();
        	         
        	        
        	        sessionFactory.close(); 
        	        break;
        	        
        	        
        	case 4: System.out.println("Enter Your Id to resign");
        			int d4=sc.nextInt();
        			Session session4=sessionFactory.openSession();
        			Transaction t1=session4.beginTransaction();
            		
            		Employee e4=session4.get(Employee.class, d4);
            		if(e4.getId()==d4 && e4.getStatus().equals("active"))
            		{
            			e4.setStatus("resigned");
            			System.out.println("Resigned sucussfully");
            			session4.save(e4);
            			t1.commit();
            		}
            		else
            		{
            			System.out.println("You Don't have access");
            		}
            		break;
            		
        	case 5: System.out.println("Enter your Id to Change project");
        			int k4=sc.nextInt();
        			Session session5=sessionFactory.openSession();
        			Transaction t5=session5.beginTransaction();
            		
            		Employee e5=session5.get(Employee.class, k4);
            		String d1=e5.getDate();
            		LocalDate sdf = LocalDate.parse(d1);
            		//Date dz=(Date) sdf.parse(d1);
            		
            		Period period= Period.between(sdf, LocalDate.now());
            		int mo=period.getMonths();
            		int ye=period.getYears();
            		
            		if(ye>1 || mo>=6)
            		{
                		System.out.println("Enter project Name");
                		e5.setProject(sc.next());
            			System.out.println("Enter project date in YYYY-MM-DD");
            			e5.setDate(sc.next());
            			
            			session5.save(e5);
            			t5.commit();
            			System.out.println("Data update sucussfully");
            		}
            		else
            		{
            		   System.out.println("6 months not completed in existing project");
            		}
            		break;
            		
                
        	case 6: System.exit(0);
        	break;
                
        	default: System.out.println("Invalid Choose");
        	         break;

        	}
        	
        }
	    
					
	}

}
