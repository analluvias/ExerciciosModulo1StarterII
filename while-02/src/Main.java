import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x, y;

        while (true){

            x=scan.nextInt();
            y = scan.nextInt();

            if (x==0 || y==0){
                break;
            }
            else{

                if (x>0 && y>0){
                    System.out.println("primeiro");
                } else if (x<0 && y>0) {
                    System.out.println("segundo");
                } else if (x<0 && y<0) {
                    System.out.println("terceiro");
                }else {
                    System.out.println("quarto");
                }

            }
        }
    }
}
