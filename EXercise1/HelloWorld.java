import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter Name");
        String name =scanner.nextLine();

        System.out.println("Enter your Age");
        Integer age = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("your name is "+name);

        if(age ==18){
            System.out.println(name + " you Don't ever come here again :(");
        }else if(age >= 20){
                System.out.println(name + " You are allowed to club to night :)");
        }else{
            System.out.println(name + " Please Mama is calling you home your time is not now :)");
        }
          
       
    }
}
