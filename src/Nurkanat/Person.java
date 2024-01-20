package Nurkanat;
public abstract class Person implements Payable, Comparable<Person> {

    protected static int nextId = 1; //this();
    protected int id;
    protected String name;
    protected String surname;

    @Override
    public int compareTo(Person otherPerson) {
        return Double.compare(this.getPaymentAmount(), otherPerson.getPaymentAmount());
    }

    public Person() {
        this.id = nextId++;
    }

    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return getPosition() + ": " + id + ". " + name + " " + surname;
    }

    public abstract String getPosition();
}
