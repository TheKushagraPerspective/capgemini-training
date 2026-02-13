package com.capg.layer;

import com.capg.util.HibernateUtil;
import com.capg.util.JDBC_Util;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAO {
	
	private SessionFactory factory;
	
//	using Hibernate
	public int addStudent(StudentBean sb) throws Exception {
		int status = 0;
		Session session = null;
		Transaction txn = null;
		
		try {
			factory = HibernateUtil.getSessionFactory();
			session = factory.openSession();
			txn = session.beginTransaction();
			
			session.save(sb);
			txn.commit();
			
			status = 1;
		}
		catch(Exception e)  {
			if (txn != null) {
                txn.rollback();
            }
			status = 0;
            System.out.println(e);
		}
		finally {
			if (session != null) {
                session.close();
            }
		}
		
		return status;
	}
	
	
	public StudentBean getStudent(int student_id) {
		Session session = null;
		StudentBean sb = null;
		
		try {
			factory = HibernateUtil.getSessionFactory();
			session = factory.openSession();
			
			sb = (StudentBean) session.get(StudentBean.class , student_id);
		}
		catch(Exception e) {
            System.out.println(e);
		}
		finally {
			if (session != null) {
                session.close();
            }
		}
		
		return sb;
	}
	
	
	public int updateStudent(int student_id , String newName) {
		int status = 0;
		Session session = null;
		Transaction txn = null;
		
		try {
			factory = HibernateUtil.getSessionFactory();
			session = factory.openSession();
			txn = session.beginTransaction();
			
			StudentBean sb = (StudentBean) session.get(StudentBean.class , student_id);
			
			if(sb != null) {
			    sb.setName(newName);
			    txn.commit();
			    status = 1;
			} else {
			    System.out.println("Student not found");
			    status = 0;
			}
		}
		catch(Exception e) {
			if (txn != null) {
                txn.rollback();
            }
			status = 0;
            System.out.println(e);
		}
		finally {
			if (session != null) {
                session.close();
            }
		}
		
		return status;
	}
	
	
	public int deleteStudent(int student_id) {
		int status = 0;
		Session session = null;
		Transaction txn = null;
		
		try {
			factory = HibernateUtil.getSessionFactory();
			session = factory.openSession();
			txn = session.beginTransaction();
			
			StudentBean sb = (StudentBean) session.get(StudentBean.class , student_id);
			
			if(sb != null) {
			    session.delete(sb);
			    txn.commit();
			    status = 1;
			} else {
			    System.out.println("Student not found");
			    status = 0;
			}
		}
		catch(Exception e) {
			if (txn != null) {
                txn.rollback();
            }
			status = 0;
            System.out.println(e);
		}
		finally {
			if (session != null) {
                session.close();
            }
		}
		
		return status;
	}
	
	

//	using JDBC
//	public int addStudent(StudentBean sb) throws Exception {
//		int i = 0;
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		
//		try {
//			conn = JDBC_Util.getConnection();
//			
//			try {
//				String query = "INSERT INTO STUDENT2 VALUES (?,?,?,?)";
//				pstmt = conn.prepareStatement(query);
//				
//				pstmt.setInt(1 , sb.getStudentId());
//				pstmt.setString(2 , sb.getName());
//				pstmt.setDouble(3 , sb.getMarks());
//				pstmt.setString(4 , sb.getResult());
//				
//				i = pstmt.executeUpdate();
//				return i;
//			}
//			catch(Exception e) {
//				System.out.println(e);
//				return i;
//			}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//			return i;
//		}
//		finally {
//			if(pstmt != null) {
//				pstmt.close();
//			}
//			if(conn != null) {
//				conn.close();
//			}
//		}
//	}
	
}
