package src.strategy;

import src.juguetes.CreadorCarrito;
import src.juguetes.CreadorPeluche;
import src.juguetes.Juguete;
import src.singleton.Menu;

import java.util.Scanner;

public class AccionCrearJuguete implements Accion{

    private static Scanner scanner = new Scanner(System.in);
    private CreadorPeluche creadorPeluche = new CreadorPeluche();
    private CreadorCarrito creadorCarrito = new CreadorCarrito();
    private Menu menu = Menu.getInstance();
    private Juguete juguete;

    @Override
    public void aplicar() {
        System.out.println("");
        System.out.println("¿Qué deseas crear? -> \n" +
                "1 - Peluche \n"+
                "2 - Carrito "
        );
        int op = scanner.nextInt();
        System.out.println("");

        try {
            if (op == 1){
                juguete = creadorPeluche.crear();
                menu.juguetes.add(juguete);
            }else if(op == 2){
                juguete = creadorCarrito.crear();
                menu.juguetes.add(juguete);
            }else{
                System.out.println("");
                System.out.println(" ¡Opción NO valida!");
                System.out.println("");
            }
        }catch (Exception ex){
            System.out.println("");
            System.out.println(" ¡ERROR - " + ex.toString());
            System.out.println("");
        }

    }

    @Override
    public int getOpcion() {
        return 1;
    }

    public String toString() {
        return "Crear Juguete";
    }
}
