package org.example.api.mapper;

import org.example.api.model.RechargeRecord;

public interface RechargeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RechargeRecord row);

    int insertSelective(RechargeRecord row);

    RechargeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RechargeRecord row);

    int updateByPrimaryKey(RechargeRecord row);
}