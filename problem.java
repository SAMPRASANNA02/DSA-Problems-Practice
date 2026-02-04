import java.util.Scanner;

public class problem{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();


        for (int i = 1; i <= n; i++) {
            int num = i;
            int diff = n - 1;

            for (int j = i; j <= n; j++) {
                System.out.print(num + " ");
                num = num + diff;
                diff--;
            }
            System.out.println();
        }
    }
}
