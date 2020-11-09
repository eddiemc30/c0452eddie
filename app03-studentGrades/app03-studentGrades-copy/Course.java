
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
private String codeNo;
private String title;

private Module module1;
private Module module2;
private Module module3;
private Module module4;
    
/**
     * Constructor for objects of class Course
     */
    public Course(String title, String codeNo)
    {
        this.codeNo = codeNo;
        this.title = title;
    }
public void addmodule (Module module, int moduleNo)
{
    if(moduleNo == 1)
this.Module1 = module1;
this.Module2 = module2;
this.Module3 = module3;
this.Module4 = module4;

}
 }