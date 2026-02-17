package com.capg.assessment.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;


import com.capg.assessment.bean.BankAccountBean;
import com.capg.assessment.util.HibernateUtil;

public class BankDAO {
	
	public boolean addAccount(BankAccountBean bb) throws Exception {
		
		Session session = null;
		Transaction txn = null;
		boolean status = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			txn = session.beginTransaction();
			
			session.save(bb);
			txn.commit();
			
			status = true;
		}
		catch(Exception e) {
			if(txn != null) {
				txn.rollback();
			}
			status = false;
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
		return status;
	}
	
	
	public double getBalance(int accNumber) {
		Session session = null;
		Transaction txn = null;
		double bal = 0;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			txn = session.beginTransaction();
			
			BankAccountBean bb = (BankAccountBean) session.get(BankAccountBean.class , accNumber);
			bal = bb.getBalance();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
		return bal;
	}
	
	
	public double addBalance(int accNumber , double amt) {
		Session session = null;
		Transaction txn = null;
		double updBal = 0;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			txn = session.beginTransaction();
			
			BankAccountBean bb = (BankAccountBean) session.get(BankAccountBean.class , accNumber);
			updBal = bb.getBalance() + amt;
			
			bb.setBalance(updBal);
			session.update(bb);
			txn.commit();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
		return updBal;
	}
	
	
	public double deductBalance(int accNumber , double amt) {
		Session session = null;
		Transaction txn = null;
		double updBal = 0;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			txn = session.beginTransaction();
			
			BankAccountBean bb = (BankAccountBean) session.get(BankAccountBean.class , accNumber);
			updBal = bb.getBalance() - amt;
			
			bb.setBalance(updBal);
			session.update(bb);
			txn.commit();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
		return updBal;
	}
	
	
	public boolean fundTransferToAcc(int accFrom , int accTo , double amt) {
		Session session = null;
		Transaction txn = null;
		double updBalFrom = 0;
		double updBalTo = 0;
		boolean status = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			txn = session.beginTransaction();
			
			BankAccountBean bbFrom = (BankAccountBean) session.get(BankAccountBean.class , accFrom);
			updBalFrom = bbFrom.getBalance() - amt;
			bbFrom.setBalance(updBalFrom);
			
			BankAccountBean bbTo = (BankAccountBean) session.get(BankAccountBean.class , accTo);
			updBalTo = bbTo.getBalance() + amt;
			bbTo.setBalance(updBalTo);
			
			
			txn.commit();
			
			status = true;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
		return status;
	}
}
