package com.shanxi.lvliang.commodity.account.mapper;

import com.shanxi.lvliang.commodity.account.entity.dataobj.UserInfoDO;
import com.shanxi.lvliang.commodity.account.entity.dataobj.UserInfoDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoDOMapper {
    long countByExample(UserInfoDOExample example);

    int deleteByExample(UserInfoDOExample example);

    int insert(UserInfoDO record);

    int insertSelective(UserInfoDO record);

    List<UserInfoDO> selectByExample(UserInfoDOExample example);

    int updateByExampleSelective(@Param("record") UserInfoDO record, @Param("example") UserInfoDOExample example);

    int updateByExample(@Param("record") UserInfoDO record, @Param("example") UserInfoDOExample example);
}