package lab3;

import javax.swing.*;

public class Fibbonicia {
    public static  void  main(String [] args)
    {
        int num1=1; int num2=1;
        int sum = 0;
        System.out.println(num1+" "+num2+ "  ");

        for (int i=2;i<40;i++){ // 1 1 2 4 8 ..
           sum= num1+num2;
            System.out.println(" "+ sum);
            num1=num2;
            num2=sum;
        }

    }
}
