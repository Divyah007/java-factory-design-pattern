package com.divya.factory.design.pattern.service.impl;

import org.springframework.stereotype.Service;

import com.divya.factory.design.pattern.service.LogisticsService;
@Service
public class CocoonLogisticsServiceImpl implements LogisticsService {
    @Override
    public boolean supports(String itemName) {
        return "COCOON".equals(itemName);
    }

    @Override
    public String displayItem(String itemName) {
        return itemName+" "+"2001";
    }
}
