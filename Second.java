import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        /*
        Syntax of if statements
        if (bool exp t or f ){
        //body
        }else;{
        // do this
        }
         */
//        int salary = 50000;
//        if ( salary <= 5000){
//            salary = salary + 2000;
//        } else{
//            salary = salary + 5000;
//        }
//        System.out.println(salary);

        // multi if else
//        if ( salary > 100000){
//            salary += 1000;
//        }
//        else if (salary == 100000) {
//            salary += 5000;
//        }
//        else if (salary < 100000) {
//            salary += 3000;
//        }
//        else {
//            salary += 2000;
//        }
//        System.out.println(salary);

        // loops
        /*
        syntax for loops
        for(initilization, condition, increment/decrement ){
        body
        }
         */

        // print no 1 to 5
//        for (int i = 1; i<= 5 ; i++){ //i++ == i += 1
//            System.out.println(i);
//        }

        // print 1 to n
        // when know how many times a loop will run
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
//            System.out.println("yash");
//        }

        // while loop
        /*
        syntax of while loop
        while(condition){
        body
        }
         */
        // when don't kno how many times will loop ill run
//        int i =1;
//        while ( i <= 10){
//        }
//        System.out.println(i);
//        i++ ;

        // do while loop
        /*
        syntax
        do{
        body
        } while (condition);
         */
        // runs at last once
//        int n = 1 ;
//        do{
//            System.out.println("yash");
//        }while (n != 1);

// Question 1
        // largest of three numbers
//        Scanner in = new Scanner(System.in);
//
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();

        //methord 1

//        int max = a;
//        if(b > a){
//            max = b;
//        }
//        if (c > max){
//            max = c ;
//        }

        // methord 2

//        int max = 0;
//        if(a>b){
//            max = a;
//        }else{
//            max=b;
//        }if (c>max){
//            max=c;
//        }
//        System.out.println(max);

        // same like above
//        int max = Math.max(a, b);
//        if (c>max){
//            max=c;
//        }
//        System.out.println(max);

        // methord 3

//        int max = Math.max(c, Math.max(a , b));
//        System.out.println(max);

//         question 2
        // Alphabet case check
//        Scanner in = new Scanner(System.in);
//        char ch = in.next().trim().charAt(0);
//
//        if( ch >= 'a' && ch <= 'z'){
//            System.out.println("Lowercase");
//        }else {
//            System.out.println("Uppercase");
//        }

//        question 3

//        question 4
        //how many digit are there in the no
//         int n = 544546435;
//         int count = 0 ;
//         while (n>0){
//             int rem = n %10;
//             if (rem == 5){
//                 count++;
//             }
//             n = n/10;
//         }
//        System.out.println(count);

//         question 5






    }
}