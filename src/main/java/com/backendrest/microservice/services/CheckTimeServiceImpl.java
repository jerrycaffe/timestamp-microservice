package com.backendrest.microservice.services;

import com.backendrest.microservice.model.CheckTime;
import com.backendrest.microservice.model.ErrorResponse;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

import java.util.Date;


@Service
public class CheckTimeServiceImpl implements CheckTimeService {


    @Override
    public CheckTime convertNoArgs() {
        Date now = new Date();
        Long unix = now.getTime();
        String utc = now.toString();
        CheckTime result = new CheckTime(unix, utc);
        return result;
    }

    @Override
    public CheckTime convert(String date)  {


        Long unix;
        String utc;
        Boolean isNotMilliSecond = date.contains("-");

        if (!isNotMilliSecond) {

            SimpleDateFormat formatter = new SimpleDateFormat("EE, dd MMM yyyy hh:mm:ss 'GMT'");
            utc = formatter.format(new Date(Long.parseLong(date)));

            unix = Long.parseLong(date);


        } else {

            DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("EE, dd MMM yyyy '00:00:00' 'GMT'");
            DateTimeFormatter expectedDatePattern = DateTimeFormatter.ofPattern("uuuu-MM-dd");
            LocalDate parsedDate = LocalDate.parse(date, expectedDatePattern);
            utc = parsedDate.format(datePattern);
            String addLeadingZeros = (parsedDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC)) + "000";
            unix = Long.valueOf(addLeadingZeros);

        }

        return new CheckTime(unix, utc);


    }
}
