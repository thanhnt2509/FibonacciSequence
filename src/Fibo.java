import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Legion
 */

public class Fibo {
    
    public static void main(String[] args) {
        int limit = fib(45);
        ArrayList<Integer> list = fibonacci(limit, 0, 1);
        System.out.println(list.toString());
        System.out.println(list.size());
    }
    
    public static int fib(int n){
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static ArrayList<Integer> fibonacci(int limit, int num1, int num2) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(num1);

        int sum = num1 + num2;

        if (num1 <= (limit - num2) && sum < limit) {
            ArrayList<Integer> recursive_vector = fibonacci(limit, num2, sum);
            sequence.addAll(recursive_vector);
        }
        else {
            sequence.add(num2);
        }
        return sequence;
    }

}