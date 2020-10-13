import java.util.Date;
/**
 * Write a description of class Ticket3 here.
 *this is a description of Amersham ticket 
 * @author (eddie mccreadie)
 * @version (12/10/2020)
 */
public class Ticket3
{
 //Attributes
        
 private String destination;
        
 private int price;
        
 private Date issueDateTime;
 /**
     * Constructor for objects of class Ticket3 setting 
     * the destination and price. The date will contain 
     * the current system date and time 
     */
    public Ticket3(String destination, int price)
    
  {
  this.destination = destination;
  this.price = price;
    
    
  issueDateTime = new Date();
  }
  
  /**
   * 
   */
  public void print()
      {
     System.out.println("Ticket  "  +  destination + " Price ; " +
          " issued " + i ssueDateTime);
   
      }
    }  
