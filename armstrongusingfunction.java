import java.util.Scanner;
public class armstrongusingfunction {
    static int count(int n)
    {
        int c=0;
        while(n>0)
        {
            
            c=c+1;
            n=n/10;
        }
        return c;
    }
    static int power(int input,int p)
    {
        int sum=0;
        while(input>0){
            int s=1;
        for(int i=0;i<p;i++)
        {
            
            int rem=input%10;
            s=s*rem;

        }
        input=input/10;
        sum=sum+s;
    }
    return sum;
        
    }
    static void fun(int data,int new1)
    {
        if(data==new1)
        System.out.println("Armstrong");
        else
        System.out.println("Not Armstrong");
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any number");
      int num=sc.nextInt();
      int res=count(num);
      int mul=power(num,res);
      fun(num,mul);  
    }
    
}
