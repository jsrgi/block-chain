package com.blockchain.blockexample;

public class Transaction {

	private String SourceName;
	private String destination;
	private Long sum;
	
	 public Transaction(String SourceName,String destination,Long sum) {
		this.destination=destination;
		this.SourceName=SourceName;
		this.sum=sum;
	}
	 public String getDestination() {
		return destination;
	}
	 public String getSourceName() {
		return SourceName;
	}
	 public Long getSum() {
		return sum;
	}
	 public void setDestination(String destination) {
		this.destination = destination;
	}
	 public void setSourceName(String sourceName) {
		SourceName = sourceName;
	}
	 public void setSum(Long sum) {
		this.sum = sum;
	}
	 
}
