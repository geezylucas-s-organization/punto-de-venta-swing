/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author geezylucas
 */
public class Functions {

    public static boolean dynamicDate() {
        ZoneId zoneId = ZoneId.of("America/Mexico_City");
        LocalDate today = LocalDate.now(zoneId);

        LocalDateTime todayWithTime = LocalDateTime.now(zoneId);

        String timeStart = "23:00";
        String timeEnd = "07:00";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTimeStart = LocalDateTime.parse(today + timeStart, formatter);
        LocalDateTime dateTimeEnd = LocalDateTime.parse(today + timeEnd, formatter);

        return (!todayWithTime.isBefore(dateTimeStart)) && (todayWithTime.isBefore(dateTimeEnd));
    }
}
