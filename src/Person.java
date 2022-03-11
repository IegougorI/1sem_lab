import java.util.ArrayList;

public class Person extends TextObject implements Say, EnterInTrain, ActionWithMoney, Add2PurchasesList{

    private TextObject place;
    private Money money;
    private Purchases purchases;
    private Bag bag;
    protected ArrayList<Purchases> purchasesList = new ArrayList<Purchases>();

    public Person(String name, TextObject place) {
        super(name);
        this.name = name;
        this.place = place;
    }
    private String name;
    public Person(String name) {
        super(name);
        this.name = name;

    }


    public void setMoney(Money money) {
        this.money = money;
    }
    public Money getMoney() {
        return money;
    }

    public void setPurchases(Purchases purchases) {
        this.purchases = purchases;
    }
    public Purchases getPurchases() {
        return purchases;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }
    public Bag getBag() {
        return bag;
    }

    public void sayNothing(String text) {
        System.out.println(text+ " " +name);
    }

    public void sayGoodBye(String text) {
        System.out.println(name + " " + text);
    }

    public void enterInTrain(String text){
        System.out.println(name + " " + text);
    }

    public void collectMoney() {
        System.out.println(name + " collect all their money");
    }
    public void buy(Purchases purchases) {
        System.out.println(name+ " buy " + purchases.getName());
        purchases.setOwner(this);
        purchasesList.add(purchases);
    }

    public void setPlace(TextObject place) {
        this.place = place;
    }
    public TextObject getPlace() {
        return place;
    }

    public void add2list(Purchases purchases) {
        purchasesList.add(purchases);
    }
    public void arrived2RailwayStation() {
        System.out.println(name+ " get off on railway station");
    }

    public void sitComfort(String text, Person person) {
        System.out.println(name + " " + text + person.getPlace());
    }

    public void listen(String text) {
        System.out.println(name + " " + text);
    }

    public void waitForTrain(String text, Train train){
        System.out.println(name + " " + text + " " + train.getName());
    }

}