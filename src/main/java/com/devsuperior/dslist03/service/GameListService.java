package com.devsuperior.dslist03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist03.dto.GameListDTO;
import com.devsuperior.dslist03.entities.GameList;
import com.devsuperior.dslist03.repositories.GameListRepository;

@Service
public class GameListService {
	
	

	@Autowired
	
	private GameListRepository gameListRepository;
	

	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(GameListDTO::new).toList();
	}
}
