package br.com.u2d.certificado;

import java.util.Arrays;

/**
 * @author David Jeremias - u2dtecnologia@gmail.com
 * Data: 19/05/2019 - 13:02
 */
public enum TipoCertificadoEnum {

    REPOSITORIO_WINDOWS ("windows"),
    REPOSITORIO_MAC("mac"),
    ARQUIVO("arquivo"),
    ARQUIVO_BYTES("arquivo_bytes"),
    TOKEN_A3("a3");

    private final String descricao;

    TipoCertificadoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCertificadoEnum valueOfDescricao(String descricao) {
        return Arrays.stream(values()).filter(x -> x.getDescricao().equals(descricao)).findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
