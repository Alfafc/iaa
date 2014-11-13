package ar.edu.utn.iaa;

public class ExtremidadesTreeResolver {

    public static ClaseAnimal resolverClase(final Animal animal) {

        if (!animal.hasPatas()) {
            if (animal.hasAletas())
                return ClaseAnimal.ACUATICO;
            return ClaseAnimal.AEREO;
        } else if (animal.getCantidadPatas() == 2) {
            if (animal.hasAlas())
                return ClaseAnimal.AEREO;
        }

        return ClaseAnimal.TERRESTRE;
    }
}
