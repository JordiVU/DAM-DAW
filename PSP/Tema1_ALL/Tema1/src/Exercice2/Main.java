package Exercice2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(10) {
        };

        for(int i = 0; i < 5; i++)
        {
            list.add(new Friend());
        }

        for(int i = 0; i < 5; i++)
        {
            list.add(new Enemy());
        }

        Collections.shuffle(list);
    }
}