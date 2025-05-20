package com.devsuperior.dslist03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist03.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
