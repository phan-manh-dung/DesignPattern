package compositePattern;

import java.util.ArrayList;
import java.util.List;

//Composite
class ProductCategory implements ProductComponent {
 private String name;
 private List<ProductComponent> children = new ArrayList<>();

 public ProductCategory(String name) {
     this.name = name;
 }

 public void add(ProductComponent component) {
     children.add(component);
 }

 public void remove(ProductComponent component) {
     children.remove(component);
 }

 @Override
 public void display() {
     System.out.println("Danh mục: " + name);
     for (ProductComponent component : children) {
         component.display();
     }
 }
}