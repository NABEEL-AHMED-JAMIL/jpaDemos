package com.example.jpaDemos.read.google.driver.sheet.data.repository;

import com.example.jpaDemos.read.google.driver.sheet.data.model.DeletableModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Lycus 01 on 7/19/2017.
 */
@NoRepositoryBean
public interface DeletableModelRepository <T extends DeletableModel> extends PagingAndSortingRepository<T, Long> {
        
    @Override
    @Query( "select m from #{#entityName} m where m.deletedAt IS NULL Order By m.id" )
    public List<T> findAll();
        
}
