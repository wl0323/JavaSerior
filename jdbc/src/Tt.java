import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

/**
 * @author shkstart
 * @create 2022-07-12-10:26
 */
public class Tt {
    public static void main(String[] args) throws SQLException {
        Connection connection = getConnection("jdbc:mysql:///shifan19", "root", "root");
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate("update student set math=97 where id=1");
        System.out.println(i);
        statement.close();
        connection.close();

    }
}
