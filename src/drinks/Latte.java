package drinks;

public class Latte implements Coffee {

    @Override
    public void prepareDrink() {
        System.out.println("Your Latte. Enjoy.");
    }
}
