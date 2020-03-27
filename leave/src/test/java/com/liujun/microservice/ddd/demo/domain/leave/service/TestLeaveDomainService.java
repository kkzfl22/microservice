package com.liujun.microservice.ddd.demo.domain.leave.service;

import com.liujun.microservice.ddd.demo.TestParent;
import com.liujun.microservice.ddd.demo.domain.leave.constant.LeaveStatus;
import com.liujun.microservice.ddd.demo.domain.leave.entity.LeaveDO;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/** 测试请假的领域服务 */
public class TestLeaveDomainService extends TestParent {

  /** 请假的领域服务 */
  @Autowired private LeaveDomainService leaveDomainService;

  private LeaveDO leaveDO;

  /** 测试保存 */
  @Before
  public void testSave() {
    leaveDO = new LeaveDO();
    leaveDO.setUserId(RandomUtils.nextInt());
    leaveDO.setStatus(LeaveStatus.INIT);
    leaveDO.setMessage("请假申请");
    boolean rsp = leaveDomainService.create(leaveDO);
    Assert.assertEquals(true, rsp);
  }

  @Test
  public void updateStatus() {
    LeaveDO updateStatus = new LeaveDO();
    updateStatus.setLeaveId(leaveDO.getLeaveId());
    updateStatus.setStatus(LeaveStatus.PASS);
    boolean updStatus = leaveDomainService.updateStatus(updateStatus);
    Assert.assertEquals(true, updStatus);
  }

  @Test
  public void queryById() {
    LeaveDO leaveDORsp = leaveDomainService.queryById(leaveDO.getLeaveId());
    Assert.assertEquals(leaveDORsp.getLeaveId(), leaveDO.getLeaveId());
    Assert.assertEquals(leaveDORsp.getMessage(), leaveDO.getMessage());
    Assert.assertEquals(leaveDORsp.getStatus(), leaveDO.getStatus());
    Assert.assertEquals(leaveDORsp.getUserId(), leaveDO.getUserId());
  }

  public void clean() {
    boolean deleteRsp = leaveDomainService.deleteById(leaveDO.getLeaveId());
    Assert.assertEquals(true, deleteRsp);
  }
}
