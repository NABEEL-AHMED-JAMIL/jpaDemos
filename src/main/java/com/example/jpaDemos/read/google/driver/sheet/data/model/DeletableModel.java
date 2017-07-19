package com.example.jpaDemos.read.google.driver.sheet.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Lycus 01 on 7/19/2017.
 */
@MappedSuperclass
public abstract class DeletableModel extends DatedModel {


    @Column( name = "deleted_at" )
    private Timestamp deletedAt;
 
    public DeletableModel() {}
 
    @JsonIgnore
    public Timestamp getDeletedAt() { return deletedAt; }
 
    public void setDeletedAt( Timestamp deletedAt ) {
        this.deletedAt = deletedAt;
    }

    @JsonIgnore
    public boolean isDeleted() {
        return getDeletedAt() != null;
    }
}
