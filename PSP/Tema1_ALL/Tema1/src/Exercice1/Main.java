package Exercice1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Store myStore = new Store(8.95){
            @Override
            public void welcome()
            {
                System.out.println("\"Welcome to anonymous store!\n" +
                        "Our drink price is 8.95€");
            }
        };

        LiquorStore liquor = new LiquorStore(20, 8.95);
        myStore.welcome();

        System.out.println("With tax: " + liquor.payDrinks(10) + "€");
        System.out.println(myStore.payDrinks(10) + "€");
    }
}