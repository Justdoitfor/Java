package practice.JDBC_connection;


import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
仅供参考，数据库已发生变动
 */
public class JDBC {

    public static void jdbcTest(){
        
        // mysql服务端地址,注意：数据库后面需要添加?serverTimezone=UTC
        // 因为使用Mysql Connector/J 8.x时发生时区的错误
        String url = "jdbc:mysql://localhost:3306/DATABASE_NAME?serverTimezone=UTC";
        // 访问mysql服务端的用户名
        String user = "root";
        // 访问mysql服务端的密码
        String password = "PATHWORD_HERE";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;

        try {
            // 注册 mysql 驱动
            DriverManager.registerDriver(new Driver());

            // connection 代表跟mysql服务端的一个连接
            connection = DriverManager.getConnection(url,user,password);
            if (connection != null){
                System.out.println("数据库连接成功！");
            }
            //通过connection 可以获取statement对象，statement可以执行sql语句
            // statement对象用于传递sql语句给数据库管理系统执行
            statement = connection.createStatement();
            // 书写 sql 语句
            String sql = "select * from user_address";
            // 通过statement执行查询语句返回结果集，executeQuery方法用于执行select查询语句，
            // 并返回单个结果集，保存在ResultSet对象中
            resultset = statement.executeQuery(sql);
            System.out.println("开始执行查询，查询结果如下：\n");
            // 调用next（）方法，resultset.next()一开始指向结果集中第一行元素，之后每执行一次就往后跳动一次，为空时结束循环
            System.out.println("Address_id\tCustomer_id\tAddress\tDefault_true");
            System.out.println("------------------------------------------------------");
            while (resultset.next()){
                String Address_id = resultset.getString("Address_id");
                String Customer_id = resultset.getString("Customer_id");
                String Address = resultset.getString("Address");
                String Default_true = resultset.getString("Default_true");

                System.out.println(Address_id+"\t\t"+Customer_id+"\t\t"+Address+"\t\t"+Default_true);
                System.out.println("------------------------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("\n查询结束！");

        // 释放ResultSet资源
        try{
            if (resultset != null){
                resultset.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 释放Statement资源
        try{
            if (statement != null){
                statement.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 断开 connetion 连接
        try{
            if (connection != null){
                connection.close(); // 关闭数据库
                System.out.println("数据库已关闭！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        jdbcTest();
    }
}
