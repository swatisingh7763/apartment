package com.swati.app.req;

import lombok.Data;

import java.util.List;

@Data
public class BlockRequest {
    private Integer id;
    private String blockName;
    private List<Integer> apartmentIdList;
}
