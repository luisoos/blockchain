import java.util.ArrayList;

public class Main {

  ArrayList<Block> blockchain = new ArrayList<>();

  public static void main(String[] args) {

    // Block 1
    String[] genesisTransactions = {"Example0", "Example1", "Example2"}; // If you change the things in the array the digital signatures will be completely different
    Block genesisBlock = new Block(0, genesisTransactions);

    // Creating another block | Block 2
    String[] block2Transactions = {"Example3", "Example4", "Example5"};
    Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

    // Block 3
    String[] block3Transactions = {"Example6", "Example7", "Example8"};
    Block block3 = new Block(block2.getBlockHash(), block3Transactions);


    // Hash 1:
    System.out.println(genesisBlock.getBlockHash());
    
    // Hash 2:
    System.out.println(block2.getBlockHash());
    
    // Hash 3:
    System.out.println(block3.getBlockHash());

  }

}
