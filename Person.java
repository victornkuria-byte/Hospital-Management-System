public abstract class Person {
    public String name; // changed to public (classic student mistake)
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return id;
    }

    public abstract void displayRole();
}