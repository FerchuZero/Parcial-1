package src.strategy;

import src.Juguetes.CreadorCarrito;
import src.Juguetes.CreadorPeluche;

import java.util.Scanner;

public class AccionCrearJuguete implements Accion{

    private static Scanner scanner = new Scanner(System.in);
    private CreadorPeluche creadorPeluche = new CreadorPeluche();
    private CreadorCarrito creadorCarrito = new CreadorCarrito();

    @Override
    public void aplicar() {
        System.out.println("¿Qué deseas crear? -> \n" +
                "1 - Peluche \n"+
                "2 - Carrito \n"
        );
        int op = scanner.nextInt();

        try {
            if (op == 1){
                creadorPeluche.crear();
            }else if(op == 2){
                creadorCarrito.crear();
            }else{
                System.out.println(" ¡Opción NO valida!");
            }
        }catch (Exception ex){
            System.out.println(" ¡ERROR - " + ex.toString());
        }

    }

    @Override
    public int getOpcion() {
        return 1;
    }
}
