import java.sql.*;
public class jdbc {

	public static void main(String[] args) throws Exception  {
		String url = "jdbc:mysql://localhost:3306/cogni";
		String uname = "root";
		String pass = "0000";
		String query ="Select * from cog";
		
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name = rs.getString("emp_name");
			
			System.out.println(name);
			
			st.close();
			con.close();
			
			
	
		

	}

}
