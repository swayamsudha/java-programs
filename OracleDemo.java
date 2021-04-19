import java.sql.*;

class OracleDemo 
{
    public static void main(String args[])
    {
        try {
            // Load the ojdbc14.jar driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connect your user acc. with Oracle database
            Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "student", "imcastudent");
            
            System.out.println("Log-In to Oracle Database DONE Successfully");

            // Create Statement
            Statement stmt = con.createStatement();

            String sqlcmd = "INSERT INTO book VALUES('002', 'ANSI C','Kalyani','Balguru','7th')";

            con.setAutoCommit(false);
            int rowsAffected = stmt.executeUpdate(sqlcmd);

            
            con.commit();
            
            con.close();
			int count = 0;
			System.out.println(rowsAffected + " records inserted successfully.");

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}