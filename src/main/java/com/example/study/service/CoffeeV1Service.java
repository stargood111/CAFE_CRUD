package com.example.study.service;

import com.example.study.dao.CoffeeV1Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CoffeeV1Service {

    @Autowired
    CoffeeV1Dao coffeeV1Dao;

    /*전체리스트 조회*/
    public List<Map<String, String>> doCoffeeList() {
        List<Map<String, String>> list = coffeeV1Dao.doCoffeeList();
            return list;
        }
    public List<Map<String, String>> doCoffeeList(String strName, String strStart_Date, String strEnd_Date, String strKind) {
        List<Map<String, String>> list = coffeeV1Dao.doCoffeeList(strName,strStart_Date,strEnd_Date,strKind);
        return list;
    };
}

