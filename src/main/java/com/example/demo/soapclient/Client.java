package com.example.demo.soapclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import localhost.universities.GetUniversityRequest;
import localhost.universities.GetUniversityResponse;


public class Client extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(Client.class);

    public GetUniversityResponse getUniversity(String name) {

        GetUniversityRequest request = new GetUniversityRequest();
        request.setName(name);

        log.info("Looking for: " + name);

        GetUniversityResponse response = (GetUniversityResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/universities",
                        request);

        return response;
    }
}