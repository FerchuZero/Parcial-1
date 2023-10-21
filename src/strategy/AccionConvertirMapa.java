package src.strategy;

import src.juguetes.Juguete;
import src.singleton.Menu;
import java.util.stream.Collectors;

public class AccionConvertirMapa implements Accion{

    private Menu menu = Menu.getInstance();

    @Override
    public void aplicar() {
        if (menu.juguetes.isEmpty()){
            System.out.println(" !No hay juguetes¡ ");
        }else {
            menu.juguetes.stream()
                    .collect(Collectors.toMap(Juguete::getId, juguete -> juguete))
                    .forEach((id, juguete) -> System.out.println("Key ->" + id + " / Value -> " + juguete));
        }
    }

    @Override
    public int getOpcion() {
        return 7;
    }

    @Override
    public String toString() {return "Convertir el Set de Juguetes a un Mapa";}
}
