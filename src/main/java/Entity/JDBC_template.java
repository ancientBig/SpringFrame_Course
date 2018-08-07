package Entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component("JDBC_template")
public class JDBC_template {

	private List<CustomerCLS> colCustomers;
	
	private JdbcTemplate JBCC_Templatesin;
	
	
	
	
	public List<CustomerCLS> getbdCustomers()
	{
		return JBCC_Templatesin.query("select * from customer",  new RowMapper<CustomerCLS>() {

			@Override
			public CustomerCLS mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				CustomerCLS newCustomer = new CustomerCLS();
				newCustomer.setCustomer_id(rs.getInt("customerid"));
				newCustomer.setFname(rs.getString("customer_name"));
				newCustomer.setAddress(rs.getString("customer_address"));
				newCustomer.setPhoneNumber(rs.getString("customer_phone"));
				newCustomer.setLname(rs.getString("customer_lastName"));
				newCustomer.setE_mail(rs.getString("customer_email"));
				
				return newCustomer;
			}});
	}
	public List<CustomerCLS> getColCustomers() {
		return colCustomers;
	}



	public void setColCustomers(List<CustomerCLS> colCustomers) {
		this.colCustomers = colCustomers;
	}



	public JdbcTemplate getJBCC_Templatesin() {
		return JBCC_Templatesin;
	}


	@Autowired
	public void setJBCC_Templatesin(DataSource ds) {
		JBCC_Templatesin = new JdbcTemplate(ds);
	}



	public JDBC_template() {
		// TODO Auto-generated constructor stub
	}

}
