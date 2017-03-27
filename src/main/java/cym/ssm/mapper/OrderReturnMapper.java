package cym.ssm.mapper;

import cym.ssm.po.OrderReturn;
import cym.ssm.po.OrderReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderReturnMapper {
    int countByExample(OrderReturnExample example);

    int deleteByExample(OrderReturnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderReturn record);

    int insertSelective(OrderReturn record);

    List<OrderReturn> selectByExample(OrderReturnExample example);

    OrderReturn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderReturn record, @Param("example") OrderReturnExample example);

    int updateByExample(@Param("record") OrderReturn record, @Param("example") OrderReturnExample example);

    int updateByPrimaryKeySelective(OrderReturn record);

    int updateByPrimaryKey(OrderReturn record);
}