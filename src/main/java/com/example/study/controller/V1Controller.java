package com.example.study.controller;

import com.example.study.service.CoffeeV1Service;
import lombok.extern.flogger.Flogger;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/v1")
@Log4j2
public class V1Controller {

    @Autowired
    CoffeeV1Service coffeeV1Service;

    @GetMapping("/coffee")
    public String doCoffee(Model model){
        /*전체리스트 조회*/
        List<Map<String,String>> list = coffeeV1Service.doCoffeeList();

        model.addAttribute("list",list);
//        System.out.println(List);
        return "/v1/coffee";
    }
    @PostMapping("/coffee")
    public String doCoffeePost(HttpServletRequest request, Model model){

        String strName = request.getParameter("name");
        String strStart_Date= request.getParameter("start_date");
        log.info(strStart_Date);
        String strEnd_Date = request.getParameter("end_date");
        String strKind = request.getParameter("kind");

        /*전체리스트 조회* 오버로딩*/
        List <Map<String,String>> list = coffeeV1Service.doCoffeeList(strName,strStart_Date,strEnd_Date,strKind);
        model.addAttribute("list",list);
        return "/v1/coffee";
    }
}
