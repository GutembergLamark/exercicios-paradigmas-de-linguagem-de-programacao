class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo de " + titular + ": " + saldo);
    }

    
}

public class Main{
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000);
        conta.depositar(500);
        conta.sacar(200);
        conta.exibirSaldo();  
    }
}