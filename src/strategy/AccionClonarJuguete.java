package src.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.juguetes.Juguete;
import src.singleton.Menu;

public class AccionClonarJuguete implements Accion{

    private Menu menu = Menu.getInstance();

    @Override
    public void aplicar() {
        List<Juguete> juguetes = new ArrayList<>(menu.juguetes);

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println(" ¿Que elemento desea clonar? ");
        System.out.println();

        System.out.println(" -Juguetes- ");
        juguetes.forEach(System.out::println);
        System.out.println("Ingrese el Id ->");
        int idJuguete = scanner.nextInt();

        System.out.println();
        System.out.println("Numero de clones -> ");
        int numeroClones = scanner.nextInt();

        Juguete juguete = menu.juguetes.stream()
                .filter(juguete1 -> juguete1.getId() == idJuguete)
                .findFirst()
                .orElse(null);

        try {
            if (juguete == null){
                System.out.println();
                System.out.println(" -Juguete no encontrado- 'Digite bien el Id'");
            }else {
                for (int i = 0; i < numeroClones; i++) {
                    menu.juguetes.add(juguete.clone(menu.juguetes.size()));
                }
            }
        } catch (Exception e) {
            System.out.println();
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
