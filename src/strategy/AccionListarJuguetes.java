package src.strategy;

import src.singleton.Menu;

public class AccionListarJuguetes implements Accion{

    private Menu menu = Menu.getInstance();

    @Override
    public void aplicar() {
        System.out.println();
        System.out.println(" -Juguetes- ");
        menu.juguetes.forEach(System.out::println);
        System.out.println();
    }

    @Override
    public int getOpcion() {
        return 4;
    }

    public String toString() {
        return "Mostrar Juguetes";
    }
}
