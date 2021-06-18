public class Products {
    int id;
    String name;
    int quantity;
    int price;

    public Products(int id, String name, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return id+"-"+name+" - số lượng:"+quantity+" - giá:"+price;
    }
}
