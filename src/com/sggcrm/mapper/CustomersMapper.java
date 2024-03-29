package com.sggcrm.mapper;

import com.sggcrm.pojo.Customers;
import com.sggcrm.pojo.CustomersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomersMapper {
    int countByExample(CustomersExample example);

    int deleteByExample(CustomersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Customers record);

    int insertSelective(Customers record);

    List<Customers> selectByExample(CustomersExample example);

    Customers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Customers record, @Param("example") CustomersExample example);

    int updateByExample(@Param("record") Customers record, @Param("example") CustomersExample example);

    int updateByPrimaryKeySelective(Customers record);

    int updateByPrimaryKey(Customers record);
}