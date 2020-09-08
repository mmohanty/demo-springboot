package com.example.demo.dao;

import com.example.demo.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@Slf4j
public class PersonRepository {

    private  static final Map<Long, Person> personMap = new HashMap<>();
    static {
        //long id, String name, String dob, String area
        personMap.put(1L, new Person(1l, "Manas", "01-01-84", "KPHB"));
        personMap.put(2L, new Person(2l, "Bikash", "01-01-94", "BLR"));
        personMap.put(3L, new Person(3l, "Neeta", "01-05-87", "KKP"));
    }
    public Person getPerson(long personId){
        try {
            log.info("Entered into repo, will wait for 100 ms before responding the query");
            Thread.sleep(100l);
        } catch (InterruptedException e) {
            log.error("Thread interrupted {}", e);
        }
        return personMap.get(personId);
    }
}
