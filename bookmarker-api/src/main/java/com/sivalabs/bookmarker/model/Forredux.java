package com.sivalabs.bookmarker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.Instant;

@Entity
@Data
@Getter
@Setter

public class Forredux {
    @Id
    private  Long id;
    private String name ;
    private String fields;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public Forredux() {
    }

    public Forredux(Long id, String name, String fields) {
        this.id = id;
        this.name = name;
        this.fields = fields;
    }
}
