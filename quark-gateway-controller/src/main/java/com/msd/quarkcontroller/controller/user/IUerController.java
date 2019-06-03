package com.msd.quarkcontroller.controller.user;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "quark-user")
public interface IUerController {
}
