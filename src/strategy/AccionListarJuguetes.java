package src.strategy;

public class AccionListarJuguetes implements Accion{
    @Override
    public void aplicar() {

    }

    @Override
    public int getOpcion() {
        return 4;
    }

    public String toString() {
        return "Mostrar Juguete";
    }
}
