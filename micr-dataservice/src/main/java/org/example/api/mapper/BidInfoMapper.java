package org.example.api.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.example.api.model.BidInfo;
import org.example.api.model.BidInfoExample;

public interface BidInfoMapper {

//    计算累计金额
    BigDecimal selectSumBidMoney();


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