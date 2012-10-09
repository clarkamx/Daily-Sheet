package com.dwood.lynkf.dao;

import com.dwood.lynkf.domain.SheetDetail;
import com.dwood.lynkf.domain.SheetDetailCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SheetDetailMapper {
    int countByExample(SheetDetailCriteria example);

    int deleteByExample(SheetDetailCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SheetDetail record);

    int insertSelective(SheetDetail record);

    List<SheetDetail> selectByExample(SheetDetailCriteria example);

    SheetDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SheetDetail record, @Param("example") SheetDetailCriteria example);

    int updateByExample(@Param("record") SheetDetail record, @Param("example") SheetDetailCriteria example);

    int updateByPrimaryKeySelective(SheetDetail record);

    int updateByPrimaryKey(SheetDetail record);
}