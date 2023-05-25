package Exercicio2;
public class ContaCorrente implements CalculoTributos{
    @Override
    public double calcularTributo(double saldoCorrente) {
        saldoCorrente = saldoCorrente * 0.01;
        return saldoCorrente;
    }
}
