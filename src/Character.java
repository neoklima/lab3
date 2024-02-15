abstract class Character implements Interactable, Speakable {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void interact() {
        System.out.println(name + " говорит Привет!");
    }

    @Override
    public void speak() {
        System.out.println(name + " говорит что-то важное.");
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return name.equals(character.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}