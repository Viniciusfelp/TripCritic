package br.com.tripcritic.models.avaliacao;

public record AvaliacaoRequest(Long usuarioId, Long pontoTuristicoId, Integer nota, String comentario) {
}
