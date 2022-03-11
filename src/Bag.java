import java.util.ArrayList;

public class Bag extends Item {
    private final String name;
    private Person owner;
    public Bag(String name, Person owner) {
        super(name);
        this.name = name;
        this.owner = owner;
        owner.setBag(this);
    }


    public void putInBag(GroupPersons persons, Bag bag, Item item) {
        item.setPlace(bag);
        bagItems.add(item);
        System.out.println(persons.getName() + " put " + item + " in " + owner + "'s " + name);
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public Person getOwner() {
        return owner;
    }

    protected ArrayList<Item> bagItems = new ArrayList<>();

}

