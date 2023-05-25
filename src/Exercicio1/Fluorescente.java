package Exercicio1;
public class Fluorescente extends FabricaLampada implements Lampada {
    @Override
    public void ligar() {
        System.out.println("Lâmpada ligada!");
    }
    @Override
    public void desligar() {
        System.out.println("Lâmpada desligada!");
    }
}
