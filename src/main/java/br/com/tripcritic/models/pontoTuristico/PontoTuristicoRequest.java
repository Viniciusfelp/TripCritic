package br.com.tripcritic.models.pontoTuristico;

public record PontoTuristicoRequest(String nome, String descricao, Double latitude, Double longitude, Categoria categoria) {
}
