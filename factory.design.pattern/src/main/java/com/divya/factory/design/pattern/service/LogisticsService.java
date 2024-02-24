package com.divya.factory.design.pattern.service;

public interface LogisticsService {
    boolean supports(String itemName);
    String displayItem(String itemName);
}
