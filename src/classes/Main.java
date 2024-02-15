public class Main {
    public static void main(String[] args) {
        FeelingGenerator feelingGenerator = new FeelingGenerator();

        MoominTroll moomin = new MoominTroll("Муми-тролль", feelingGenerator.generateRandomState());
        MoominTroll emma = new MoominTroll("Эмма", feelingGenerator.generateRandomState());

        Animal smurfik = new Animal("Смурфик", "Голубые гномики");
        Place darkness = new Place("темнота");
        Thing thing = new Thing("метла");


        emma.runIn();
        emma.mumble();
        emma.knock(thing);
        emma.wander(darkness);
        moomin.look();
        smurfik.look();
        moomin.setState(ObjectState.BAD);
        moomin.interact();
        moomin.setState(ObjectState.FORGOTTEN);
        moomin.interact();
        emma.visit(darkness);



    }
}