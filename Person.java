public abstract class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    // Adding this allows us to update the name if needed during input
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }

    public abstract void displayRole();
}