package com.pokedex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokedex.entities.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Integer> {

}
