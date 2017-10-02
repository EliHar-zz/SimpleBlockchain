/***
 * 
 * @author Elias Haroun
 *
 */
public class Main
{

	public static void main(String[] args)
	{
	    // Create the blockchain
	    Blockchain blockchain = new Blockchain();

	    // *********************
	    // BLOCK #1 information
	    // *********************
	    
	    // Create users
	    User maxime = new User("Maxime");
	    User mila = new User("Mila");
	    User eli = new User("Eli");
        // Create Transactions
	    Transaction t1 = new Transaction(maxime, mila, "Confirm the meeting for 10:00AM on Monday Oct 2, 2017.");
	    Transaction t2 = new Transaction(mila, maxime, "Meeting confirmed.");
	    Transaction t3 = new Transaction(maxime, mila, "Thanks");
	    // Create first block
	    Block b1 = blockchain.createBlock()
	            .addTransaction(t1)
	            .addTransaction(t2)
	            .addTransaction(t3);
	    blockchain.addBlock(b1);
	    
	    System.out.println(blockchain);
	    
	    // *********************
        // BLOCK #2 information
        // *********************

        // Create Transactions
        Transaction t4 = new Transaction(maxime, eli, "Transferred you $2,000.");
        Transaction t5 = new Transaction(eli, maxime, "I received it, thanks.");
        // Create block
        Block b2 = blockchain.createBlock()
                .addTransaction(t4)
                .addTransaction(t5);
        blockchain.addBlock(b2);
        
        System.out.println(blockchain);
        
        // *********************
        // BLOCK #2 information
        // *********************

        // Create Transactions
        Transaction t6 = new Transaction(mila, eli, "Meeting cancelled.");
        Transaction t7 = new Transaction(eli, maxime, "Acknowledged!");
        // Create block
        Block b3 = blockchain.createBlock()
                .addTransaction(t6)
                .addTransaction(t7);
        blockchain.addBlock(b3);
        
        System.out.println(blockchain);
	}
}
