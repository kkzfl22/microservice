package com.liujun.microservice.ddd.demo.domain.leave.repository.persistence;

import com.liujun.microservice.ddd.demo.domain.leave.TestParent;
import com.liujun.microservice.ddd.demo.domain.leave.constant.LeaveStatus;
import com.liujun.microservice.ddd.demo.domain.leave.repository.facade.LeaveRepository;
import com.liujun.microservice.ddd.demo.domain.leave.repository.po.LeavePO;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 测试当前进行请假的数据库操作的服务
 *
 * @author liujun
 */
public class TestLeaveRepositoryImpl extends TestParent {

  /** 持久化层数据的调用 */
  @Autowired private LeaveRepository leaveRepository;

  private LeavePO leavePO = new LeavePO();

  @Before
  public void runSave() {
    leavePO.setLeaveStatus(LeaveStatus.PASS.getStatus());
    leavePO.setMessage(RandomStringUtils.randomAlphabetic(10));
    leavePO.setUserId(RandomUtils.nextInt());
    leaveRepository.save(leavePO);
  }

  @Test
  public void runQuery() {
    LeavePO query = new LeavePO();
    query.setUserId(leavePO.getUserId());
    List<LeavePO> data = leaveRepository.query(query);
    LeavePO dataItem = data.get(0);

    Assert.assertEquals(dataItem.getUserId(), leavePO.getUserId());
    Assert.assertEquals(dataItem.getMessage(), leavePO.getMessage());
    Assert.assertEquals(dataItem.getLeaveStatus(), leavePO.getLeaveStatus());
  }

  @After
  public void clean() {
    leaveRepository.delete(leavePO);
  }
}
