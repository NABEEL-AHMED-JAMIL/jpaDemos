package com.example.jpaDemos.read.google.driver.sheet.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by Lycus 01 on 7/19/2017.
 */
@Entity
@Table(name = "Authority")
public class Authority extends DatedModel{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    private String name;

    public Authority() { super(); }

    public Authority(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonIgnore
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    @JsonIgnore
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Authority{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
