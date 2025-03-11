package compositePattern;

// Main
public class Main {
    public static void main(String[] args) {
        // Tạo sản phẩm (leaf)
        Product product1 = new Product("Laptop", 1500);
        Product product2 = new Product("Mouse", 20);
        Product product3 = new Product("Keybroad",89000);

        // Tạo danh mục (composite)
        ProductCategory electronics = new ProductCategory("Điện tử");
        electronics.add(product1);
        electronics.remove(product1);
        electronics.add(product2);
        electronics.add(product3);

        // Tạo danh mục lớn hơn
        ProductCategory allProducts = new ProductCategory("Tất cả sản phẩm");
        allProducts.add(electronics);

        // Hiển thị
        allProducts.display();
    }
}
