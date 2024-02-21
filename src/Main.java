import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[5];
        int i=0;
        try{
            System.out.println("The loop will be end when you enter 0");
            do{
                System.out.print("Input number["+(i+1)+"]: ");
                num[i] = s.nextInt();
                i++;
                int[] temp = new int[num.length * 2];
                System.arraycopy(num, 0, temp, 0, num.length);
                num = temp;
            }while(num[i-1]!=0);
            System.out.println("Display number!!!");
            for(int j=0;j<i-1;j++){
                System.out.println("The number["+(j+1)+"] is: "+num[j]);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}