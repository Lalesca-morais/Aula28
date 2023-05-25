package Exercicio1;
public class FabricaLampada {
    public Object construir(int tipoLampada) {
        if (tipoLampada == 1) {
            Fluorescente fluorescente = new Fluorescente();
            return fluorescente;
        } else if (tipoLampada == 2) {
            Incandescente incandescente = new Incandescente();
            return incandescente;
        }else {
            return null;
        }
    }
}

