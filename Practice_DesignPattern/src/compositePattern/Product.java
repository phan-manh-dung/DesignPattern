package compositePattern; // Leaf
class Product implements ProductComponent {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Sản phẩm: " + name + ", Giá: " + price);
    }
}