package com.spring.examen;
import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Day;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
@Component
public class DayRepository {
    private static final Map<String, Day> days = new HashMap<>();

    @PostConstruct
    public void initData() {
        Day monday = new Day();
        monday.setName("Monday");

        days.put(monday.getName(), monday);

        Day tuesday = new Day();
        tuesday.setName("Tuesday");

        days.put(tuesday.getName(), tuesday);

        Day wednesday = new Day();
        wednesday.setName("Wednesday");

        days.put(wednesday.getName(), wednesday);

        Day thursday = new Day();
        thursday.setName("Thursday");

        days.put(thursday.getName(),thursday);

        Day friday = new Day();
        friday.setName("Friday");

        days.put(friday.getName(), friday);

        Day saturday = new Day();
        saturday.setName("Saturday");

        days.put(saturday.getName(),saturday);

        Day sunday = new Day();
        sunday.setName("Sunday");

        days.put(sunday.getName(), sunday);

        Day lunes = new Day();
        lunes.setName("Lunes");

        days.put(lunes.getName(), monday);

        Day martes = new Day();
        martes.setName("Martes");

        days.put(martes.getName(), tuesday);

        Day miercoles = new Day();
        miercoles.setName("Miércoles");

        days.put(miercoles.getName(), wednesday);

        Day jueves = new Day();
        jueves.setName("Jueves");

        days.put(jueves.getName(),thursday);

        Day viernes = new Day();
        viernes.setName("Viernes");

        days.put(viernes.getName(), friday);

        Day sabado = new Day();
        sabado.setName("Sábado");

        days.put(sabado.getName(),saturday);

        Day domingo = new Day();
        domingo.setName("Domingo");

        days.put(domingo.getName(), sunday);
    }

    public Day findDay(String name) {
        Assert.notNull(name, "The day name must not be null");
        return days.get(name);
    }
}
