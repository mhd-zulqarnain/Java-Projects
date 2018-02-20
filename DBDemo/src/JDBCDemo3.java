import java.util.*;
import java.sql.*;

public class JDBCDemo3 {

	/**
	 * @insert row demo
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,ad,ph;
		Conect c= new Conect();
		Scanner in= new Scanner(System.in);
		/*System.out.println("Name:");
		name=in.nextLine();
		System.out.println("Address:");
		ad=in.nextLine();
		System.out.println("Phone:");
		ph=in.nextLine();
		*/
		
		try{
			Connection con=c.getCon();
			PreparedStatement pStmt = con.prepareStatement("Select * from person",
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
					
					ResultSet rs = pStmt.executeQuery();
					rs.last();
					System.out.println("The row Deleted "+rs.getRow());
					rs.deleteRow();
					
		}catch(Exception e){
			System.out.println("Error "+e);
		}finally{
			c.close();
		}
		}
}
