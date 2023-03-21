package com.example.validator;

import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidadorService {
    public Boolean validar(Persona persona){

    String email = persona.getEmail();
    String patronEmail = "^([a-zA-Z0-9._%+-]+)@([a-zA-Z0-9.-]+)\\.([a-zA-Z]{2,})$";

    String job = persona.getJobTitle();
    List<String> patronJob = List.of( "Haematologist", "Phytotherapist", "Building surveyor",
            "Insurance account manager", "Educational psychologist");

    Pattern pattern = Pattern.compile(patronEmail);
    Matcher matcher = pattern.matcher(email);

    String startDate = persona.getDateOfBirth();
    String endDate = "1980-01-01";

        try {
            Date start = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
                    .parse(startDate);
            Date end = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
                    .parse(endDate);

            if (matcher.matches() && patronJob.contains(job) && start.compareTo(end) > 0) {
                System.out.println("Es válido");
                return true;
            } else {
                System.out.println("Es inválido");
                return false;
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
            return false;


    }
}
