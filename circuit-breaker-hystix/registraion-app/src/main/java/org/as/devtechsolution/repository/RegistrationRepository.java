package org.as.devtechsolution.repository;

import java.util.ArrayList;
import java.util.List;

import org.as.devtechsolution.dto.SellerDto;
import org.springframework.stereotype.Repository;

@Repository
public class RegistrationRepository {

    List<SellerDto> sellerDtoList = new ArrayList<>();

    public boolean addSeller(SellerDto sellerDto) {

        return sellerDtoList.add(sellerDto);
    }

    public List<SellerDto> getSellerList() {
        return sellerDtoList;
    }
}