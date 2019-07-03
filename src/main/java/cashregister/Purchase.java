package cashregister;

public class Purchase {

    private Item[] items;

    public Purchase(Item[] items) {

        this.items = items;
    }

    public String asString() {
        StringBuilder out = new StringBuilder();

        for (Item item : items) {
            out.append(item.getName()).append("\t").append(item.getPrice()).append("\n");
        }

        return out.toString();
    }
}
