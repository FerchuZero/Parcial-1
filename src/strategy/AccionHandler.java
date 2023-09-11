package src.strategy;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AccionHandler {
    private AccionHandler(){}

    private static final Map<Integer, Accion> strategy =
            List.of(new AccionCrearJuguete(),
                    new AccionClonarJuguete(),
                    new AccionEliminarJuguete(),
                    new AccionListarJuguetes())
                    .stream()
                    .collect(Collectors.toMap(Accion::getOpcion, Function.identity()));

    public static Map<Integer, Accion> getStrategy() {
        return strategy;
    }
}
