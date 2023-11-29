import java.util.ArrayList;
import java.util.List;

// Component interface representing both leaf nodes and composite nodes
interface MenuComponent {
    void display();
}

// Leaf node representing individual food items
class MenuItem implements MenuComponent {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println(" - " + name + ": $" + price);
    }
}

// Composite node representing categories and subcategories
class MenuCategory implements MenuComponent {
    private String name;
    private List<MenuComponent> menuComponents;

    public MenuCategory(String name) {
        this.name = name;
        this.menuComponents = new ArrayList<>();
    }

    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    public void display() {
        System.out.println(name);
        for (MenuComponent component : menuComponents) {
            component.display();
        }
    }
}

// Usage example
public class Composite {
    public static void main(String[] args) {
        MenuComponent appetizers = new MenuCategory("Appetizers");
        MenuComponent mainCourses = new MenuCategory("Main Courses");
        MenuComponent desserts = new MenuCategory("Desserts");

        // Adding individual food items to categories
        ((MenuCategory) appetizers).add(new MenuItem("Caesar Salad", 8.99));
        ((MenuCategory) appetizers).add(new MenuItem("Garlic Bread", 5.49));

        ((MenuCategory) mainCourses).add(new MenuItem("Grilled Salmon", 18.99));
        ((MenuCategory) mainCourses).add(new MenuItem("Pasta Carbonara", 14.99));

        ((MenuCategory) desserts).add(new MenuItem("Chocolate Cake", 7.99));
        ((MenuCategory) desserts).add(new MenuItem("Vanilla Ice Cream", 4.99));

        // Creating a subcategory
        MenuComponent specialDesserts = new MenuCategory("Special Desserts");
        ((MenuCategory) specialDesserts).add(new MenuItem("Tiramisu", 9.99));
         ((MenuCategory) specialDesserts).add(new MenuItem("Cheesecake", 8.49));
        ((MenuCategory) desserts).add(specialDesserts);

        // Displaying the entire menu
        System.out.println("Restaurant Menu:");
        appetizers.display();
        mainCourses.display();
        desserts.display();
    }
}
