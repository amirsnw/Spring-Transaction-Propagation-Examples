package com.vipul.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vipul.entity.Person;

@Repository
public interface PersonDAO extends JpaRepository<Person, Long> {

}
