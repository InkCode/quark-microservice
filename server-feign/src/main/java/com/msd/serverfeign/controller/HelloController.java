package com.msd.serverfeign.controller;

import com.msd.serverfeign.service.SchedualServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedualServiceHello schedualServiceHello;

    @GetMapping(value = "/hello")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHello.sayHelloFromClientOne( name );
    }
}
