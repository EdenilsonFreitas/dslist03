package com.devsuperior.dslist03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist03.dto.GameMinDTO;
import com.devsuperior.dslist03.entities.Game;
import com.devsuperior.dslist03.repositories.GameRepository;

@Service
public class GameService {
	
	

	@Autowired
	
	private GameRepository gameRepository;
	public List<GameMinDTO> findAll(){
		
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x-> new GameMinDTO(x)).toList();
		
		return dto;
		
	}
}
