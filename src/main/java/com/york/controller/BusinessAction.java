package com.york.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by np0323 on 2017/7/26.
 */
@Controller
public class BusinessAction {
    @RequestMapping(value="/business")
    public String business(){
        return "business";
    }
}
