package drinks;

public class Espresso implements Coffee {

    @Override
    public void prepareDrink() {
        System.out.println("Your Espresso. Enjoy.");
    }
}
