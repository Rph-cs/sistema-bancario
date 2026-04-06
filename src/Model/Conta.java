package Model;
import Enum.StatusConta;

public abstract class Conta {
    private int numeroConta;
    private double saldo;
    private StatusConta statusConta;


    protected Conta(double saldo, StatusConta statusConta) {
        this.saldo = saldo;
        this.statusConta = statusConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public StatusConta getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(StatusConta statusConta) {
        this.statusConta = statusConta;
    }
}
