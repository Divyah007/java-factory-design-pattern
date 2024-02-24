package com.divya.factory.design.pattern.service.impl;

import org.springframework.stereotype.Service;

import com.divya.factory.design.pattern.service.LogisticsService;
@Service
public class CottonLogisticsServiceImpl  implements LogisticsService {

    @Override
    public boolean supports(String itemName) {
        return "COTTON".equals(itemName);
    }
    @Override
    public String displayItem(String itemName) {
        return itemName+" "+"3042";
    }
}
