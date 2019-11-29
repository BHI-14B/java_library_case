package library;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class daoSignIn implements Closeable
{
	private Connection connection;
	private PreparedStatement insertStatement;
	private PreparedStatement updateStatement;
	private PreparedStatement deleteStatement;
	private PreparedStatement selectStatement;
	public daoSignIn()throws Exception
	{
		this.connection = dbUtils.getConnection();
		this.selectStatement = connection.prepareStatement("SELECT * FROM users where email=? and password=?");
		this.insertStatement = connection.prepareStatement("INSERT INTO users VALUES(id,?,?,?,?,'member')");
		this.updateStatement = connection.prepareStatement("UPDATE users SET name=?,email=?,phone=?,passwd=? WHERE id=?");
	}
	
	public int insert(pojo_user signup)throws Exception
	{
		
		this.insertStatement.setString(1, signup.getName());
		this.insertStatement.setString(2, signup.getEmail());
		this.insertStatement.setString(3, signup.getPhone());
		this.insertStatement.setString(4, signup.getPassword());
		
		return this.insertStatement.executeUpdate();
	}
	
	public int select(String email,String password)throws Exception
	{
		this.selectStatement.setString(1, email);
		this.selectStatement.setString(2, password);
		
		
		try( ResultSet rs = this.selectStatement.executeQuery())
		{
			
			if(rs==null)
			{
				return 0;
			}
			else 
				return 1;
		}
		
		}
	
	public int update(pojo_user signup)throws Exception
	{
		this.updateStatement.setString(1, signup.getName());
		this.updateStatement.setString(2, signup.getEmail());
		this.updateStatement.setString(3, signup.getPhone());
		this.updateStatement.setString(4, signup.getPassword());
		
		return this.updateStatement.executeUpdate();
	}
	
	
	
	@Override
	public void close() throws IOException 
	{
		try
		{
			this.selectStatement.close();
			this.connection.close();
		}
		catch( SQLException cause )
		{
			throw new IOException(cause);
		}
	}
	
}