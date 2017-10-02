import java.util.List;

/***
 * 
 * @author Elias Haroun
 *
 */
public class Block
{
    private List<Transaction> transactions;
    private int previousBlockHash;
    private int currentBlockHash;

    /***
     * Hidden default constructor
     */
    @SuppressWarnings("unused")
    private Block()
    {
    }
    /***
     * Parameterized constructor
     * @param previousBlockHash
     * @param transactions
     */
    public Block(final int previousBlockHash, final List<Transaction> transactions)
    {
        this.transactions = transactions;
        this.previousBlockHash = previousBlockHash;        
        this.currentBlockHash = calculateHashCode();
    }
    /***
     * Method to add a transaction to a block
     * @param transaction
     * @return the modified block
     */
    public Block addTransaction(Transaction transaction)
    {
        transactions.add(transaction);
        this.currentBlockHash = calculateHashCode();
        return this;
    }
    /**
     * @return the transactions
     */
    public List<Transaction> getTransactions()
    {
        return transactions;
    }

    /**
     * @return the previousBlockHash
     */
    public int getPreviousBlockHash()
    {
        return previousBlockHash;
    }

    /**
     * @return the currentBlockHash
     */
    public int getCurrentBlockHash()
    {
        return currentBlockHash;
    }
    @Override
    public String toString()
    {
        StringBuilder output = new StringBuilder();
        output.append("- Previous hash: ")
        .append(previousBlockHash + "\n")
        .append("- Current hash: ")
        .append(currentBlockHash + "\n- Transactions: \n");
        for (Transaction transaction : this.transactions)
        {
            output.append("\t- " + transaction + "\n");
        }
        return output.toString();
    }
    /***
     * Helper method to get the hash code from both the previous block
     * hash code the the transctions list hash code.
     * @return the current block hashcode
     */
    private int calculateHashCode()
    {
        Object[] tempData = {this.previousBlockHash, this.transactions.hashCode()};
        return tempData.hashCode();
    }
}
