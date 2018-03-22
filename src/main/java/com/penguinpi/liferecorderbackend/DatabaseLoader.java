package com.penguinpi.liferecorderbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Mengnan Shi
 * @create 2018-03-22-15:05
 */

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final RecordRepository repository;

    @Autowired
    public DatabaseLoader(RecordRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Record("Stone","20180221","do nothing"));
    }
}
