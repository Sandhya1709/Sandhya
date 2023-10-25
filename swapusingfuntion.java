import java.util.Scanner;

public class swapusingfuntion {
    static void swap(int a,int b)
{
    a=a*b;
    b=a/b;
    a=a/b;
    System.out.println("After swapping a is: "+a);
    System.out.println("After swapping b is: "+b);
}
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any two number");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Before swapping a is: "+a);
    System.out.println("Before swapping b is: "+b);
    swap(a,b);

    }
}
