package com.swati.app.req;

import lombok.Data;
import java.util.List;

@Data
public class SocietyRequest {
    private Integer id;
    private String name;
    private List<Integer> blocksList;
}
