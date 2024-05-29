package org.example.mybatis.mapper;

import org.example.mybatis.pojo.RechargeRecord;

public interface RechargeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RechargeRecord row);

    int insertSelective(RechargeRecord row);

    RechargeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RechargeRecord row);

    int updateByPrimaryKey(RechargeRecord row);
}