package com.liujun.microservice.ddd.demo.domain.leave.repository.mapper;

import com.liujun.microservice.ddd.demo.TestParent;
import com.liujun.microservice.ddd.demo.domain.leave.constant.LeaveStatus;
import com.liujun.microservice.ddd.demo.domain.leave.repository.po.LeavePO;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/** 测试请假的操作的DAO */
public class TestLeaveDAO extends TestParent {

  /** 持久化层数据的调用 */
  @Autowired private LeaveDAO leaveDAO;

  private LeavePO leavePO;

  @Before
  public void runSave() {
    leavePO = new LeavePO();
    leavePO.setLeaveId(RandomUtils.nextInt());
    leavePO.setLeaveStatus(LeaveStatus.PASS.getStatus());
    leavePO.setMessage(RandomStringUtils.randomAlphabetic(10));
    leavePO.setUserId(RandomUtils.nextInt());
    leaveDAO.insert(leavePO);
  }

  @Test
  public void update() {

    LeavePO updateData = new LeavePO();
    updateData.setLeaveId(leavePO.getLeaveId());
    updateData.setLeaveStatus(LeaveStatus.INIT.getStatus());
    int dataUpd = leaveDAO.updateStatus(updateData);
    Assert.assertEquals(1, dataUpd);
  }

  @Test
  public void runQuery() {
    LeavePO query = new LeavePO();
    query.setLeaveId(leavePO.getLeaveId());
    List<LeavePO> data = leaveDAO.query(query);
    LeavePO dataItem = data.get(0);

    Assert.assertEquals(dataItem.getUserId(), leavePO.getUserId());
    Assert.assertEquals(dataItem.getMessage(), leavePO.getMessage());
    Assert.assertEquals(dataItem.getLeaveStatus(), leavePO.getLeaveStatus());
  }

  @After
  public void clean() {
    leaveDAO.delete(leavePO);
  }
}
