import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char operator=sc.next().charAt(0);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        sc.close();
        int result=0;
        switch(operator){
            case '+':
                result = N1+N2;
                break;
            case '-':
                result=N1-N2;
                break;
            case '*':
                result=N1*N2;
                break;
            case '/':
                result=N1/N2;
                break;
            case '%':
                result=N1%N2;
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
        System.out.println(result);

    }
}
