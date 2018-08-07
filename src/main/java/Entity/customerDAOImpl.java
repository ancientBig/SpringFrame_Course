package Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class customerDAOImpl implements CustomDAO{

	 private DataSource dataSource;
	 
	 
	public void setDataSource(DataSource dataSource) {
	         this.dataSource = dataSource;
	     }
	@Override
	public void insert(CustomerCLS customer) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO customer " +
				                "(customer_name, customer_lastName, customer_email,customer_address,customer_phone,customer_password) VALUES (?, ?, ?,?,?,?)";
				
				        Connection conn = null;
				
				  
				
				        try {
				
				            conn = dataSource.getConnection();
				
				            PreparedStatement ps = conn.prepareStatement(sql);
				
				            ps.setString(1, customer.getFname());
				
				            ps.setString(2, customer.getLname());
				            ps.setString(3, customer.getE_mail());
				            ps.setString(4, customer.getAddress());
				            ps.setString(5, customer.getPhoneNumber());
				            ps.setString(6, customer.getPassWord());
				
				            ps.executeUpdate();
				
				            ps.close();
				
				  
				
				        } catch (SQLException e) {
				
				            throw new RuntimeException(e);
				
				  
				
				        } finally {
				
				            if (conn != null) {
				
				                try {
				
				                    conn.close();
				
				                } catch (SQLException e) {}
				
				            }
				
				        }

		
	}

	@Override
	public CustomerCLS findById(int id) {
		// TODO Auto-generated method stub
		
		 String sql = "SELECT * FROM customer WHERE customerid = ?";
		 
		         Connection conn = null;
		         try {
		             conn = dataSource.getConnection();
		             PreparedStatement ps = conn.prepareStatement(sql);
		             ps.setInt(1, id);
		             CustomerCLS customeTemp = null;
		 
		             ResultSet rs = ps.executeQuery();
		 
		             if (rs.next()) {
		 
		            	 customeTemp = new CustomerCLS(rs.getString("customer_name"),rs.getString("customer_lastName"),rs.getString("customer_address"),rs.getString("customer_phone"),rs.getString("customer_password"),rs.getString("customer_password"));
		 
		             }
		 
		             rs.close();
		 
		             ps.close();
		 
		             return customeTemp;
		 
		         } catch (SQLException e) {
		 
		             throw new RuntimeException(e);
		 
		         } finally {
		 
		             if (conn != null) {
		 
		                 try {
		 
		                 conn.close();
		 
		                 } catch (SQLException e) {}
		 
		             }
		 
		         }

	}

	

}
