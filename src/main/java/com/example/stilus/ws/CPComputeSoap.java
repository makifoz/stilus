package com.example.stilus.ws;

import com.example.stilus.model.ComputeRequest;
import com.example.stilus.service.ComputeService;
import com.example.stilus.ws.models.ComputeResponse;
import com.example.stilus.ws.models.GetComputeRequest;
import com.example.stilus.ws.models.GetComputeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

@Endpoint
public class CPComputeSoap {

    ComputeSOAP computeSOAP ;

    public CPComputeSoap() {
        computeSOAP = new ComputeSOAP();
        computeSOAP.computeService = new ComputeService();
    }

    public GetComputeResponse compute(GetComputeRequest request){
        return computeSOAP.compute(request);


    }


}
