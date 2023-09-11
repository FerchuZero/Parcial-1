package src.strategy;

import java.util.Collections;
import java.util.Scanner;
import src.juguetes.Juguete;
import src.singleton.Menu;

public class AccionEliminarJuguete implements Accion{

    private static Scanner scanner = new Scanner(System.in);
    private Menu menu = Menu.getInstance();

    @Override
    public void aplicar() {
        System.out.println("");
        System.out.println(" ¿Que elemento desea eliminar? ");
        System.out.println("");

        try {
            if(menu.juguetes.isEmpty()){
                    System.out.println("");
                    System.out.println(" -No hay juguetes disponibles- 'Debes crear uno nuevo'");
                    System.out.println("");
            }else{
                System.out.println(" -Juguetes- ");
                for (int i = 0; i < menu.juguetes.size(); i++) {
                    System.out.println(menu.juguetes.get(i).toString());
                }

                System.out.println("Ingrese el Id ->");
                int elm = scanner.nextInt();
                
                for (Juguete juguete : menu.juguetes) {
                if (juguete.getId() == elm) {
                    menu.juguetes.remove(juguete);

                    System.out.println("");
                    System.out.println(" -Juguete eliminado- ");
                    System.out.println("");
                    break;
                    }
                }
            }
            

            for (int i = 0; i < menu.juguetes.size(); i++) {
                menu.juguetes.get(i).setId(i);
            }

            Collections.sort(menu.juguetes, (o1, o2) -> Integer.compare(o1.getId(), o2.getId()));

        } catch (Exception e) {
            System.out.println("");
            System.out.println(" -Juguete no encontrado- 'Digite bien el Id'");
        }
    }

    @Override
    public int getOpcion() {
        return 3;
    }

    public String toString() {
        return "Eliminar Juguete";
    }
}
