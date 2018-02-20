import java.util.*;
import java.sql.*;

public class RzDemo3 {

	/**
	 * @demo of resultSet data manipulation using updateStatement
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conect c= new Conect();
		Scanner in= new Scanner(System.in);
		String name,ad,ph;
		try{
			Connection con=  c.getCon();
			PreparedStatement st= con.prepareStatement("Select * from person",
					ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=st.executeQuery();
			
			rs.next();
			System.out.println("Before Scroll person is "+rs.getString("name"));
			rs.next();
			rs.previous();
			System.out.println("After Scroll person is "+rs.getString("name")+"\n \n");
			
			rs.absolute(2);
			rs.updateString("name","aslam");
			rs.updateRow();
			System.out.println("After update "+rs.getString("name"));
			
			
			
			
		}catch(Exception e){
			
		}
		finally{
			c.close();
		}
	}

}
