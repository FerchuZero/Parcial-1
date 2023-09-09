package src.singleton;

import src.Juguetes.Juguete;
import src.strategy.AccionHandler;

import java.util.ArrayList;
import java.util.List;


public class Menu {
    private static Menu instance;
    private static List<Juguete> juguetes = new ArrayList<>();
    public static int rgid = juguetes.size();

    private Menu() {
    }

    public static Menu getInstance() {
        if (instance == null) instance = new Menu();

        return instance;
    }

    public static void mostrarMenu(){

    }



}
