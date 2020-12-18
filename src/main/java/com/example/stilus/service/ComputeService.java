package com.example.stilus.service;

import com.example.stilus.ws.models.Islem;
import org.springframework.stereotype.Service;

@Service
public class ComputeService implements IComputeService {
    @Override
    public float topla(float a, float b) {
        return a+b;
    }

    @Override
    public float cikar(float a, float b) {
        return a-b;
    }

    @Override
    public float carp(float a, float b) {
        return 0;
    }

    @Override
    public float bol(float a, float b) {
        return 0;
    }

    @Override
    public float mod(float a, float b) {
        return 0;
    }

    @Override
    public float karekok(float a) {
        return 0;
    }

    @Override
    public float computeDispatcher(float a, float b, Islem i) {
        switch (i){
            case CIKARMA:
                return cikar(a,b);
            case TOPLAMA:
                return topla(a,b);

        }


        return 0;
    }
}
