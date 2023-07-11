package com.devcoutinho.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcoutinho.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
