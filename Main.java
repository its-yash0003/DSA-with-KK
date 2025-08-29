

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String name = input.next();
//        System.out.println(name);

//        int a = input.nextInt();
//        System.out.println(a);

//        int no = 5412521;
//        System.out.println(no);

//        float a = input.nextFloat();
//        System.out.println(a);

//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int sum = num1 + num2 ;
//        System.out.println("sum = " + sum);


//        type conversion
//        float num = input.nextFloat();
//        System.out.println(num);
        // type casting
//        int num4 = (int) (35.55f);
//        System.out.println(num4);
        //automatic type promotion in expression
//        int a = 260;
//        byte b = (byte) (a);

//        byte a = 40 ;
//        byte b = 50 ;
//        byte c = 100 ;
//        int d = a*b/c;
//        System.out.println(d);

//    loops
//        int a = 10;
//        if (a==10){
//            System.out.println("i won");
//        }

//        while loop
//        int count = 1;
//        while(count != 50){
//            System.out.println(count);
//            count++;
//        }

//    for loop
//        for(int count = 1; count != 50; count++){
//        System.out.println(count);
//        }

//         temp convertor
        System.out.println(" enter the temp in c: ");
        float tempc = input.nextFloat();
        float tempf = (tempc * 9/5) +32;
        System.out.println(tempf);

    }
}