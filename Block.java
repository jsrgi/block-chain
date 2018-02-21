package com.blockchain.blockexample;

import java.util.List;

public class Block {

	
	 private int previoushash;
	 private List<Transaction> transaction;
	
	 
	 public Block(int previoushash, List<Transaction> transaction) {
			
			this.previoushash = previoushash;
			this.transaction = transaction;
		}
		 
	 
	 public int getPrevioushash() {
		return previoushash;
	}
	public void setPrevioushash(int previoushash) {
		this.previoushash = previoushash;
	}
	public List<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}


	@Override
	public int hashCode() {
		
		int result = previoushash;
		result = 31 * result +(transaction !=null ? transaction.hashCode():0);
		
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Block other = (Block) obj;
		if (previoushash != other.previoushash) {
			return false;
		}
		if (transaction == null) {
			if (other.transaction != null) {
				return false;
			}
		} else if (!transaction.equals(other.transaction)) {
			return false;
		}
		return true;
	}


	
	
	 
}
