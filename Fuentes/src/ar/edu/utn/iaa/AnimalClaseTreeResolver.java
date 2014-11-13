package ar.edu.utn.iaa;

import java.util.HashMap;
import java.util.Map;

public class AnimalClaseTreeResolver {

    public static Map<ClaseAnimal, Integer> resolverClase(final Animal animal) {

        final Map<ClaseAnimal, Integer> probabilidadClaseAnimal = new HashMap<ClaseAnimal, Integer>(2);

        addProbilidad(probabilidadClaseAnimal, CoberturaCoporalTreeResolver.resolverClase(animal), 60);
        addProbilidad(probabilidadClaseAnimal, ExtremidadesTreeResolver.resolverClase(animal), 40);

        return probabilidadClaseAnimal;
    }

    private static void addProbilidad(final Map<ClaseAnimal, Integer> probabilidadClaseAnimal, final ClaseAnimal claseAnimal, final int probilidad) {

        Integer probilidadAnterior = probabilidadClaseAnimal.get(claseAnimal);
        if (probilidadAnterior == null) {
            probilidadAnterior = 0;
        }
        probabilidadClaseAnimal.put(claseAnimal, probilidad + probilidadAnterior);
    }
}
