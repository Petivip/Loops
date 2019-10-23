import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myVar = new Scanner(System.in);

        for(int x=0;x<=10;x++){
            System.out.println(x);
        };
        for(int x=10;x>=1;x--){
            System.out.println(x);
        };
        for(int x=0;x<=20;x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
            ;
        }
        for(int x=0;x<=20;x++){
                if(x%2==0) {
                    System.out.println(x);
                }
        };
        System.out.println("Enter a number that need to be printed up to:");
        int num=myVar.nextInt();
        int sum=0;
        for(int x=num;x>=1;x--){
            System.out.println(x);
            sum+=x;
        };

        System.out.println("sum of the number your entered to 1:" + sum);

        String ast="*";
        int i=0;
        String add="";
        while(i<=5){
            i++;
            add+=ast;
            System.out.println(add);
        };

        System.out.println("Enter a number to be factorized:");
        int num1=myVar.nextInt();
        int prod=1;
        while(num1>1){
            prod*=num1;
            num1-=1;

        }
        System.out.println("Factorial of the number you entered is :" + prod);
    }
}