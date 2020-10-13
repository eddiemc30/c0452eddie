import java.util.Date;
/**
 * Write a description of class Ticket here.
 *this is my first ticket modified by me 
 * @author (eddie mccreadie)
 * @version (11/10/2020)
 */ 
public class Ticket
{
   //Attributes 
    
   private String destination;
   
   private int price;
   
   private Date issueDateTime;
    
   /**
     * Constructor for objects of class, ticket setting the  
     * destination and price. The date will contain 
     * the current system date and time. 
     */
     
    public Ticket(String destination, int price)
    
   {
        this.destination = destination;
        this.price = price; 
        
         
       issueDateTime = new Date();    
    }
   /**
    * 
    *
    */
    public void print()
    {
        System.out.println("Ticket " + destination +  
             " price: " +  price +
             " Issued " + issueDateTime) ;
            
    }
    
 
          


}