package com.example.stilus.ws;


import com.example.stilus.service.ComputeService;
import com.example.stilus.ws.models.GetComputeRequest;
import com.example.stilus.ws.models.GetComputeResponse;

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
