package src.singleton;

import src.juguetes.Juguete;
import src.strategy.Accion;
import src.strategy.AccionHandler;

import java.util.*;


public class Menu {
    private static Menu instance;
    public static Set<Juguete> juguetes = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    private Menu() {
    }

    public static Menu getInstance() {
        if (instance == null) instance = new Menu();
        return instance;
    }

    public static void mostrarMenu(){
        Map<Integer, Accion> menu = AccionHandler.getStrategy();
        int op = 10;

        boolean sw = true;
        do {
            System.out.println("");
            System.out.println(" - Juegueteria Pacheli - ");
            System.out.println("Elija una opción ->");
            menu.forEach((integer, accion) -> {
                System.out.println(accion.getOpcion() + " - " + accion);
            });
            System.out.println("10 - Salir");

            try{
                op = scanner.nextInt();
                menu.get(op).aplicar();
                sw = true;
            }catch (Exception ex){
                System.out.println("");
                System.out.println(" ¡ERROR - Opcion no valida! ");
                System.out.println("");
                sw = true;
            }

            if (op == 10){
                sw = false;
            }
        }while (sw);





    }



}
