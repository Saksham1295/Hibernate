 
  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
  
public class StoreData {  
public static void main(String[] args) {  
      
    //creating configuration object  
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
     
    SessionFactory factory=cfg.buildSessionFactory();  
      
     
    Session session=factory.openSession();  
      
    Transaction t=session.beginTransaction();  
          
    Employee e1=new Employee();  
    e1.setId(115);  
    e1.setName("Sunny");  
    e1.setAge(21); 
    e1.setSalary(12000);
     
    session.persist(e1);
    t.commit();  
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
} 