import java.util.Scanner;

class UserInput{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter Your Name :");
    String name=sc.nextLine();

    System.out.println("Enter Your age :");
    int age=sc.nextInt();

    System.out.println("Hello " +name + " \n You are "+age + "years old. ");
    sc.close();
  }
}
