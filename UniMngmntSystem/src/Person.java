public abstract class Person {
    String name;
    String mail;
    String id;

    public Person(String name, String mail, String id) {
        this.name = name;
        this.mail = mail;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getId() {
        return id;
    }

    public abstract void getRoleDescription();
}
