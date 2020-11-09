/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * i chose products and gave them a number 
 * @author David J. Barnes and Michael Kölling.
 * @version 09/11/2020
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     * I added products and gave them numbers
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        
        manager.addProduct(new Product(101, "lexus 2020"));
        manager.addProduct(new Product(102,  "Range rover 2020"));
        manager.addProduct(new Product(103,  "Vauxhall 2020"));
        manager.addProduct(new Product(104, "Toyota 2020"));
        manager.addProduct(new Product(105,  "Tesla 2020"));
        manager.addProduct(new Product(106,  "Bmw M3"));
        manager.addProduct(new Product(107, "Volvo 2020"));
        manager.addProduct(new Product(108,  "Mercedes Amg"));
        manager.addProduct(new Product(109,  "Nissan 2020"));
        manager.addProduct(new Product(110,  "Porsche cayane 20"));
        
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     * 
     */
    public void demoDelivery()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        // Take delivery of 10 items of one of the products.
        manager.delivery(101, 5);
        manager.delivery (102, 6);
        manager.delivery (103, 3);
        manager.delivery(104, 7);
        manager.delivery (105, 4);
        manager.delivery(106, 3);
        manager.delivery (107, 10);
        manager.delivery(108, 16);
        manager.delivery (109, 1);
        manager.delivery (110, 9);
        manager.printAllProducts();
    }
    
    
    
   
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
