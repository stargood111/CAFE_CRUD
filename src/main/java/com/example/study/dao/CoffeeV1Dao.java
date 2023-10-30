package com.example.study.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CoffeeV1Dao {

    /*전체리스트 조회*/
    public List<Map<String, String>> doCoffeeList();

    List<Map<String, String>> doCoffeeList(String strName, String strStart_Date, String strEnd_Date, String strKind);
}
