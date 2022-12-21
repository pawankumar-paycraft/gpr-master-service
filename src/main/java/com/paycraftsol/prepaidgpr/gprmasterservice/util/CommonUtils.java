package com.paycraftsol.prepaidgpr.gprmasterservice.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public class CommonUtils {

    private CommonUtils()
    {
        throw new IllegalStateException("Utility class");
    }

    public static String getMaskCardWithLastFourDigit1(String maskCardNo){
        String maskCard = "";
        try {
            if (maskCardNo != null && maskCardNo.length() > 11) {
                String middle = maskCardNo.substring(6, maskCardNo.length() - 4);
                String last = maskCardNo.substring(maskCardNo.length() - 4, maskCardNo.length());
                maskCard = middle + last;
            } else {
                maskCard = maskCardNo;
            }
        } catch (Exception e) {
            maskCard = null;
            e.printStackTrace();
        }

        return maskCard;

    }

    public static ResponseEntity<Object> getResponse(Object response, MediaType mediaType) {
        HttpHeaders headers = new HttpHeaders();
        //headers.add(Constants.AccessControl.ALLOW_ORIGIN, Constants.ASTERISK);
        headers.setContentType(mediaType);
        return new ResponseEntity<>(response, headers, HttpStatus.OK);
    }

    public static String getMaskCardNo(String cardNo) {
        String maskCard = "";
        try {
            if (cardNo != null && cardNo.length() > 11) {
                String first = cardNo.substring(0, 6);
                String middle = cardNo.substring(6, cardNo.length() - 4);
                String last = cardNo.substring(cardNo.length() - 4, cardNo.length());
                int middleLength = middle.length();
                StringBuilder bld = new StringBuilder("X");
                for (int i = 0; i < middleLength - 1; i++) {
                    bld.append("X");
                }
                maskCard = first + bld + last;
            } else {
                maskCard = cardNo;
            }
        } catch (Exception e) {
            maskCard = null;
            e.printStackTrace();
        }

        return maskCard;
    }

}
