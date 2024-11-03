import java.util.ArrayList;

class MenuItem {
    private String name;
    private double price;
    private double rating;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }
}

class Restaurant {
    private ArrayList<MenuItem> menu = new ArrayList<>();

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void removeMenuItem(String name) {
        menu.removeIf(item -> item.getName().equals(name));
    }

    public double calculateAverageRating() {
        double totalRating = 0;
        for (MenuItem item : menu) {
            totalRating += item.getRating();
        }
        return totalRating / menu.size();
    }
}

public class RestaurantExample {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        MenuItem pizza = new MenuItem("Pizza", 12.99);
        pizza.setRating(4.5);
        restaurant.addMenuItem(pizza);
        
        System.out.println("Average Rating: " + restaurant.calculateAverageRating());
    }
}

/*
Output:
Average Rating: 4.5
*/
