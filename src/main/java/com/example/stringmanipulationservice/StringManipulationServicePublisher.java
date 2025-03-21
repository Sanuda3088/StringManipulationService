package com.example.stringmanipulationservice;

import jakarta.xml.ws.Endpoint;
import jakarta.jws.WebService;

@WebService
public class StringManipulationServicePublisher {
    public static void main(String[] args) {
        StringManipulationService service = new StringManipulationService();
        String url = "http://localhost:8080/StringManipulationService";
        Endpoint.publish(url, service);
        System.out.println("Service is running at: " + url);
    }
}
