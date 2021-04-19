import java.sql.*;
class OracleConTest
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","student","imcastudent");
			System.out.println("Connection to Oracle Database done successfully...");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
}