package src.strategy;

import java.util.Scanner;

import src.juguetes.Juguete;
import src.singleton.Menu;

public class AccionClonarJuguete implements Accion{

    private Menu menu = Menu.getInstance();

    @Override
    public void aplicar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println(" ¿Que elemento desea clonar? ");
        System.out.println("");

        System.out.println(" -Juguetes- ");
        for (int i = 0; i < menu.juguetes.size(); i++) {
            System.out.println(menu.juguetes.get(i).toString());
        }
        System.out.println("Ingrese el Id ->");
        int elm = scanner.nextInt();

        System.out.println("");
        System.out.println("Numero de clones -> ");
        int nc = scanner.nextInt();

        Juguete juguete;
        try {
            juguete = menu.juguetes.get(elm);
            for (int i = 0; i < nc; i++) {
            menu.juguetes.add(juguete.clone(menu.juguetes.size()));
        }
        } catch (Exception e) {
            System.out.println("");
            System.out.println(" -Juguete no encontrado- 'Digite bien el Id'");
        }

    }

    @Override
    public int getOpcion() {
        return 2;
    }

    @Override
    public String toString() {
        return "Clonar Juguete";
    }
}
