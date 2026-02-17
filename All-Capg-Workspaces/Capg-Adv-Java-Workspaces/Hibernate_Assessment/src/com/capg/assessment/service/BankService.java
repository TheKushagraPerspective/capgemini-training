package com.capg.assessment.service;

import com.capg.assessment.bean.BankAccountBean;
import com.capg.assessment.dao.BankDAO;

public class BankService {

	public boolean createAccount(int accNo , String customerName , long mobileNumber , double bal) throws Exception {
		
		BankDAO dao = new BankDAO();
		
		BankAccountBean bb = new BankAccountBean();
		bb.setAccountNumber(accNo);
		bb.setCustomerName(customerName);
		bb.setMobileNumber(mobileNumber);
		bb.setBalance(bal);
		
		boolean status = dao.addAccount(bb);
		
		return status;
	}
	
	
	public double showBalance(int accNo) throws Exception {
		
		BankDAO dao = new BankDAO();
		double bal = dao.getBalance(accNo);
		
		return bal;
	}
	
	
	public double deposit(int accNo , double amt) throws Exception {
		
		BankDAO dao = new BankDAO();
		double updBal = dao.addBalance(accNo , amt);
		
		return updBal;
	}
	
	public double withdraw(int accNo , double amt) throws Exception {
		
		BankDAO dao = new BankDAO();
		double updBal = dao.deductBalance(accNo , amt);
		
		return updBal;
	}
	
	public boolean fundTransfer(int fromAcc , int toAcc , double amt) throws Exception {
		BankDAO dao = new BankDAO();
		return dao.fundTransferToAcc(fromAcc , toAcc , amt);
	}
	
	public void printTransactions(int accno) throws Exception {
		
	}
	
}
