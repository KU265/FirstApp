/**Author:KU NUR RASYIDAH BINTI KU BIDE
DATE: 9/12/2022*/
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        //declare variables
        char alpha;
        float price;
        boolean result;

        //First lesson
        System.out.println("Hello world!"); //THIS IS A LINE COMMENT
        System.out.println("First line from app");
        System.out.println("Second line from app");
        System.out.println("Third line from app");
        /*System.out.println("Test a comment block");
        System.out.println("Second line");*/

        //Second lesson
        int myVar;
        int someValue;
        myVar=100;
        System.out.println("myVar");
        someValue=5;
        System.out.println(++someValue); //postfix operator

        //Third lesson
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD =1;
        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;
        System.out.println(result1);
        System.out.println(result2);

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));
        System.out.println(result3);
        System.out.println(result4);

        //Fourth lesson
        //logic
        int value1 = 7;
        int value2 = 5;
        int maxValue = value1 > value2 ? value1 : value2;
        System.out.println(maxValue);
        //if-else
        int value11 = 10;
        int value12 = 4;
        if (value11 > value12) {
            System.out.println("value 11 is bigger");
        }
        else if (value11 < value12 ){
            System.out.println("value 12 is bigger");
        }
        else {
            System.out.println("value 11 and value 12 are equal");
        }

    }

}