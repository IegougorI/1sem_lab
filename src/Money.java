public class Money extends Item {
    private String amount;
    private String name;
    private Person owner;

    public Money(String name, String amount, Person owner) {
        super(name);
        this.name = name;
        this.amount = amount;
        this.owner = owner;
        owner.setMoney(this);
    }

    public Money(String name) {
        super(name);
        this.name = name;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public Person getOwner() {
        return owner;
    }
}