package com.zhengyang.dao;

import com.zhengyang.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDAO {

    int insertPerson(UUID id, Person person);
    //the method in the interface has body call default method
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);
    int deletePersonById(UUID id);

    int updatePersonById(UUID id,Person person);

}
