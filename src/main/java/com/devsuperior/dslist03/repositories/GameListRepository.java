package com.devsuperior.dslist03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist03.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
