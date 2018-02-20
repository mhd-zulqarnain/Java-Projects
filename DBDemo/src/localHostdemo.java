import java.util.*;
import java.sql.*;
public class localHostdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String srv="localhost";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String db="oss1";
			String url=url = "jdbc:ucanaccess://" + srv + "/" + db; 
			String usr = "root";
		    String pas = "";
		    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/oss1","root","");
//			Connection c= DriverManager.getConnection(url,usr,pas);
			PreparedStatement st= c.prepareStatement("Select * from visitor");
			ResultSet rs= st.executeQuery();
			
			
			rs.next();
			System.out.println(rs.getString(2));
			
		}catch(Exception e){
			System.out.println("Sql error "+e);
		}

	}

}
