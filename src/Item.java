public class Item extends TextObject {
    private String amount;
    private TextObject place;
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public void getAmount() {
        System.out.println("amount " + amount);
    }

    protected String name;
    public Item(String name) {
        super(name);
        this.name = name;
    }

    public Item(String name, TextObject place) {
        super(name);
        this.name = name;
        this.place = place;
    }

    public void setPlace(TextObject place) {
        this.place = place;
    }
    public TextObject getPlace() {
        return place;
    }
}