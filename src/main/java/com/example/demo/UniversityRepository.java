package com.example.demo;

import localhost.universities.University;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UniversityRepository {

    private Map<String, University> universities = new HashMap<>();

    @PostConstruct
    private void LoadData() {
        University strath = new University();
        strath.setName("Strathmore");
        strath.setLocation("Keri");
        strath.setYearFounded(1961);
        universities.put(strath.getName(), strath);

        University jkuat = new University();
        jkuat.setName("Juja Boys");
        jkuat.setLocation("Juja");
        jkuat.setYearFounded(1994);
        universities.put(jkuat.getName(), jkuat);

        University ku = new University();
        ku.setName("Kenyatta");
        ku.setLocation("Thika");
        ku.setYearFounded(1987);
        universities.put(ku.getName(), ku);

    }

    public University getUniversityByName(String name) {
        return universities.get(name);
    }

}
