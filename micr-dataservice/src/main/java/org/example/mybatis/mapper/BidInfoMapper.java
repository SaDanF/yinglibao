package org.example.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.example.mybatis.pojo.BidInfo;
import org.example.mybatis.pojo.BidInfoExample;

public interface BidInfoMapper {
    long countByExample(BidInfoExample example);

    int deleteByExample(BidInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BidInfo row);

    int insertSelective(BidInfo row);

    List<BidInfo> selectByExample(BidInfoExample example);

    BidInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") BidInfo row, @Param("example") BidInfoExample example);

    int updateByExample(@Param("row") BidInfo row, @Param("example") BidInfoExample example);

    int updateByPrimaryKeySelective(BidInfo row);

    int updateByPrimaryKey(BidInfo row);
}