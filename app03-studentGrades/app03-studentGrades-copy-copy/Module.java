
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    //fields
    private String Title;
    
    private String codeNo;
    
    private int mark; 

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        this.codeNo = codeNo;
        this.title = title;
        mark = 0;
    }
    
    
    public void awardMark(int mark) 
    {
        this.mark = mark;
   
     
  
   }
  
}

        