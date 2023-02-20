package com.workshop;
import java.util.Scanner;

public class swappedNum
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st Number:");
        int a = scanner.nextInt();

        System.out.println("Enter 2nd Number:");
        int b = scanner.nextInt();

        System.out.println("Before swap 1st Number:=" + a + ", 2nd Number:=" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap 1st Number:=" + a + ", 2nd Number:=" + b);
    }
}
