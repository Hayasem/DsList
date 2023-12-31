package com.hayadevsuperior.dslist.controllers;
import com.hayadevsuperior.dslist.dto.GameDTO;
import com.hayadevsuperior.dslist.dto.GameMinDTO;
import com.hayadevsuperior.dslist.entities.Game;
import com.hayadevsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findbyid(@PathVariable Long id) {
        GameDTO result = gameService.findbyid(id);
        return result;
    }
    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;

    }
}
