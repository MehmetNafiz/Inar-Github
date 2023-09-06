package week_04.live_class;

import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min, mid, max;

        System.out.println("Enter three numbers:");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int tempMax = Math.max(num1,num2);
        max = Math.max(num3,tempMax);
        System.out.printf("The numbers are %d, %d and %d\n",num1,num2,num3);
        System.out.printf("The max number is %d\n\n",max);

        int tempMin = Math.min(num1,num2);
        min = Math.min(num3,tempMin);
        System.out.printf("The numbers are %d, %d and %d\n",num1,num2,num3);
        System.out.printf("The min number is %d\n\n",min);

        if ( num1 != max && num1 != min)
            mid = num1;
        else if ( num2 != max && num2 != min)
            mid = num2;
        else
            mid = num3;
        System.out.printf("The numbers are %d, %d and %d\n",num1,num2,num3);
        System.out.printf("The mid number is %d\n\n",mid);





    }
}
