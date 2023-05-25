package Exercicio2;
public class Exercicio02 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        System.out.println("Valor do imposto do seguro de vida: "+seguroDeVida.calcularTributo(1000));
        System.out.println("Valor do imposto da conta poupança: "+contaPoupanca.calcularTributo(1000));
        System.out.println("Valor do imposto da conta corrente: "+contaCorrente.calcularTributo(1000));
    }
}
