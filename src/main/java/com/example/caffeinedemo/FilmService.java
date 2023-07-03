package com.example.caffeinedemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class FilmService {


    @Cacheable("FilmsCache")
    public Films getFilms(String key) throws IOException {
        InputStream filmsInputStream = this.getClass().getResourceAsStream("/films.json");
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(filmsInputStream, Films.class);
    }
}
