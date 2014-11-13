package ar.edu.utn.iaa;

public enum ClaseAnimal {
    TERRESTRE("Terrestre", "Perro"),
    ACUATICO("Acuático", "Pez"),
    AEREO("Áereo", "Pájaro");

    private String tipo;
    private String animal;

    private ClaseAnimal(final String tipo, final String animal) {
        this.tipo = tipo;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return animal + "(" + tipo + ")";
    }
}
