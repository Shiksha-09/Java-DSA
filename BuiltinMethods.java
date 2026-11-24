import java.util.Scanner;

public class BuiltinMethods{
    public static void main (String[]args){
        // System.out.println(Math.sqrt(100));
        // System.out.println(Math.cbrt(125));
        // System.out.println(Math.ceil(1.2));
        // System.out.println(Math.floor(-5.2));
        
        // Maximum value of 4 number
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
       int max1=Math.max(a,b);
        int max2=Math.max(c,d);
        System.out.println(Math.max(max1,max2));
 
        // Power Function -- kisi bhe number ke poweer mikalta h
        System.out.println(Math.pow(5,2));  
        // iska 5 ke power 2 nikalega
}
} 