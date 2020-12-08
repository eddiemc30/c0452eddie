
 
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 * it helps identify the 
 * @author eddie mccreadie 
 * @version 0.1
 */
public class StockApp
{
 public static final char CLEAR_CODE = '\u000C' ;
    
 public static final String QUIT = "quit";  
 public static final String ADD = "add"; 
 public static final String PRINT_All = "printall";  
  
 // Use to get user inpu
 private InputReader input = new InputReader();
 
 private StockManager manager = new StockManager();
 
 private StockDemo demo = new StockDemo(manager);
    
 
 /**
  * 
  */
  public void run()
 {
 
        boolean finished = false;
        
        while(!finished)
        {
           printHeading();
           printMenuChoices();
           
           
           String choice = input.getString().toLowerCase();
           
           
           if(choice.equals(QUIT))
           
               finished = true;
            else    
                executeMenuChoice(choice);
            }
   }
 
private void executeMenuChoice(String choice)
 {
  if (choice.equals(ADD)) 
   {
       addProduct();
   }
   else if(choice.equals(PRINT_All))
   {
     manager.printAllProducts(); 
     String Value = input.getString();
  }
}


private void addProduct()
 { 
    System.out.println("Adding new product\n");
     
    System.out.println("Please enter the product Id");
    String value = input.getString();
    int Id = Integer.parseInt(value);
     
    System.out.println("Please enter the name of the product");
    String name = input.getString();
    
    Product product = new Product(Id,  name);
    manager.addProduct(product);
    System.out.println("\n you have added" + product) ;
    System.out.println();
 }

 
/** this is used to print menu choices by adding a product, removing a product and to quit the program 
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    
/**this is the information of stock management application where the student name is required 
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by eddie mccreadie");
        System.out.println("******************************");
    }
}

