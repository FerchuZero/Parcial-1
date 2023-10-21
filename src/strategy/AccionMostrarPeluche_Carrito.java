package src.strategy;

import src.juguetes.Carrito;
import src.juguetes.Juguete;
import src.juguetes.Peluche;
import src.singleton.Menu;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;

public class AccionMostrarPeluche_Carrito implements Accion{

    private static Scanner scanner = new Scanner(System.in);
    private Menu menu = Menu.getInstance();

    @Override
    public void aplicar() {
        System.out.println();
        System.out.println(" ¿Qué desea listar? ");
        System.out.println(" 1 -> Peluches ");
        System.out.println(" 2 -> Carritos ");

        try {
            int tipoJuguete = scanner.nextInt();
            mostrarTipoJuguete(tipoJuguete, menu.juguetes);
        }catch (Exception e){
            System.out.println();
            System.out.println(" !Error¡ - Carcter no valido ");
        }



    }

    @Override
    public int getOpcion() {
        return 5;
    }

    public String toString() {
        return "Mostrar Peluches o Carritos";
    }

    public static void mostrarTipoJuguete(int tipo, Set<Juguete> juguetes) {
        if (juguetes.isEmpty()){
            System.out.println(" !No hay juguetes¡");
        }else if (tipo == 1){
            juguetes.stream()
                    .filter(juguete -> juguete instanceof Peluche)
                    .sorted(Comparator.comparing(Juguete::getId, Comparator.reverseOrder()))
                    .forEach(System.out::println);
        } else if (tipo == 2) {
            juguetes.stream()
                    .filter(juguete -> juguete instanceof Carrito)
                    .sorted(Comparator.comparing(Juguete::getId, Comparator.reverseOrder()))
                    .forEach(System.out::println);
        }else {
            System.out.println();
            System.out.println(" !Opción no valida¡ ");
        }

    }

}

