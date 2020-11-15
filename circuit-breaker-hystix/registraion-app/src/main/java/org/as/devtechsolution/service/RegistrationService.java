package org.as.devtechsolution.service;

import java.util.List;

import org.as.devtechsolution.dto.SellerDto;

public interface RegistrationService {


    String addSeller(SellerDto sellerDto);

    List<SellerDto> getSellersList();
}