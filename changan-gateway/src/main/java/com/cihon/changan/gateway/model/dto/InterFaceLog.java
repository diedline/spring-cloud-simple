package com.cihon.changan.gateway.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterFaceLog {

    private String url;
    private String method;
    private String param;
    private String callTm;
    private Integer callerID;
    private String callerAcc;
    private Long time;
    private String id;
    private String remake;
    private String remoteAddr;
    private String class_method;
    private String result;

}
