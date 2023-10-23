package src.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import src.juguetes.Juguete;
import src.singleton.Menu;

public class AccionEliminarJuguete implements Accion{

    private static Scanner scanner = new Scanner(System.in);
    private Menu menu = Menu.getInstance();

    @Override
    public void aplicar() {
        System.out.println();
        System.out.println(" ¿Que elemento desea eliminar? ");
        System.out.println();

        try {
            if(menu.juguetes.isEmpty()){
                    System.out.println();
                    System.out.println(" -No hay juguetes disponibles- 'Debes crear uno nuevo'");
                    System.out.println();
            }else{
                System.out.println(" -Juguetes- ");
                menu.juguetes.forEach(System.out::println);

                System.out.println("Ingrese el Id ->");
                int idJuguete = scanner.nextInt();
                
                for (Juguete juguete : menu.juguetes) {
                if (juguete.getId() == idJuguete) {
                    menu.juguetes.remove(juguete);

                    System.out.println();
                    System.out.println(" -Juguete eliminado- ");
                    System.out.println();
                    break;
                    }
                }
            }

            int asignadorIds = 1;
            for(Juguete juguete : menu.juguetes){
                juguete.setId(asignadorIds++);
            }

        } catch (Exception e) {
            System.out.println();
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
