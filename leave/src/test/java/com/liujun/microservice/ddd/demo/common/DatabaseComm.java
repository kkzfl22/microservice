package com.liujun.microservice.ddd.demo.common;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseComm {

  public static int runExecute(DataSource dataSource, String sql) {
    Statement stmt = null;
    Connection conn = null;
    try {
      conn = dataSource.getConnection();
      stmt = conn.createStatement();
      int rsp = stmt.executeUpdate(sql);
      return rsp;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(stmt);
      close(conn);
    }
    return -1;
  }

  private static void close(AutoCloseable closeable) {
    if (null != closeable) {
      try {
        closeable.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
