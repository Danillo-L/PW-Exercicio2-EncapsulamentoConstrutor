public class TesteConta {
    public static void main(String[] args)
    {
        Conta contaCorrente = new Conta(3000, "Corrente");
        Conta contaPoupanca = new Conta(3000, "Poupanca");

        System.out.println("=========================================");
        System.out.println("DEPÓSITO, SAQUE E TRANSFERÊNCIA");
        System.out.println("=========================================");

        // DEPÓSITO CONTA CORRENTE
        System.out.println("Depósito de 1500 reais na conta do tipo corrente:");  // false, pois o valor depositado na conta
        System.out.println(contaCorrente.depositar(1500) + "\n");            // corrente não pode ser maior que 1000

        // DEPÓSITO CONTA POUPANÇA
        System.out.println("Depósito de 1500 reais na conta do tipo poupança:");// true
        System.out.println(contaPoupanca.depositar(1500) + "\n");

        System.out.println("Depósito de 98,52 reais na conta do tipo poupança:");// true
        System.out.println(contaPoupanca.depositar(98.52) + "\n");

        // SAQUE 100 REAIS CONTA POUPANÇA
        System.out.println("Saque de 100 reais na conta do tipo poupança");  // true
        System.out.println(contaPoupanca.sacar(100) + "\n");

        // TRANSFERÊNCIA DA CONTA CORRENTE PARA CONTA POUPANÇA
        System.out.println("Transferência de 1800 reais da conta corrente para conta poupança:"); // true
        System.out.println(contaCorrente.transferir(1800, contaPoupanca) + "\n");

        // TRANSFERÊNCIA CONTA POUPANÇA PARA CONTA CORRENTE
        System.out.println("Transferência de 700 reais da conta poupança para conta corrente");  // false, pois a conta poupança
        System.out.println(contaPoupanca.transferir(700, contaCorrente) + "\n");           // não pode fazer transferências

        // SAQUE 1000 REAIS CONTA POUPANÇA
        System.out.println("Saque de 1000 reais da conta poupança");
        System.out.println(contaPoupanca.sacar(1000) + "\n");

        // SAQUE 1000 REAIS CONTA CORRENTE
        System.out.println("Saque de 1000 reais da conta corrente"); // true
        System.out.println(contaCorrente.sacar(1000) + "\n");









    }



}
