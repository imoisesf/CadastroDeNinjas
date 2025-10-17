package dev.java10x.CadastroDeNinjas;

public enum DificuldadeMissao {
    FACIL("Missão rank - D"),
    MEDIA("Missão rank - C"),
    DIFICIL("Missão rank - B"),
    AVANCADA("Missão rank - A"),
    IMPOSSIVEL("Missão rank - S");

    private final String valor;

    DificuldadeMissao(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
