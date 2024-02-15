class Event {
    private String description;

    public Event(String description) {
        this.description = description;
    }

    public void occur() {
        System.out.println("Произошло событие: " + description);
    }

    @Override
    public String toString() {
        return "Event{" +
                "description='" + description + '\'' +
                '}';
    }
}