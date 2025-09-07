import java.sql.*;

class OracleCon {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String dbURL = "jdbc:oracle:thin:system/admin@localhost:1521:xe";
            Connection con = DriverManager.getConnection(dbURL);
/*Connection con=DriverManager.getConnection(
"jdbc:oracle:thin:@localhost:1521:xe","system","admin");*/

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from EMP");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}