package com.liujun.microservice.ddd.demo.domain.user.repository;

import com.liujun.microservice.ddd.demo.TestParent;
import com.liujun.microservice.ddd.demo.comm.DatabaseComm;
import org.junit.BeforeClass;
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
        "CREATE TABLE IF NOT EXISTS userinfo (\n"
            + "  userid int(11) NOT NULL,\n"
            + "  username varchar(255)  DEFAULT NULL,\n"
            + "  password varchar(255)  DEFAULT NULL,\n"
            + "  message varchar(255)  DEFAULT NULL,\n"
            + "  PRIMARY KEY (userid)\n"
            + ") ";

    // 执行创建表操作
    int rsp = DatabaseComm.runExecute(dataSource, createTable);
    System.out.println(rsp);
  }
}
