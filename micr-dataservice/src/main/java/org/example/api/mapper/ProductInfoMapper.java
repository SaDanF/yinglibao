package org.example.api.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.example.api.model.ProductInfo;
import org.example.api.model.ProductInfoExample;

public interface ProductInfoMapper {

//    计算平均利率
    BigDecimal selectAvgRate();
    long countByExample(ProductInfoExample example);

//    按产品类型分页查询
    List<ProductInfo> selectByTypeLimit(@Param("ptypee") Integer ptype,
                                        @Param("offset")Integer offset,
                                        @Param("rows") Integer rows);

    //    某个产品类型的记录总数，用于下班的分页
    Integer selectCounByType(@Param("pType") Integer pType);


    int deleteByExample(ProductInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductInfo row);

    int insertSelective(ProductInfo row);

    List<ProductInfo> selectByExample(ProductInfoExample example);

    ProductInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") ProductInfo row, @Param("example") ProductInfoExample example);

    int updateByExample(@Param("row") ProductInfo row, @Param("example") ProductInfoExample example);

    int updateByPrimaryKeySelective(ProductInfo row);

    int updateByPrimaryKey(ProductInfo row);


}