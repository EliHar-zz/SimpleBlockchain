import java.util.Date;

/***
 * 
 * @author Elias Haroun
 *
 */
public class Transaction
{
    private User sender;
    private User receiver;
    private long timestamp;
    private String message;
    
    /***
     * Hidden default constructor
     */
    @SuppressWarnings("unused")
    private Transaction()
    {
    }
    /***
     * Parameterized constructor
     * @param sender
     * @param receiver
     * @param timestamp
     * @param message
     */
    public Transaction(final User sender, final User receiver, final String message)
    {
        this.sender = sender;
        this.receiver = receiver;
        this.timestamp = new Date().getTime();
        this.message = message;
    }
    /**
     * @return the sender
     */
    public User getSender() 
    {
        return sender;
    }
    /**
     * @return the receiver
     */
    public User getReceiver() 
    {
        return receiver;
    }
    /**
     * @return the timestamp
     */
    public long getTimestamp() 
    {
        return timestamp;
    }
    /**
     * @return the message
     */
    public String getMessage() 
    {
        return message;
    }
    @Override
    public String toString()
    {
        return sender + " sent a message to " + receiver + " on " + new Date(timestamp) + " containing: " + message;
    }
}
