package ar.edu.utn.iaa;

import java.util.Map;

public class Main {


    public static void main(final String[] args) {

        determinarClaseEImprimir(new Animal.AnimalBuilder().conAlas().conPatas(2).conPlumas().build());
        determinarClaseEImprimir(new Animal.AnimalBuilder().conPatas(4).conBrazos().conPelo().build());
        determinarClaseEImprimir(new Animal.AnimalBuilder().conAletas().build());
        determinarClaseEImprimir(new Animal.AnimalBuilder().conAlas().conPlumas().build());
    }

    private static void determinarClaseEImprimir(Animal animal) {

        final Map<ClaseAnimal, Integer> claseAnimal = AnimalClaseTreeResolver.resolverClase(animal);
        for (final Map.Entry<ClaseAnimal, Integer> entry : claseAnimal.entrySet()) {
            System.err.println("La probilidad de que sea " + entry.getKey() + " es del " + entry.getValue() + " %");
        }

        System.err.println("----------------------------");
    }
}
