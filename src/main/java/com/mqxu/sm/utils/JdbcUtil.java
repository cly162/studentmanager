package com.mqxu.sm.utils;
import java.sql.*;
/**
 * @ClassName Student
 * @Description JDBC连接工具类，使用了单例模式，封装了连接和关闭方法
 * @Author mqxu
 * @Date 2020/10/29
 **/
public class JdbcUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/student_manager?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&serverTimezone=GMT%2B8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1621592369";
    private static Connection connection = null;
    private static JdbcUtil jdbcUtil = null;

    /**
     * 获得JDBCUtil实例
     *
     * @return JDBCUtil实例
     */
    public static JdbcUtil getInitJdbcUtil() {
        if (jdbcUtil == null) {
            //线程加锁
            synchronized (JdbcUtil.class) {
                if (jdbcUtil == null) {
                    //懒汉式加载
                    jdbcUtil = new JdbcUtil();
                }
            }
        }
        return jdbcUtil;
    }

    private JdbcUtil() {
    }

    // 通过静态代码块注册数据库驱动，保证注册只执行一次
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获得连接
     *
     * @return CONNECTION
     */
    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return connection;

    }

    /**
     * 关闭连接
     */
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Connection connection = JdbcUtil.getInitJdbcUtil().getConnection();
        if (connection != null) {
            System.out.println("连接成功");
        }
    }
}
