package Exercice2;

public class Enemy implements Character{

    @Override
    public boolean isEnemy() {
        return true;
    }

    public void kill()
    {
        System.out.println("U kill me, mother fucker!!");
    }
}
