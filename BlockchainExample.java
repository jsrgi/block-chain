package com.blockchain.blockexample;

import java.util.Arrays;

public class BlockchainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Block chain :
			 Block - Hash of previous block + transactions Chained together.*/
		
			Transaction transaction1 = new Transaction("madhu", "malar", 800L);
			Transaction transaction2 = new Transaction("vidhya", "malar", 180L);
			Transaction transaction3 = new Transaction("prasad", "mathi", 100L);
			
			/*System.out.println(transaction1.hashCode());
			System.out.println(transaction2.hashCode());
			System.out.println(transaction3.hashCode());*/
			
			Block firstblock= new Block(0, Arrays.asList(transaction1,transaction2));
			System.out.println(firstblock.hashCode());
			Block secondBlock = new Block(firstblock.hashCode(), Arrays.asList(transaction3));
			System.out.println(secondBlock.hashCode());
	}

}
