import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        int points = 6;
//        switch (points) {
//            case 6:
//                ;
//            case 7:
//                System.out.println("java");
//                break;
//            case 8:
//                ;
//            case 9:
//                System.out.println("101");
//                break;
//            case 10:
//                System.out.println("patika");
//                break;
//            default:
//                System.out.println("dev");

        //////Calculator
        int number1, number2 , select;
        Scanner input = new Scanner(System.in);
        System.out.print("enter number1 : ");
        number1 = input.nextInt();
        System.out.print("enter number2 : ");
        number2 = input.nextInt();
        System.out.println("1-Addition\n2-Substraction\n3-Multiplication\n4-Division");
        System.out.print("enter any selection above : ");
        select = input.nextInt();
        System.out.println("your select : " + select);

        switch (select){
            case 1:
                System.out.println("Addition result: "+ (number1 + number2));
                break;
            case 2:
                System.out.println("Substraction result:" + (number1 - number2));
                break;
            case 3:
                System.out.println("Multiplication result: " + (number1 * number2));
                break;
            case 4:

                switch (number2){
                    case 0:
                        System.out.println("division by zero is not correct");
                        break;
                    default:System.out.println("Division result: " + (number1 / number2));

                }
                break;
        }



    }
}