package com.keyonfire.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosEpisodio(
        @JsonAlias("Episode") Integer numeroEpisodio,
        @JsonAlias("Title") String titulo,
        @JsonAlias("Runtime") String duracion,
        @JsonAlias("Plot") String trama,
        @JsonAlias("imdbRating") Double rating,
        @JsonAlias("Director") String director,
        @JsonAlias("Writer") String escritor
) {
}
