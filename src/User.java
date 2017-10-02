/***
 * 
 * @author Elias Haroun
 *
 */
public class User
{
    private String name;
    
    /***
     * Hidden default constructor
     */
    @SuppressWarnings("unused")
    private User()
    {
    }
    
    /***
     * Parameterized constructor
     * @param name
     */
    public User(final String name)
    {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
