package com.vignesh.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DbService {

    @Autowired
    DB Db;

    String getData() {
        return Db.getData();
    }
}
