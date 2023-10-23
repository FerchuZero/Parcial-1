package src.strategy;

import src.juguetes.Juguete;
import src.singleton.Menu;

import java.util.*;
import java.util.stream.IntStream;

public class AccionEliminarJugueteColor implements Accion{

    private static Scanner scanner = new Scanner(System.in);
    private Menu menu = Menu.getInstance();
    @Override
    public void aplicar() {
        Map<Integer, String> colores = new HashMap<>();
        Set<String> coloresSet = new HashSet<>();
        List<Juguete> juguetesList = new ArrayList<>(menu.juguetes);
        Boolean jugueteEliminado = false;

        menu.juguetes.stream()
                .forEach(juguete ->{
                    coloresSet.add(juguete.getColor());
                });

        coloresSet.stream().forEach(color -> colores.put(colores.size(), color));

        System.out.println();
        System.out.println(" -Colores- ");
        colores.forEach((integer, color) -> System.out.println(integer + " -> " + color) );

        try {
            Integer colorEliminar = scanner.nextInt();
            String colorString = colores.get(colorEliminar);

            for (Juguete juguete : juguetesList) {
                if (juguete.getColor() == colorString) {
                    menu.juguetes.remove(juguete);

                    System.out.println();
                    System.out.println(" -Juguete eliminado- ");
                    System.out.println();

                    jugueteEliminado = true;
                }
            }

            int asignadorIds = 1;
            if (jugueteEliminado) {
                for(Juguete juguete : menu.juguetes){
                    juguete.setId(asignadorIds++);
                }
            }
            
        }catch (Exception e){
            System.out.println();
            System.out.println(e);
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
