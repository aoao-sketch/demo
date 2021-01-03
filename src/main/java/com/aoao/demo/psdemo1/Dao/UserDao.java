package com.aoao.demo.psdemo1.Dao;

import com.aoao.demo.psdemo1.Util.psdemo1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    List<psdemo1> getAll(@Param("content") Map map);
}
