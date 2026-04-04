package com.kodewala.inf1;

interface IBank {
	public abstract void transferFund();

	public abstract void cancelTxn();

	public abstract void setLimit();
	public abstract void  printPassbook();

}

class HDFC implements IBank {

	@Override
	public void transferFund() {
		System.out.println("fund transfer direct from HDFC bank");

	}

	@Override
	public void cancelTxn() {
System.out.println("if you  want then cancel txn");
	}

	@Override
	public void setLimit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printPassbook() {
		// TODO Auto-generated method stub
		
	}

}

class IDFC implements IBank {

	@Override
	public void transferFund() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelTxn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLimit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printPassbook() {
		// TODO Auto-generated method stub
		
	}

}

class UCO implements IBank {

	@Override
	public void transferFund() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelTxn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLimit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printPassbook() {
		// TODO Auto-generated method stub
		
	}

}

class SBI implements IBank {

	@Override
	public void transferFund() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelTxn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLimit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printPassbook() {
		// TODO Auto-generated method stub
		
	}

}

class RuralBank implements IBank {

	@Override
	public void transferFund() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelTxn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLimit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printPassbook() {
		// TODO Auto-generated method stub
		
	}

}

public class Driver {

}
