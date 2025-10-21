package Exercice1;

public class LiquorStore extends  Store {
    private double tax;

    public LiquorStore(double tax, double drinkPrice)
    {
        super(drinkPrice);
        this.tax = tax;
    }

    @Override
    public void welcome()
    {
        System.out.println("Welcome to Liquor Store");
    }

    @Override
    public double payDrinks(int numberOfDrinks)
    {
        double price = super.payDrinks(numberOfDrinks);
        cash += price * tax / 100;

        return price+price*tax/100;
    }
}
