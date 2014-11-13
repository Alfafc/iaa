package ar.edu.utn.iaa;

public class CoberturaCoporalTreeResolver {

    public static ClaseAnimal resolverClase(final Animal animal) {

        if (animal.hasPelo())
            return ClaseAnimal.TERRESTRE;

        if (animal.hasPlumas())
            return ClaseAnimal.AEREO;

        return ClaseAnimal.ACUATICO;
    }
}
