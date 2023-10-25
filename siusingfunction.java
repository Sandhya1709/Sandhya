import java.util.Scanner;
public class siusingfunction {
    static void si(float p,float r,int t)
    {
        float s=(p*r*t)/100;
        System.out.println("Simple Interest is: "+s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amount");
        float p=sc.nextFloat();
        System.out.println("Enter the rate of interest");
        float r=sc.nextFloat();
        System.out.println("Enter the time period");
        int t=sc.nextInt();
        si(p,r,t);

    }
    
}
