import java.sql.*;
import java.util.Scanner;
public class JDBCperp2 {

	/**
	 * @Prepare statement demo
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name to be update");
		String name=sc.nextLine();
		System.out.println("Enter name to update");
		String nameu=sc.nextLine();
		
		Conect c= new Conect();
		try{
			Connection con= c.getCon();
			Statement st= con.createStatement();
			int num=st.executeUpdate("update person set name='"+nameu+"'where name='"+name+"'");
			System.out.println("Record update: "+num);
		}catch(Exception e){
			System.out.println("Error: "+e);
		}
		
	}

}
