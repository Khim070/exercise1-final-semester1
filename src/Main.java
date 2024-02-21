import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[100];
        int i=0;
        System.out.println("The maximum of input number is only 100. Furthermore the loop will be end when you enter 0");
        do{
            System.out.print("Input number["+(i+1)+"]: ");
            num[i] = s.nextInt();
            i++;
        }while(num[i-1]!=0);
        System.out.println("Display number!!!");
        for(int j=0;j<i-1;j++){
            System.out.println("The number["+(j+1)+"] is: "+num[j]);
        }
    }
}