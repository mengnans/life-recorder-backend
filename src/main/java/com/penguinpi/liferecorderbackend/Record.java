package com.penguinpi.liferecorderbackend;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 * @author Mengnan Shi
 * @create 2018-03-22-14:54
 */

@Data
@Entity
@Table(name="life_Record")
public class Record {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String dateTimeOfTheEvent;
    private String descriptionOfTheEvent;

    private @Version @JsonIgnore Long version;

    private Record() {}

    public Record(String userName, String dateTimeOfTheEvent, String descriptionOfTheEvent){
        this.userName = userName;
        this.dateTimeOfTheEvent = dateTimeOfTheEvent;
        this.descriptionOfTheEvent = descriptionOfTheEvent;
    }

//    @Column(name="id")
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @Column(name="username")
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    @Column(name="dateTimeOfTheEvent")
//    public String getDateTimeOfTheEvent() {
//        return dateTimeOfTheEvent;
//    }
//
//    public void setDateTimeOfTheEvent(String dateTimeOfTheEvent) {
//        this.dateTimeOfTheEvent = dateTimeOfTheEvent;
//    }
//
//    @Column(name="descriptionOfTheEvent")
//    public String getDescriptionOfTheEvent() {
//        return descriptionOfTheEvent;
//    }
//
//    public void setDescriptionOfTheEvent(String descriptionOfTheEvent) {
//        this.descriptionOfTheEvent = descriptionOfTheEvent;
//    }
}
