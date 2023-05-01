package com.apex.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

	}

	@Override
	public User getUser(int id) {
		return null;
	}

	@Override
	public void deleteUser(int id) {
	}

}
