import java.sql.*;

/**
 * @author shkstart
 * @create 2022-07-12-10:10
 */
public class TestJdbc {


    public static void main(String[] args) throws SQLException {

        String url="jdbc:mysql:///shifan19";
        String username="root";
        String password="root";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();

        String sql="select *from student";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getDouble("english"));
        }

        statement.close();
        connection.close();

    }
}
