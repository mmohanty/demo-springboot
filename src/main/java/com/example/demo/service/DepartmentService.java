package com.example.demo.service;

import com.example.demo.dao.PersonRepository;
import com.example.demo.model.Person;
import com.manas.learning.springboot.caching.config.CacheTTL;
import com.manas.learning.springboot.caching.config.CacheTTLEvict;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DepartmentService {


    @CacheTTLEvict(cacheNames={"person"})
    public boolean deleteDepartment(long departmentId){
        log.info("Deleted department {} ", departmentId);
        return true;
    }
}
