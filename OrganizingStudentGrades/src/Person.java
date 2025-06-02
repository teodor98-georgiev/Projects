public abstract class Person {
    String name;
    String surname;
    String id;

    public Person(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public abstract String getFullName();


}
