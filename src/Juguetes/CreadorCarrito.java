package src.Juguetes;

import src.singleton.Menu;

import java.util.List;
import java.util.Scanner;

public class CreadorCarrito implements CreadorJuguete{

    private static Scanner scanner = new Scanner(System.in);

    @Override
    public Juguete crear() {
        System.out.println("Marca -> ");
        String marca = scanner.nextLine();

        System.out.println("Número de Puertas -> ");
        int numeroPuertas = scanner.nextInt();

        System.out.println("Color -> ");
        String color = scanner.nextLine();

        Carrito carrito = Carrito.builder()
                .id(Menu.rgid)
                .marca(marca)
                .numeroPuertas(numeroPuertas)
                .color(color)
                .build();

        return carrito;
    }
}
