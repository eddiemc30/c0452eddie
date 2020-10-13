import java.util.Date;
/**
 * Write a description of class Ticket2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket2

{
   //Attributes
   private String destination;
   
   private int price;
   
   private Date  issueDateTime;
   

    
   /**
     * Constructor for objects of class Ticket2 setting 
     * the destination and price. The date will contain 
     * the current system date and time. 
     */
    public Ticket2(String destination, int price)
   
    
   {
     this.destination = destination;
     this.price = price;
     
     
     issueDateTime = new Date(); 
   }
   
   public void print()
   { 
     System.out.println("Ticket  " + destination  + 
             
             "Price :  " + price + 
             " Issued  " + issueDateTime);
   }
 
}