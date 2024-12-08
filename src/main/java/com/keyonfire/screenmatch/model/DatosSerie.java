package com.keyonfire.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosSerie(
        // JsonAlias permite serializar variables de JSON a tus variables JAVA
        // JsonProperty deserializa convierte tu variable a una JSON y viceversa
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") Integer totalDeTemporadas,
        @JsonAlias("imdbRating") String rating
) { }
