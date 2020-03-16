package com.liujun.microservice.ddd.demo.domain.user.repository.persistence;

import com.liujun.microservice.ddd.demo.domain.user.repository.facade.UserInfoRepository;
import com.liujun.microservice.ddd.demo.domain.user.repository.mapper.UserInfoDAO;
import com.liujun.microservice.ddd.demo.domain.user.repository.po.UserInfoPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * 数据库操作的实现
 *
 * @author liujun
 */
@Repository
public class UserInfoRepositoryImpl implements UserInfoRepository {

  /** 用户的mybatis的数据库实现操作 */
  @Autowired private UserInfoDAO userinfoDAO;

  public UserInfoPO getUserInfo(UserInfoPO userPO) {
    return userinfoDAO.getUserInfo(userPO);
  }

  @Override
  public boolean save(UserInfoPO userinfoPO) {
    int rsp = userinfoDAO.insert(userinfoPO);

    if (rsp > 0) {
      return true;
    }

    return false;
  }

  @Override
  public boolean delete(UserInfoPO userinfoPO) {

    int deleteRsp = userinfoDAO.delete(userinfoPO);

    if (deleteRsp > 0) {
      return true;
    }

    return false;
  }
}
