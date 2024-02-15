public class Main {
    public static void main(String[] args) {
        FeelingGenerator feelingGenerator = new FeelingGenerator();

        MoominTroll moomin = new MoominTroll("Муми-тролль", feelingGenerator.generateRandomState());
        MoominTroll emma = new MoominTroll("Эмма", feelingGenerator.generateRandomState());

        Animal snufkin = new Animal("Смурфик", "Голубые гномики");
        Thing guitar = new Thing("Гитара");
        Place forest = new Place("Лес");
        Event rain = new Event("Дождь");

        moomin.interact();
        emma.interact();
        snufkin.interact();

        moomin.speak();
        emma.speak();

        guitar.use();
        forest.visit();
        rain.occur();
    }
}