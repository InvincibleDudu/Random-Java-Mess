package test;

import codewars.PrimeNum;

import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

/**
 * Created by InvincibleDudu on 09/22/2020 at 13:40
 */
public class TestIntStream {
    public static void main(String[] args) {
//        IntStream intStream = IntStream.of(3,5,3,2,1,6);
//        var i = IntStream.generate(() -> 0);
//        System.out.println(Arrays.toString(i.toArray()));
//        System.out.println(intStream.toString());
        Random r = new Random();
        var d = Math.abs(r.nextInt());
        IntStream stream = IntStream.generate(() -> {
//            var result = 0;
//            var i = (int)(Math.random()*1000);
//            for (int i = 0; i < 1000000000; i++) {
                if (PrimeNum.isPrime(d)) {
                    return d;
            }
            return 0;
        });

        stream.limit(100).forEach(System.out::println);
        var hs = new HashSet<String>();
        var chm = new ConcurrentHashMap<String, String>();

//        var d = (int)(Math.random()*100);
//        System.out.println(d);
    }
}
