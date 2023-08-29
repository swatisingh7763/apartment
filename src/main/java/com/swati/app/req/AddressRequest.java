package com.swati.app.req;

import lombok.Data;

@Data
public class AddressRequest {
    private Integer id;
    private String locality;
    private String city;
    private int pinCode;
}
