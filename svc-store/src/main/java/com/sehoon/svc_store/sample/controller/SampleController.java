package com.sehoon.svc_store.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sehoon.svc_store.sample.dto.SampleStoreInfo;

@RestController
public class SampleController {

    @GetMapping("/store/hello-world")
    public String getHelloworld() {
        return "hello world store service";
    }
    
    @GetMapping("/store/store-info")
    public SampleStoreInfo getStoreInfo() {
        SampleStoreInfo storeInfo = new SampleStoreInfo();
        storeInfo.setStoreName("store name");
        storeInfo.setStoreAddress("일산");
        return storeInfo;
    }
}
