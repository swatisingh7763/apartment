package com.swati.app.req;

import com.swati.app.models.Address;
import lombok.Data;

import java.util.List;

@Data
public class ApartmentRequest {
    private Integer id;
    private String name;
    private String type;
    private Long cost;
    private List<Integer> addressIdList;
}
