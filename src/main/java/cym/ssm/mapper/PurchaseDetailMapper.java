package cym.ssm.mapper;

import cym.ssm.po.PurchaseDetail;
import cym.ssm.po.PurchaseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseDetailMapper {
    int countByExample(PurchaseDetailExample example);

    int deleteByExample(PurchaseDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseDetail record);

    int insertSelective(PurchaseDetail record);

    List<PurchaseDetail> selectByExample(PurchaseDetailExample example);

    PurchaseDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PurchaseDetail record, @Param("example") PurchaseDetailExample example);

    int updateByExample(@Param("record") PurchaseDetail record, @Param("example") PurchaseDetailExample example);

    int updateByPrimaryKeySelective(PurchaseDetail record);

    int updateByPrimaryKey(PurchaseDetail record);
}