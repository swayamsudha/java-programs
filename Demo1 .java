import java.sql.*;

class Demo1 
{
    public static void main(String args[])
    {
        try {
            // Load the ojdbc14.jar driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connect your user acc. with Oracle database
            Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "h1manshu", "himanshu786");
            
            System.out.println("Log-In to Oracle Database DONE Successfully");

            // Create Statement
            Statement stmt = con.createStatement();

            String sqlcmd = "INSERT INTO STUDENTS VALUES('19IMCA021', 'Himanshu')";

            con.setAutoCommit(false);
            int rowsAffected = stmt.executeUpdate(sqlcmd);

            System.out.println(rowsAffected + " records updated successfully.")

            con.commit();
            
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}