import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int pulo = sc.nextInt();
        int canosN = sc.nextInt();
        int canoP = 0;
        boolean vitoria = true;

        for(int i =0; i < canosN; i++){
            int canoA = sc.nextInt();

            if(i == 0){
                canoP = canoA;
            }else if(canoA > canoP+pulo || canoP - pulo > canoA){
                vitoria = false;
            }
            
            
            canoP = canoA;

        }

        sc.close();

        if(vitoria == false){
            System.out.println("GAME OVER");
        }else{
            System.out.println("YOU WIN");
        }
    }
}
