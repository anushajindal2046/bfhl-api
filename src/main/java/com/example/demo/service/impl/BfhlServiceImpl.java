package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.BfhlRequest;
import com.example.demo.dto.BfhlResponse;
import com.example.demo.service.interfacee.BfhlService;

@Service
public class BfhlServiceImpl implements BfhlService {

        @Override
        public BfhlResponse process(BfhlRequest request) {

                List<String> odd = new ArrayList<>();
                List<String> even = new ArrayList<>();
                List<String> alphabets = new ArrayList<>();
                List<String> special = new ArrayList<>();

                long sum = 0;

                StringBuilder alphaConcat = new StringBuilder();

                for (String item : request.getData()) {

                        if (item.matches("\\d+")) {

                                int num = Integer.parseInt(item);

                                sum += num;

                                if (num % 2 == 0)
                                        even.add(item);
                                else
                                        odd.add(item);

                        }

                        else if (item.matches("[a-zA-Z]+")) {

                                alphabets.add(
                                                item.toUpperCase());

                                alphaConcat.append(item);

                        }

                        else {

                                special.add(item);

                        }

                }

                return BfhlResponse.builder()
                                .is_success(true)

                                .user_id("anusha_jindal_20042006")

                                .email("anusha1616.be23@chitkara.edu.in")

                                .roll_number("2310991616")

                                .odd_numbers(odd)

                                .even_numbers(even)

                                .alphabets(alphabets)

                                .special_characters(special)

                                .sum(String.valueOf(sum))

                                .concat_string(
                                                createConcat(
                                                                alphaConcat.toString()))

                                .build();

        }

        private String createConcat(
                        String input) {

                String reversed = new StringBuilder(input)
                                .reverse()
                                .toString();

                StringBuilder result = new StringBuilder();

                for (int i = 0; i < reversed.length(); i++) {

                        if (i % 2 == 0) {

                                result.append(
                                                Character.toUpperCase(
                                                                reversed.charAt(i)));

                        }

                        else {

                                result.append(
                                                Character.toLowerCase(
                                                                reversed.charAt(i)));

                        }

                }

                return result.toString();
        }

}