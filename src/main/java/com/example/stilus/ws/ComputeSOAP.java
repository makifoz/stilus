package com.example.stilus.ws;

import com.example.stilus.model.ComputeRequest;
import com.example.stilus.model.ComputeResult;
import com.example.stilus.service.IComputeService;
import com.example.stilus.ws.models.ComputeResponse;
import com.example.stilus.ws.models.GetComputeRequest;
import com.example.stilus.ws.models.GetComputeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ComputeSOAP {

    private static final String NAMESPACE_URI = "http://localhost:8080/stilus/stilus-compute-web-service";

    @Autowired
    IComputeService computeService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getComputeRequest")
    @ResponsePayload
    public GetComputeResponse compute(@RequestPayload GetComputeRequest request) {
      GetComputeResponse response = new GetComputeResponse();
      ComputeResponse r = new ComputeResponse();


      r.setResult(computeService.computeDispatcher(request.getIlkDeger(),request.getIkinciDeger(),request.getIslem()));
      response.setComputeResponse(r);

      return response;
    }



}
