import java.util.Scanner;
public class armstrong1 {
    public static void main(String[] args) {
        int n;
        int cubesum=0;
        int r=0;
        int num;
        System.out.println("Enter number");
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        num=n;
        for(int i=1;i<=num;i++){
           while(num>0){
            r=num%10;
            cubesum=cubesum+(r*r*r);
            num=num/10;}
            if(n==cubesum){
                 System.out.println(n); 
               }
       
       }
   
     }
    }

    

