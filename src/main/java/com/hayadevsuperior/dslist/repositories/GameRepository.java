package com.hayadevsuperior.dslist.repositories;
import com.hayadevsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
