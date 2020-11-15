package org.as.devtechsolution.service;

import java.util.List;

import org.as.devtechsolution.dto.SellerDto;
import org.as.devtechsolution.service.hystricx.UserRegistrationHystrix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

    Logger logger = LoggerFactory.getLogger(UserRegistrationServiceImpl.class);
    private UserRegistrationHystrix userRegistrationHystrix;


    public UserRegistrationServiceImpl(UserRegistrationHystrix userRegistrationHystrix) {
        this.userRegistrationHystrix = userRegistrationHystrix;
    }

    @Override
    public String registerSeller(SellerDto sellerDto) {
        long start = System.currentTimeMillis();
        String registerSeller = userRegistrationHystrix.registerSeller(sellerDto);
        logger.info("add seller call returned in - {}", System.currentTimeMillis() - start);
        return registerSeller;

    }

    @Override
    public List<SellerDto> getSellersList() {
        return userRegistrationHystrix.getSellersList();
    }
}