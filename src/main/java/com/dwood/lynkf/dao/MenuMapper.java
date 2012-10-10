package com.dwood.lynkf.dao;

import com.dwood.lynkf.domain.Menu;
import com.dwood.lynkf.domain.MenuCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    int countByExample(MenuCriteria example);

    int deleteByExample(MenuCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuCriteria example);

    Menu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuCriteria example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuCriteria example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}