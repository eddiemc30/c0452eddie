
/**
 * Write a description of class Program here.
 *this is where the static stockapp 
 * @author (eddie mccreadie)
 * @version (07/12/2020)
 */
public class Program
{
    private static StockApp app;

    /**
     * This class creates and runs an instance of
     * the StockApp class
     */
    public static void main()
    {
        app = new StockApp();
        app.run();
    }
}
