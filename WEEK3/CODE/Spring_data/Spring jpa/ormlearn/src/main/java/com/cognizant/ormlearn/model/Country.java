package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "country")
@Data


public class Country {

    public Country() {}

    public Country(String code, String name) {
    this.code = code;
    this.name = name;
}
public void setName(String name) {
    this.name = name;
}

public String getName() {
    return name;
}


    @Id
    @Column(name = "co_code")
    private String code;

    @Column(name = "co_name")
    private String name;
}

