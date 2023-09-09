package src.singleton;

import src.juguetes.Juguete;
import src.strategy.Accion;
import src.strategy.AccionHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Menu {
    private static Menu instance;
    private static List<Juguete> juguetes = new ArrayList<>();
    public static int rgid = juguetes.size();
    private static Scanner scanner = new Scanner(System.in);

    private Menu() {
    }

    public static Menu getInstance() {
        if (instance == null) instance = new Menu();
        return instance;
    }

    public static void mostrarMenu(){
        Map<Integer, Accion> menu = AccionHandler.getStrategy();
        int op = 5;

        boolean sw = true;
        do {
            System.out.println(" - Juegueteria donde El Mono - ");
            System.out.println("Elija una opción ->");
            menu.forEach((integer, accion) -> {
                System.out.println(accion.getOpcion() + " - " + accion);
            });
            System.out.println("5 - Salir");

            try{
                op = scanner.nextInt();
                menu.get(op).aplicar();
            }catch (Exception ex){
                System.out.println(" ¡ERROR - " + ex.toString());
            }

            if (op == 5){
                sw = false;
            }
        }while (sw);





    }



}
