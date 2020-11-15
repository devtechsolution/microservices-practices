package org.as.devtechsolution.service;

import java.util.List;

import org.as.devtechsolution.dto.SellerDto;

public interface UserRegistrationService {
    String registerSeller(SellerDto sellerDto);

    List<SellerDto> getSellersList();
}