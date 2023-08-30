package com.swati.app.service;

import com.swati.app.models.Address;
import com.swati.app.models.Apartment;
import com.swati.app.models.Blocks;
import com.swati.app.models.Society;
import com.swati.app.repo.AddressRepository;
import com.swati.app.repo.ApartmentRepository;
import com.swati.app.repo.BlocksRepository;
import com.swati.app.repo.SocietyRepository;
import com.swati.app.req.AddressRequest;
import com.swati.app.req.ApartmentRequest;
import com.swati.app.req.BlockRequest;
import com.swati.app.req.SocietyRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AppService {
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    ApartmentRepository apartmentRepository;
    @Autowired
    BlocksRepository blocksRepository;
    @Autowired
    SocietyRepository societyRepository;

    public Apartment addApartment(ApartmentRequest apartment) {
        Apartment apartmentModel = new Apartment();
        apartmentModel.setId(apartment.getId());
        apartmentModel.setName(apartment.getName());
        apartmentModel.setCost(apartment.getCost());
        apartmentModel.setType(apartment.getType());
        List<Address> addressList = addressRepository.findAllById(apartment.getAddressIdList());
        log.info("addressList: {}", addressList);
        apartmentModel.setAddressList(addressList);
        return apartmentRepository.save(apartmentModel);
    }

    public Address addAddress(AddressRequest addressRequest) {
        Address add = Address.builder()
                .id(addressRequest.getId())
                .city(addressRequest.getCity())
                .locality(addressRequest.getLocality())
                .pinCode(addressRequest.getPinCode())
                .build();
        log.info("add model: {}", add);
        return addressRepository.save(add);
    }


    public Blocks addBlock(BlockRequest blockRequest) {
        Blocks blocks = Blocks.builder()
                .blockName(blockRequest.getBlockName())
                .id(blockRequest.getId())
                .apartmentList(apartmentRepository.findAllById(blockRequest.getApartmentIdList()))
                .build();
        return blocksRepository.save(blocks);
    }

    public Society addSociety(SocietyRequest societyRequest) {
        Society society=Society.builder()
                .id(societyRequest.getId())
                .name(societyRequest.getName())
                .blocksList(blocksRepository.findAllById(societyRequest.getBlocksList()))
                .build();
        return societyRepository.save(society);

    }
}
