package com.example.demo.service.interfacee;

import com.example.demo.dto.BfhlRequest;
import com.example.demo.dto.BfhlResponse;

public interface BfhlService {

    BfhlResponse process(BfhlRequest request);

}