import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements in sequence: ");
        int limit = fib(sc.nextInt());
        ArrayList<Integer> list = fibonacci(limit, 0, 1);
        System.out.println("Fibonacci list: \n" + list.toString());
        System.out.println("List size: " + list.size());
    }
    
    //return the value of the last elements in sequence
    public static int fib(int n){
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
    
    
    public static ArrayList<Integer> fibonacci(int limit, int num1, int num2) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(num1);
        
        //Calculate the sum of the previous two elements in the sequence
        int sum = num1 + num2;
        
        //Check if integer overflow limit and
        //sum of last two elements less than the limit
        if (num1 <= (limit - num2) && sum < limit) {
            //If the sum is less than the limit, 
            //recursively generate the next element in the sequence
            ArrayList<Integer> recursiveList = fibonacci(limit, num2, sum);
            
            //Append the current recursive list of the recursive function
            //to the current sequence
            sequence.addAll(recursiveList);
        }
        else {
            sequence.add(num2);
        }
        return sequence;
    }
    
}