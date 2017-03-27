package cym.ssm.mapper;

import cym.ssm.po.PurchaseList;
import cym.ssm.po.PurchaseListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseListMapper {
    int countByExample(PurchaseListExample example);

    int deleteByExample(PurchaseListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseList record);

    int insertSelective(PurchaseList record);

    List<PurchaseList> selectByExample(PurchaseListExample example);

    PurchaseList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PurchaseList record, @Param("example") PurchaseListExample example);

    int updateByExample(@Param("record") PurchaseList record, @Param("example") PurchaseListExample example);

    int updateByPrimaryKeySelective(PurchaseList record);

    int updateByPrimaryKey(PurchaseList record);
}