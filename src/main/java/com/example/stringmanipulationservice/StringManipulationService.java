// package com.example.stringmanipulationservice;

// import jakarta.jws.WebMethod;
// import jakarta.jws.WebService;

// @WebService
// public class StringManipulationService {
//     // Reverse the input text
//     @WebMethod
//     public String reverseText(String text) {
//         // StringBuilder sb = new StringBuilder(text);
//         // return sb.reverse().toString();
//         System.out.println("Received text: " + text); // Log the input
//         if (text == null) {
//             throw new IllegalArgumentException("Input text cannot be null");
//         }
//         StringBuilder sb = new StringBuilder(text);
//         return sb.reverse().toString();
//     }

//     // Count characters in the input text
//     @WebMethod
//     public int countCharacters(String text) {
//         return text != null ? text.length() : 0;
//     }
// }



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
