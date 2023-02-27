package org.example.configuration.service;

import java.util.Date;

public class DateUtil {
    public String getDate(){
        try {
            Date date = null;
            return date.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}