public class TesteConta {
    public static void main(String[] args)
    {
        Conta contaCorrente = new Conta(500, "Corrente");
        Conta contaPoupanca = new Conta(500, "Poupanca");

        System.out.println("=========================================");
        System.out.println("DEPÓSITO, SAQUE E TRANSFERÊNCIA");
        System.out.println("=========================================");

        // DEPÓSITO CONTA CORRENTE

        System.out.println("Depósito de 500 reais na conta do tipo corrente:");  // true
        System.out.println(contaCorrente.depositar(500) + "\n");

        System.out.println("Depósito de 1500 reais na conta do tipo corrente:"); // false, pois de acordo com a regra de negócio o depósito não
        System.out.println(contaCorrente.depositar(1500) + "\n");          // pode ser maior que 1000 se a conta for do tipo corrente

        // DEPÓSITO CONTA POUPANÇA

        System.out.println("Depósito de 1500 reais na conta do tipo poupança:");// true
        System.out.println(contaPoupanca.depositar(500) + "\n");

        // SAQUE CONTA CORRENTE

        System.out.println("Saque de 500 reais na conta do tipo corrente:"); // true
        System.out.println(contaCorrente.sacar(500) + "\n");

        System.out.println("Saque de 600 reais na conta do tipo corrente:"); // false, pois o valor do saque não
        System.out.println(contaCorrente.sacar(600) + "\n");           // pode ser maior que o saldo da conta

        // SAQUE CONTA POUPANÇA

        System.out.println("Saque de 500 reais na conta do tipo poupança");  // true
        System.out.println(contaPoupanca.sacar(500) + "\n");

        System.out.println("Saque de 600 reais na conta do tipo poupança"); // false, pois o valor do saque não
        System.out.println(contaPoupanca.sacar(600) + "\n");          // pode ser maior que o saldo da conta

        // TRANSFERÊNCIA DA CONTA CORRENTE PARA CONTA POUPANÇA

        System.out.println("Transferência da conta corrente para conta poupança:"); // true
        System.out.println(contaCorrente.transferir(200, contaPoupanca) + "\n");

        // TRANSFERÊNCIA CONTA POUPANÇA PARA CONTA CORRENTE

        System.out.println("Transferência da conta poupança para conta corrente");      // false, pois a conta poupança
        System.out.println(contaPoupanca.transferir(200, contaCorrente) + "\n");  // não pode fazer transferências







    }



}
