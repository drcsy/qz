package com.qz.sm.dao;

import com.qz.sm.dto.SmData;

public interface SmDataMapper {
    int deleteByPrimaryKey(String id);

    int insert(SmData record);

    int insertSelective(SmData record);

    SmData selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SmData record);

    int updateByPrimaryKey(SmData record);
}