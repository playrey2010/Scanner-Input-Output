import java.util.Scanner;

public class InputOutput {
    public static void main(String [] args){
        // datatype, variable = value
        Scanner keybd = new Scanner(System.in);
        /*
        System.out.print("Please enter your name: ");
        String firstName = keybd.next(); // asking the user for an input, .next() will stop at the first space

        // System.out.println(inputString);

        System.out.print("Please enter your last name: ");
        String lastName = keybd.next();
        System.out.println("Your full name is " + firstName + " " + lastName);
        */
        String test = keybd.next(); // 'test1' ('test1\n') .next() would only pick up 'test1' \n
        String test2 = keybd.nextLine(); // this will pick up the remaining '\n'
        String test3 = keybd.nextLine(); // test2



        System.out.println("test >>"+ test + "<<");
        System.out.println("test2 >>" + test2 + "<<");
        System.out.println("test3 >>" + test3 + "<<");

        System.out.println("Please enter your name: ");
        String name = keybd.nextLine();
        System.out.println("Please enter your age: ");
        int age = keybd.nextInt();
        // create a scanner buffer to move the scanner object to the next line!!
        keybd.nextLine();
        System.out.println("Please enter your last name: ");


        String lName = keybd.nextLine();

        System.out.println("name >>" + name + "<<");
        System.out.println("age >>" + age + "<<");
        System.out.println("lName >>" + lName + "<<");



    }
}
