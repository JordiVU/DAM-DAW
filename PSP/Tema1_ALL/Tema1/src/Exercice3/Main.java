package Exercice3;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String Args[]) {
        Instant start = Instant.now();
        List<Double> array = new ArrayList<>();
        for(int i = 0; i < 100000; i++)
        {
            array.add(Math.random());
        }
        Instant end = Instant.now();
        Duration dur = Duration.between(start, end);
        System.out.printf("ArrayList: The operation ... takes: %dms\n", dur.toMillis());

        Instant comenzar = Instant.now();
        List<Double> linked = new LinkedList<>();
        for(int i = 0; i < 100000; i++)
        {
            linked.add(Math.random());
        }
        Instant terminar = Instant.now();
        Duration duracion = Duration.between(comenzar, terminar);
        System.out.printf("LinkedList: The operation ... takes: %dms\n", duracion.toMillis());

        System.out.println("-----------------------------------------------------------------");
        Instant startT = Instant.now();
        for(int i = 0; i < 50000; i++)
        {
            array.remove(0);
        }
        Instant endT = Instant.now();
        Duration durT = Duration.between(startT, endT);
        System.out.printf("ArrayList: The operation ... takes: %dms\n", durT.toMillis());

        Instant comenzarT = Instant.now();
        for(int i = 0; i < 50000; i++)
        {
            linked.remove(0);
        }
        Instant terminarT = Instant.now();
        Duration duracionT = Duration.between(comenzarT, terminarT);
        System.out.printf("LinkedList: The operation ... takes: %dms\n", duracionT.toMillis());

        System.out.println("-----------------------------------------------------------------");
        Random r = new Random();

        Instant startR = Instant.now();
        for(int i = 0; i < 50000; i++)
        {
            array.add(r.nextInt(array.size()), Math.random());
        }
        Instant endR = Instant.now();
        Duration durR = Duration.between(startR, endR);
        System.out.printf("ArrayList: The operation ... takes: %dms\n", durR.toMillis());

        Instant comenzarR = Instant.now();
        for(int i = 0; i < 50000; i++)
        {
            linked.add(r.nextInt(linked.size()), Math.random());
        }
        Instant terminarR = Instant.now();
        Duration duracionR = Duration.between(comenzarR, terminarR);
        System.out.printf("LinkedList: The operation ... takes: %dms\n", duracionR.toMillis());

        System.out.println("-----------------------------------------------------------------");
        Instant startE = Instant.now();
        for(int i = 0; i < 50000; i++)
        {
            array.remove(r.nextInt(array.size()));
        }
        Instant endE = Instant.now();
        Duration durE = Duration.between(startE, endE);
        System.out.printf("ArrayList: The operation ... takes: %dms\n", durE.toMillis());

        Instant comenzarE = Instant.now();
        for(int i = 0; i < 50000; i++)
        {
            linked.remove(r.nextInt(linked.size()));
        }
        Instant terminarE = Instant.now();
        Duration duracionE = Duration.between(comenzarE, terminarE);
        System.out.printf("LinkedList: The operation ... takes: %dms\n", duracionE.toMillis());
    }
}
