package ar.edu.utn.iaa;

public class Animal {

    private int cantidadPatas;
    private boolean hasBrazos;
    private boolean hasAletas;
    private boolean hasAlas;

    private boolean hasPelo;
    private boolean hasPlumas;

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public boolean hasBrazos() {
        return hasBrazos;
    }

    public boolean hasAletas() {
        return hasAletas;
    }

    public boolean hasAlas() {
        return hasAlas;
    }

    public boolean hasPelo() {
        return hasPelo;
    }

    public boolean hasPlumas() {
        return hasPlumas;
    }

    public boolean hasPatas() {
        return getCantidadPatas() > 0;
    }

    public final static class AnimalBuilder {

        private final Animal animal = new Animal();

        public AnimalBuilder conPatas(final int cantidadPatas) {
            animal.cantidadPatas = cantidadPatas;
            return this;
        }

        public AnimalBuilder conAletas() {
            animal.hasAletas = true;
            return this;
        }

        public AnimalBuilder conBrazos() {
            animal.hasBrazos = true;
            return this;
        }

        public AnimalBuilder conAlas() {
            animal.hasAlas = true;
            return this;
        }

        public AnimalBuilder conPelo() {
            animal.hasPelo = true;
            return this;
        }

        public AnimalBuilder conPlumas() {
            animal.hasPlumas = true;
            return this;
        }

        public Animal build() {
            return animal;
        }
    }
}
