
package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "root");
            String url = "jdbc:mysql://localhost:3306/your_database?useSSL=false";
//             String url = "jdbc:mysql://localhost:3306/your_database?useSSL=false";

            
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
