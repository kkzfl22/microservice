package com.liujun.microservice.ddd.demo.domain.leave.repository;

import com.liujun.microservice.ddd.demo.common.DatabaseComm;
import com.liujun.microservice.ddd.demo.domain.leave.TestParent;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

/**
 * 进行数据库的创建操作
 *
 * @author liujun
 * @version 0.0.1
 */
public class CreateTableRepository extends TestParent {

  @Autowired private DataSource dataSource;

  @Test
  public void runCreateTable() {
    String createTable =
        "CREATE TABLE IF NOT EXISTS leave_message ("
            + "  userId int(11) NOT NULL,\n"
            + "  message varchar(255) ,\n"
            + "  leaveStatus int(2) ,\n"
            + "  PRIMARY KEY (userId)\n"
            + ")";

    // 执行创建表操作
    int rsp = DatabaseComm.runExecute(dataSource, createTable);
    System.out.println(rsp);
  }
}
