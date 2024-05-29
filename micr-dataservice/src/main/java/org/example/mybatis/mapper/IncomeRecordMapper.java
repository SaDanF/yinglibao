package org.example.mybatis.mapper;

import org.example.mybatis.pojo.IncomeRecord;

public interface IncomeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IncomeRecord row);

    int insertSelective(IncomeRecord row);

    IncomeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IncomeRecord row);

    int updateByPrimaryKey(IncomeRecord row);
}