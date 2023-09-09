package src.Juguetes;

import src.singleton.Menu;
import java.util.Scanner;

public class CreadorPeluche implements CreadorJuguete{

    private static Scanner scanner = new Scanner(System.in);

    @Override
    public Juguete crear() {
        System.out.println("Material Exterior -> ");
        String materialExterior = scanner.nextLine();

        System.out.println("Relleno -> ");
        String relleno = scanner.nextLine();

        System.out.println("Color -> ");
        String color = scanner.nextLine();

        Peluche peluche = Peluche.builder()
                .id(Menu.rgid)
                .materialExterior(materialExterior)
                .relleno(relleno)
                .color(color)
                .build();

        return peluche;
    }
}
