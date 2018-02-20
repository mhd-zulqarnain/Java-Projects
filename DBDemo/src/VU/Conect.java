package VU;
import java.sql.*;

public class Conect {

	/**
	 * @param args
	 */
	Connection con=null;
	public Connection getCon(){
		try{
			con=DriverManager.getConnection("jdbc:ucanaccess://E:/Work/java/Revise/PersonInfo.accdb;memory=false");
	
		}catch(Exception e){}
		return con;
	}
	public void close(){
		try{
			con.close();	
		}catch(Exception e){
			System.out.println("Error "+e);
		}
	}
}
