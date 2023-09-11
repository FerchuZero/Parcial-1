package src.juguetes;

import src.singleton.Menu;

import java.util.Scanner;

public class CreadorCarrito implements CreadorJuguete{

    private static Scanner scanner = new Scanner(System.in);
    private Menu menu = Menu.getInstance();

    @Override
    public Juguete crear() {
        System.out.println("Marca -> ");
        String marca = scanner.nextLine();

        System.out.println("Número de Puertas -> ");
        int numeroPuertas = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Color -> ");
        String color = scanner.nextLine();

        Carrito carrito = Carrito.builder()
                .id(menu.juguetes.size())
                .marca(marca)
                .numeroPuertas(numeroPuertas)
                .color(color)
                .build();

        return carrito;
    }
}
