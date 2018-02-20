import java.sql.*;

public class metaDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conect c= new Conect();
		try{
			Connection con= c.getCon();
			PreparedStatement r= con.prepareStatement("Select *from person");
			ResultSet rs=r.executeQuery();
			ResultSetMetaData rdmd=rs.getMetaData();
			
			for(int i=1;i<=rdmd.getColumnCount();i++){
				System.out.print(rdmd.getColumnName(i));
				System.out.print("\t");
			}
			System.out.println();
			while(rs.next()){
				System.out.println(rs.getString("id")+"\t"+rs.getString("name")+"\t"+rs.getString("address")+"\t"+rs.getString("ph"));
			}
			
			c.close();
		}catch(Exception e){
			System.out.println("Error: "+e);
		}
	}

}
