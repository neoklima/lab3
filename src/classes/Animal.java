class Animal extends Character {
    private String species;

    public Animal(String name, String species) {
        super(name);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public void interact() {
        super.interact();
        System.out.println(getName() + " - представитель вида: " + species);
    }

    // Реализация метода speak() из интерфейса Speakable
    @Override
    public void speak() {
        System.out.println(getName() + " издает звуки.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
