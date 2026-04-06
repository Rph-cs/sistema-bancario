package Enum;

public enum StatusConta {
    ATIVA("Ativa"),
    INATIVA("Inativa");
    
    private final String nomeExibicao;

    StatusConta (String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    @Override
    public String toString() {
        return nomeExibicao;
    }
}
