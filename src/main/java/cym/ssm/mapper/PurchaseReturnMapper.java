package cym.ssm.mapper;

import cym.ssm.po.PurchaseReturn;
import cym.ssm.po.PurchaseReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseReturnMapper {
    int countByExample(PurchaseReturnExample example);

    int deleteByExample(PurchaseReturnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseReturn record);

    int insertSelective(PurchaseReturn record);

    List<PurchaseReturn> selectByExample(PurchaseReturnExample example);

    PurchaseReturn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PurchaseReturn record, @Param("example") PurchaseReturnExample example);

    int updateByExample(@Param("record") PurchaseReturn record, @Param("example") PurchaseReturnExample example);

    int updateByPrimaryKeySelective(PurchaseReturn record);

    int updateByPrimaryKey(PurchaseReturn record);
}