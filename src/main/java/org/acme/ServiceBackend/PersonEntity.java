package org.acme.ServiceBackend;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "users")
public class PersonEntity extends PanacheEntity {

    @Column(nullable = false)
    public String name;
    @Column(nullable = false)
    public LocalDate birthday;
    @Column(nullable = false)
    public Status status; //Status ดึงมาจาก ENUM element ทีสร้างไว้

    public PersonEntity() {}

    public PersonEntity(String name, LocalDate birthday, Status status) {
        this.name = name;
        this.birthday = birthday;
        this.status = status;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDate getBirthday(){
        return birthday;
    }

    public void setBirthday(LocalDate birthday){
        this.birthday = birthday;
    }

    public Status getStatus(){
        return status;
    }

    public void setStatus(Status status){
        this.status = status;
    }

}
