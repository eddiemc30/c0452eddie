/**
 * Representations for all the valid command words for the game
 * along with a string in a particular language.
 * 
 * @author  eddie mccreadie
 * @version 25.01.21
 */
public enum CommandWord
{
    // A value for each command word along with its
    // corresponding user interface string.
       GO("go"), QUIT("quit"), HELP("help"), UNKNOWN("?"), PICK("pick"), SHOW("show"), GOAL("goal"),DRINK("drink");
    
    // The command string.
    private String commandString;
    
    /**
     * Initialise with the corresponding command string.
     * @param commandString The command string.
     */
    CommandWord(String commandString)
    {
        this.commandString = commandString;
    }
    
    /**
     * @return The command word as a string.
     */
    public String toString()
    {
        return commandString;
    }
}
