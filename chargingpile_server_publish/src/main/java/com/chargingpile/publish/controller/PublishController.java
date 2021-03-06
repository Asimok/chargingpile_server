package com.chargingpile.publish.controller;

import com.chargingpile.publish.data.Temperature;
import com.chargingpile.publish.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 发送消息的controller
 */
@RestController
@RequestMapping("/publish")
public class PublishController {

    /**
     * 注入发布者的service服务
     */
    @Autowired
    private PublishService publishService;

    /**
     * 发送消息
     */
    @PostMapping("/emqxPublish")
    public  String  emqxPublish(@RequestBody Temperature data){
        publishService.sendToMqtt("helmet_topic",data.toString());
        System.out.println("......................");
        return "success";
    }

}
