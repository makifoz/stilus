package com.example.stilus.service;

import com.example.stilus.ws.models.Islem;

public interface IComputeService {

    float topla(float a,float b);
    float cikar(float a,float b);
    float carp(float a,float b);
    float bol(float a,float b);
    float mod(float a,float b);
    float karekok(float a);
    float computeDispatcher(float a, float b, Islem i);


}
