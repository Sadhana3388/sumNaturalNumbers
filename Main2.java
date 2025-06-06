import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();

     
        int[] moves = new int[N];
        for (int i = 0; i < N; i++) {
            moves[i] = sc.nextInt();
        }

        int position = 0;
        int count = 0;

      
        for (int move : moves) {
            position += move;
            if (position == 0) {
                count++;
            }
        }

        
        System.out.println(count);
        sc.close();
    }
}