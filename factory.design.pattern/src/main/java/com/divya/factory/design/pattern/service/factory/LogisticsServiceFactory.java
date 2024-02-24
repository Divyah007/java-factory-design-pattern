package com.divya.factory.design.pattern.service.factory;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divya.factory.design.pattern.service.LogisticsService;
@Service
public class LogisticsServiceFactory {
	public static final Logger log = LoggerFactory.getLogger(LogisticsServiceFactory.class);

	@Autowired
    private List<LogisticsService> serviceImpls;
    private Optional<LogisticsService> serviceImpl;
    public String logistics(String itemType){
     

        serviceImpl=serviceImpls.stream().filter(s-> s.supports(itemType)).findFirst();
       if(!serviceImpl.isEmpty()) return serviceImpl.get().displayItem(itemType);
        return itemType+" is not supported";
    }
}
