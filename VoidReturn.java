import java.util.Scanner;
public class VoidReturn {
    public static void main(String args[]){
        int total = addNums();

        System.out.println("Your total again was: " + total);
    }

    public static int addNums(){
        System.out.println("We are going to add two numbers");
        System.out.println("Please enter them below");

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        return (num1 + num2);

    }

}
