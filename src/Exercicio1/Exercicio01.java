package Exercicio1;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        FabricaLampada fabricaLampada = new FabricaLampada();

        System.out.println("Digite qual tipo de lâmpada deseja criar: \n(1 - Fluorescente ou 2 - Incandescente)");
        int tipoLampada = entrada.nextInt();
        if (tipoLampada == 1) {
            System.out.println("Lâmpada Flourescente criada!");
        }else if (tipoLampada == 2) {
            System.out.println("Lâmpada Incandescente criada!");
        }
        Lampada fabricaLampada1 = (Lampada) fabricaLampada.construir(tipoLampada);

        fabricaLampada1.ligar();
        System.out.println("Deseja desligar a lâmpada? \n (1 - SIM ou 2 - NÃO)");
        double opcaoUsuario = entrada.nextDouble();
        if (opcaoUsuario == 1) {
            fabricaLampada1.desligar();
        }else {
            fabricaLampada1.ligar();
        }
    }
}
