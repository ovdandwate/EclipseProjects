package Bitinject.com.ProjectMaven;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project" );
    //    SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Configuration cfg = new Configuration();
        cfg.configure("hibernet.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
         System.out.println(factory);
         System.out.println(factory.isClosed());
        
        
  
        
        
    }
}
