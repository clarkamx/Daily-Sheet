package com.dwood.lynkf.dao;

import com.dwood.lynkf.domain.DailySheet;
import com.dwood.lynkf.domain.DailySheetCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailySheetMapper {
    int countByExample(DailySheetCriteria example);

    int deleteByExample(DailySheetCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(DailySheet record);

    int insertSelective(DailySheet record);

    List<DailySheet> selectByExample(DailySheetCriteria example);

    DailySheet selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DailySheet record, @Param("example") DailySheetCriteria example);

    int updateByExample(@Param("record") DailySheet record, @Param("example") DailySheetCriteria example);

    int updateByPrimaryKeySelective(DailySheet record);

    int updateByPrimaryKey(DailySheet record);
}