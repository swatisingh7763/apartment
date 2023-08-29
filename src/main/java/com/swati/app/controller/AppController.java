package com.swati.app.controller;

import com.swati.app.models.Address;
import com.swati.app.models.Apartment;
import com.swati.app.models.Society;
import com.swati.app.req.AddressRequest;
import com.swati.app.req.ApartmentRequest;
import com.swati.app.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Autowired
    AppService appService;

    @RequestMapping(method = RequestMethod.POST, value = "/addApartment")
    public Apartment addApartment(@RequestBody ApartmentRequest apartment) {
        return appService.addApartment(apartment);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addAddress")
    public Address addAddress(@RequestBody AddressRequest address) {
        return appService.addAddress(address);
    }
}
