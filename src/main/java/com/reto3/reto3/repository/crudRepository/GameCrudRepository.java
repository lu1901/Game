package com.reto3.reto3.repository.crudRepository;

import com.reto3.reto3.entities.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameCrudRepository extends CrudRepository<Game,Integer> {
}
