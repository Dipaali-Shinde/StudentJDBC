package com.jdbclogin.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.jdbclogin.connection.DbConnection;
import com.jdbclogin.dao.UserDao;
import com.jdbclogin.pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean addNewUser(User user) {
		try (Connection con = DbConnection.getDatabaseConnection()){
			
			PreparedStatement pst = con.prepareStatement("INSERT INTO"
					+ " userdata VALUES(?,?)");
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			
			int count = pst.executeUpdate();
			
			if(count > 0)
				return true;
			else
				return false;
			
		} catch (NullPointerException e) {
			System.out.println("connection with database is not"
					+ " available");
			return false;
		}
		catch(SQLException exc) {
			exc.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean checkUserCredentials(User user) {
		try (Connection con = DbConnection.getDatabaseConnection()){
			
			PreparedStatement pst = con.prepareStatement("SELECT * FROM userdata WHERE username = ? "
					+ "AND password = ?");
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			System.out.println("inside dao impl"+user.getUsername());
			System.out.println("inside dao impl"+user.getPassword());
			ResultSet rs = pst.executeQuery();
			
			//if(rs.isBeforeFirst())
			if(rs.next())
				return true;
			else
				return false;
			
		} catch (NullPointerException e) {
			System.out.println("connection with database is not"
					+ " available");
			return false;
		}
		catch(SQLException exc) {
			exc.printStackTrace();
			return false;
		}
	}
}
