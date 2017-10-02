import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author Elias Haroun
 *
 */
public class Blockchain
{
    private List<Block> blocks;
    private final int GENESIS_BLOCK_PREVIOUS_BLOCK_HASHCODE = 0;

    public Blockchain()
    {
        this.blocks = new ArrayList<Block>();
    }
    /***
     * Method that allows adding a new block to the chain
     * @param block
     * @return the newly modified blockchain
     */
    public List<Block> addBlock(Block block)
    {
        // Ensure that the first block has no previous block hash code.
        if (blocks.size() == 0)
        {
            if (block.getPreviousBlockHash() != 0)
            {
                System.out.println("Invalid genesis block. The first block in the chain "
                        + "should have a previous block hash value of 0.");
            }
        }
        blocks.add(block);
        return blocks;
    }
    /***
     * Method to create a new block
     * @return the newly created block
     */
    public Block createBlock()
    {
        Block block;
        if (blocks.size() == 0)
        {
            block = new Block(GENESIS_BLOCK_PREVIOUS_BLOCK_HASHCODE, new ArrayList<Transaction>());
        }
        else
        {
            block = new Block(blocks.get(blocks.size() - 1).getCurrentBlockHash(), new ArrayList<Transaction>());
        }
        return block;
    }
    @Override
    public String toString()
    {
        StringBuilder output = new StringBuilder();
        output.append("Blockchain...\n");
        for(Block block : blocks)
        {
            output.append(block + "\n");
        }
        return output.toString();
    }
}
