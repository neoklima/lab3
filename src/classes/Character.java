abstract class Character implements Interactable, Speakable {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void mumble() {
        System.out.println(name + " бормочет что-то.");
    }

    public void look() {
        System.out.println(name + " смотрит вслед.");
    }

    public void runIn() {
        System.out.println(name + " прибежала.");
    }

    public void knock(Thing item) {
        System.out.println(name + " постучала обьектом : " + item.getName() + ".");
    }

    public void wander(Place place) {
        System.out.println(name + " заковыляла в : " + place.getName() + ".");
    }
    public void interact() {
        System.out.println(name + " взаимодействует с другим объектом.");
    }
    public void visit(Place place) {
        System.out.println(name + " посетил(а) место: " + place.getName());
    }
}
