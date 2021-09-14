package com.example.pokemon.di;

import android.app.Application;

import androidx.room.Room;

import com.example.pokemon.db.PokemonDao;
import com.example.pokemon.db.PokemonDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

@Module
@InstallIn(ApplicationComponent.class)
public class PokemonModule {
    @Provides
    @Singleton
    public static PokemonDatabase provideDb(Application application){
        return Room.databaseBuilder(application,PokemonDatabase.class,"fav_db")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
    }
    @Provides
    @Singleton
    public static PokemonDao provideDao(PokemonDatabase pokemonDatabase){
        return pokemonDatabase.pokemonDao();

    }
}
