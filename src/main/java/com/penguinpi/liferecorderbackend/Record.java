package com.penguinpi.liferecorderbackend;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Mengnan Shi
 * @create 2018-03-22-14:54
 */

@Data
@Entity
public class Record {
    private @Id @GeneratedValue Long id;
    private String userName;
    private String dateTime;
    private String description;

    private Record() {}

    public Record(String userName, String dateTime, String description){
        this.userName = userName;
        this.dateTime = dateTime;
        this.description = description;
    }

}
