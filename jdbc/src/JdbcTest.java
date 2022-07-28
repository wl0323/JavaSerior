import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author shkstart
 * @create 2022-07-10-17:21
 */
public class JdbcTest {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.获取连接
//        String url="jdbc:mysql://localhost:3306/shifan19";
        String url="jdbc:mysql:///shifan19";
        String uesrname="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url, uesrname, password);
       //3.定义sql

        String sql="UPDATE ww set score=79.0 where name=\"刘凡\"  ";

        //4.获取执行sql的对象 Statement
        Statement statement = connection.createStatement();
      //5.执行sql
        int count = statement.executeUpdate(sql);//受影响的行数

        //6.处理结构
        System.out.println(count);

        //释放资源
        statement.close();
        connection.close();

    }
}
