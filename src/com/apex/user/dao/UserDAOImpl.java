package com.apex.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.apex.user.util.HibernateUtil;
import com.apex.user.vo.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Component
public class UserDAOImpl implements UserDAO {
	
//	private JdbcTemplate jdbcTemplate;
//    
//	public static Connection getConnection() throws Exception{
//		Connection dbconn=null;
//		try {
////			String url="jdbc:mysql://localhost:3306/user_info";
////			Class.forName("com.mysql.jdbc.driver");
////			dbconn=DriverManager.getConnection(url,"root","root");
//			String url = "jdbc:mysql://localhost:3306/test?characterEncoding=latin1";
//			Class.forName("com.mysql.jdbc.Driver");
//			dbconn = DriverManager.getConnection(url, "root", "root");
//		}catch(ClassNotFoundException e1) {
//    		e1.printStackTrace();
//    	}catch (SQLException e) {
//    		e.printStackTrace();
//    	}
//	
//		return dbconn;
//	}
	
	
	@Autowired
	public void addUser(User user) throws Exception {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		}
		
	
	

	
	@Override
	public void updateUser(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(user);
		tx.commit();
	}

	@Override
	public User getUser(String email) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		User user = (User) session.get(com.apex.user.vo.User.class, email);
		return user;
		
	
	}
	@Override
	public List<User> CustomgetUser(String email) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from User where  email= :email_d");
		query.setParameter("email_d", email);
		
//	    query.executeUpdate();
        List<User> qryResults =(List<User>) query.list();
        for(User u: qryResults) {
        	
        	 System.out.println(u.getId()+" "+u.getEmail()+" "+u.getFirstName()+ " "+u.getLastName()+" "+u.getMiddleName());
        }
        return qryResults;}
	
	
	

	@Override
	public void deleteUser(int id) {
	}





	

}
