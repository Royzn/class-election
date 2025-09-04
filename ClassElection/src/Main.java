import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int C = 0;
        int invalid = 0;

        while (true){
            System.out.println("Masukkan suara (A/B/C):");
            String suaraSiswa = sc.nextLine();

            if(suaraSiswa.equalsIgnoreCase("stop")){
                break;
            }

            if (suaraSiswa.toUpperCase().charAt(0) == 'A') A++;
            else if (suaraSiswa.toUpperCase().charAt(0) == 'B') B++;
            else if (suaraSiswa.toUpperCase().charAt(0) == 'C') C++;
            else invalid++;

        }

        if (A > B && A > C) System.out.println("A Win");
        else if (B > A && B > C) System.out.println("B Win");
        else if (C > A && C > B) System.out.println("C Win");

        System.out.println("Invalid Votes: " + invalid);
    }
}