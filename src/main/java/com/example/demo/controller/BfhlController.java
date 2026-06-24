package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BfhlRequest;
import com.example.demo.dto.BfhlResponse;
import com.example.demo.service.interfacee.BfhlService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/bfhl")
@RequiredArgsConstructor
public class BfhlController {

    private final BfhlService bfhlService;

    @PostMapping
    public ResponseEntity<BfhlResponse>
    process(
            @RequestBody
            BfhlRequest request){

        return ResponseEntity.ok(
                bfhlService.process(request)
        );

    }

}