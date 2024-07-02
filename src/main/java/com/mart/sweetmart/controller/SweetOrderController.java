package com.mart.sweetmart.controller;

import com.mart.sweetmart.service.SweetOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sweetOrderController")
public class SweetOrderController {

    @Autowired
    private SweetOrderService sweetOrderService;
}
