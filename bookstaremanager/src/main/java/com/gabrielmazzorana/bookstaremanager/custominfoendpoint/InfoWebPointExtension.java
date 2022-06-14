package com.gabrielmazzorana.bookstaremanager.custominfoendpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component   //injeta a dependencia do spring
@EndPointWebExtension(endpoint = InfoEndpoint.class)
public class InfoWebPointExtension {

    @Autowired  //injeta esse InfoEndpoint nesse arquivo
    private InfoEndpoint delegate;

    @ReadOperation
    public WebEndpointResponse<Map> info(){
        Map<String, Object> info = this.delegate.info();
        Integer status = getStatus(info);
        Map<String, Object> customInfo = new HashMap<>(info);
        customInfo.put("customInfo", "handOn");
        return new WebEndpointResponse<>(customInfo, status);
    }

    private Integer getStatus(Map<String, Object> info){
        return 200;
    }
}
