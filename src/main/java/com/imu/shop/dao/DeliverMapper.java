package com.imu.shop.dao;

import com.imu.shop.pojo.DeliverExample;
import com.imu.shop.pojo.Deliver;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DeliverMapper {
    long countByExample(DeliverExample example);

    int deleteByExample(DeliverExample example);

    int deleteByPrimaryKey(Integer deliverid);

    int insert(Deliver record);

    int insertSelective(Deliver record);

    List<Deliver> selectByExample(DeliverExample example);

    Deliver selectByPrimaryKey(Integer deliverid);

    int updateByExampleSelective(@Param("record") Deliver record, @Param("example") DeliverExample example);

    int updateByExample(@Param("record") Deliver record, @Param("example") DeliverExample example);

    int updateByPrimaryKeySelective(Deliver record);

    int updateByPrimaryKey(Deliver record);
}