public class Conta {
    private double saldo;
    private String tipo;

    public Conta(double valorInicial) {
        this(valorInicial, "Corrente");
    }

    public Conta(double valorInicial, String tipo) {
        this.saldo = valorInicial;
        this.tipo = tipo;
    }

    public boolean depositar(double valor) {
        if(tipo == "Corrente" && valor > 1000) {
            return false;
        }
        saldo = saldo + valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            return false;
        }
        saldo = saldo - valor;
        return true;
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if (contaDestino.tipo == "Corrente" || valor > saldo || valor <= 0) {
            return false;
        }
        saldo = saldo - valor;
        return contaDestino.depositar(valor);
    }


}
