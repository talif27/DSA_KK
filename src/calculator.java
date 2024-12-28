import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        while (true){
            System.out.print("Enter operator: ");

            char op=sc.next().trim().charAt(0);
            System.out.println();
            if( op=='+'|| op =='-'|| op == '*' || op == '/'|| op == '%'){
                System.out.println("Enter two numbers : ");
                int a=sc.nextInt();
                int b= sc.nextInt();
                if (op=='+'){
                    ans=a+b;
                }
                if (op=='-'){
                    ans=a-b;
                }
                if (op=='*'){
                    ans=a*b;
                }
                if (op=='/'){
                    ans=a/b;
                }
                if (op=='%'){
                    ans=a%b;
                }

            }
            else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("invalid input bitch");
            } System.out.println(ans);
        }
    }
}