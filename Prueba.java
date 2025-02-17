import java.util.Scanner;
public class Prueba {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int user_number = input.nextInt();
        isEven(user_number);
    }
    public static void isEven(int num){
        try {
            int re = num % 2;
            if (re == 1){
                throw new Exception("El numero es impar");
            }
            else {
                System.out.println("El numero es par");
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
