package com.example.demo;

import com.example.demo.dto.BfhlRequest;
import com.example.demo.dto.BfhlResponse;
import com.example.demo.service.impl.BfhlServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BfhlServiceTest {

    BfhlServiceImpl service =
            new BfhlServiceImpl();

    @Test
    void testCase1(){

        BfhlRequest request =
                new BfhlRequest();

        request.setData(
                List.of(
                        "a","1","334","4","R","$"
                )
        );

        BfhlResponse response =
                service.process(request);

        assertEquals(
                "339",
                response.getSum()
        );
    }
}