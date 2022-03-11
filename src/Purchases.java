public class Purchases extends Item {

    private Towns town;
    private String name;
    private Person owner;
    public Purchases(String name, Person owner) {
        super(name);
        this.name = name;
        this.owner = owner;
        owner.setPurchases(this);
    }

    public Purchases(String name) {
        super(name);
        this.name = name;
    }

    public Purchases(String name, Towns town) {
        super(name);
        this.name = name;
        this.town = town;
        }

    public String setName() {
        return name;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public Person getOwner() {
        return owner;
    }

    public Towns getTown() {
        return town;
    }
}
