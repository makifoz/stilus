package com.example.stilus.controller;

import com.example.stilus.model.ComputeResult;
import com.example.stilus.service.IComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compute")
public class ComputeRest {

    @Autowired
    IComputeService computeService;

    @PostMapping("/topla")
    public ResponseEntity<?> topla(@RequestParam(value = "ilkDeger",required = false) Float ilkDeger, @RequestParam(name="ikinciDeger",required = false) Float ikinciDeger){

        return ResponseEntity.ok(new ComputeResult(ilkDeger,ikinciDeger,"toplama",computeService.topla(ilkDeger,ikinciDeger))) ;
    }

    @PostMapping("/cikar")
    public ResponseEntity<?> cikar(@RequestParam(value = "ilkDeger",required = false) Float ilkDeger, @RequestParam(name="ikinciDeger",required = false) Float ikinciDeger){
        return ResponseEntity.ok(new ComputeResult(ilkDeger,ikinciDeger,"çıkarma",computeService.cikar(ilkDeger,ikinciDeger)));

    }


}
