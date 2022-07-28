import java.sql.*;

/**
 * @author shkstart
 * @create 2022-07-10-19:05
 */
public class Test {
    public static void main(String[] args) throws Exception {

        String url="jdbc:mysql://localhost:3306/shifan19";
        String name="root";
        String password="root";


            Connection connection = DriverManager.getConnection(url, name, password);


        String sql="update www set age=22 where name=\"王炼\"";

        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i);
        statement.close();
        connection.close();



    }
}
