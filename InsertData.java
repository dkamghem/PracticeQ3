package PracticeQ3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			//2. Open the connection
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/batch64?useSSL=false","root","dani3264");
			
			//3. Issue the query
			PreparedStatement ps = conn.prepareStatement("insert into employee value(?,?,?,?,?)");
			ps.setInt(1, 110);
			ps.setString(2, "Allen");
			ps.setFloat(3, 3456.9f);
			ps.setString(4, "UK");
			ps.setString(5, "67890422");
			
			//4. execute the query
			int x= ps.executeUpdate();
			
			if(x!=0) {
				System.out.println("Data inserted Successfully");
			} else {
				System.out.println("issue with the query");
			}
			
		} catch (SQLException e) {
			System.out.println("Error"+e.getMessage());
		} finally {
			try {
				// 6. close the connection
				conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}

//jar-- mySQL connector 

//JDBC

//JDBC throws checked Exception, ClassNotException, SQLException 

//1.Load the Driver
//2. OPen the connection
//3. Issue the query
//4. Execute the query
//5. Fetch the Result
//6. close the connection
