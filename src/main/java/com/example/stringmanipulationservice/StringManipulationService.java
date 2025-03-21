package com.example.stringmanipulationservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(targetNamespace = "http://stringmanipulationservice.example.com/")
public class StringManipulationService {

 
    @WebMethod
    public String reverseText(@WebParam(name = "text") String text) {
        if (text == null) {
            throw new IllegalArgumentException("Input text cannot be null");
        }
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }

   
    @WebMethod
    public int countCharacters(@WebParam(name = "text") String text) {
        return text != null ? text.length() : 0;
    }
}
