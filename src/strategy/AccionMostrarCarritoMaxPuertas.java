package src.strategy;

import src.juguetes.Carrito;
import src.juguetes.Juguete;
import src.singleton.Menu;

import java.util.Comparator;

public class AccionMostrarCarritoMaxPuertas implements Accion{

    private Menu menu = Menu.getInstance();

    @Override
    public void aplicar() {
        menu.juguetes.stream()
                .filter(juguete -> juguete instanceof Carrito)
                .max(Comparator.comparing(juguete -> ((Carrito) juguete).getNumeroPuertas() ))
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println(" !No hay carritos¡ "));
    }

    @Override
    public int getOpcion() {
        return 6;
    }

    @Override
    public String toString() {return "Mostrar Carrito con mas puertas";}
}
