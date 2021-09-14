package com.example.pokemon.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.pokemon.model.Pokemon;

@Database(entities = Pokemon.class,version=1,exportSchema = false)
public abstract class PokemonDatabase extends RoomDatabase {

    public abstract PokemonDao pokemonDao();
}
