import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        int s=0;
        while(num>0)
        {
            int r=num%10;
            s=s+r;
            num=num/10;

        }
        sc.close();
        System.out.println("sum: "+s);
    }
    
}
