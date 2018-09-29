package com.company;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner any = new Scanner(System.in);
        System.out.println("Верно ли выражение a^n + b^n = c^n,\n при n > 2 и n = 2, где a, b, c - натуральные числа?");
        System.out.println("Введите натуральное число a:");
        int a = any.nextInt();
        System.out.println("Введите натуральное число b:");
        int b = any.nextInt();
        int n = 2;
        double ma = Math.pow(a, n);
        double mb = Math.pow(b, n);
        double mc = ma + mb;
        double c = Math.sqrt(mc);
        System.out.println(a+"**2 + "+b+"**2 = "+c+"**2 = ");
        System.out.println(ma+" + "+mb+" = "+mc+": Это работает при n = 2.");
        System.out.println("Теперь для n > 2:\n");
        for (double i=n+1; i<10; i++) {
            double ma2=Math.pow(a,i);
            double mb2=Math.pow(b,i);
            double mc2=Math.pow(c,i);
            double res=ma2+mb2;
            System.out.println(a+"**"+i+" + "+b+"**"+i+" = "+c+"**"+i+"\n Можно подумать что:");
            System.out.println(ma2+" + "+mb2+" = "+mc2+"; Но ведь "+ma2+" + "+mb2+" = "+res+" Значит данное выражение при n > 2 НЕ верно!\n");
        }

        System.out.println("Вычисление значения выражения: 1 - 1/2 + 1/3 - 1/4 + ... + 1/9999 - 1/10000:\n");

        double d = 0;
        for (double j = 1; j <= 10000; j++)

            if (j % 2 == 0)
                d -= 1 / j;
            else
                d += 1 / j;
        System.out.print("1 - 1/2 + 1/3 - 1/4 + ... + 1/9999 - 1/10000 = " +d);

    }

}