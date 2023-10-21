package src.strategy;

import src.juguetes.Juguete;
import src.singleton.Menu;

import java.util.*;

public class AccionEliminarJugueteColor implements Accion{

    private static Scanner scanner = new Scanner(System.in);
    private Menu menu = Menu.getInstance();
    @Override
    public void aplicar() {
        Map<Integer, String> colores = new HashMap<>();
        Set<String> coloresSet = new HashSet<>();


        menu.juguetes.stream()
                .forEach(juguete ->{
                    coloresSet.add(juguete.getColor());
                });

        coloresSet.stream().forEach(color -> colores.put(colores.size(), color));

        System.out.println();
        System.out.println(" -Colores- ");
        colores.forEach((integer, color) -> System.out.println(integer + " -> " + color) );

        try {
            Integer color = scanner.nextInt();

            for (Juguete juguete : menu.juguetes) {
                if (juguete.getColor() == colores.get(color)) {
                    for (int i = 0; i < menu.juguetes.size(); i++) {
                        menu.juguetes.remove(juguete);
                    }

                    System.out.println();
                    System.out.println(" -Juguete eliminado- ");
                    System.out.println();
                    break;
                }
            }
        }catch (Exception e){
            System.out.println();
            System.out.println(" -Color no encontrado- 'Digite bien la Key'");
        }


    }

    @Override
    public int getOpcion() {
        return 8;
    }

    @Override
    public String toString() {return "Eliminar juguete por color";}
}
