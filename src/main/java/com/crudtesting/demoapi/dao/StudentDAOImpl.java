package com.crudtesting.demoapi.dao;

import com.crudtesting.demoapi.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository //supports scanning components, translates exception
public class StudentDAOImpl implements StudentDAO {

    //Define field for entity manager
    private EntityManager entityManager;

    //Inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    //Implement save method
    @Override
    @Transactional //since it is updating the database we use transactional of spring framework
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }
}








