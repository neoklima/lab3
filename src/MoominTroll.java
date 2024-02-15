class MoominTroll extends Character {
    private ObjectState state;

    public MoominTroll(String name, ObjectState state) {
        super(name);
        this.state = state;
    }

    public ObjectState getState() {
        return state;
    }

    public void setState(ObjectState state) {
        this.state = state;
    }

    @Override
    public void interact() {
        super.interact();
        switch (state) {
            case NORMAL:
                System.out.println(getName() + " чувствует себя хорошо.");
                break;
            case CONFUSED:
                System.out.println(getName() + " в растерянности.");
                break;
            case BAD:
                System.out.println(getName() + " не в настроении.");
                break;
        }
    }

    @Override
    public String toString() {
        return "MoominTroll{" +
                "name='" + getName() + '\'' +
                ", state=" + state +
                '}';
    }
}