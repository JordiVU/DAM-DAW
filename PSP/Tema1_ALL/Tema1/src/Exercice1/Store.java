package Exercice1;

public abstract  class Store {
    protected double cash;
    protected double drinkPrice;

    public Store(double drinkPrice)
    {
        cash = 0.0;
        this.drinkPrice = drinkPrice;
    }

    public abstract void welcome();

    public double payDrinks(int numOfDrinks)
    {
        cash = numOfDrinks * drinkPrice;
        return cash;
    }
}
