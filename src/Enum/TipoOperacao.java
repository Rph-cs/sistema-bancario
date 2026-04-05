package Enum;

public enum TipoOperacao {
    DEPOSITO("Depósito"),
    SAQUE("Saque"),
    TRANSFERENCIA("Transferência");
    
    private final String nomeExibicao;

    TipoOperacao (String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }
    
    @Override
    public String toString() {
        return nomeExibicao;
    }
}
