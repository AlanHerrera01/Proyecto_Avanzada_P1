package com.grupobb.biblioteca.dto.Loan;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

public class LoanRequestData {

    @NotNull(message = "El usuarioId es obligatorio")
    @JsonProperty("usuarioId") // Acepta "usuarioId" en el JSON
    private Long usuarioId;

    @NotNull(message = "El libroId es obligatorio")
    @JsonProperty("libroId") // Acepta "libroId" en el JSON
    private Long libroId;

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getLibroId() {
        return libroId;
    }

    public void setLibroId(Long libroId) {
        this.libroId = libroId;
    }
}
