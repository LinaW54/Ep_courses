import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input 'Hello': ");
        String helloin = in.nextLine();
        String hello = "hello";

        System.out.println("Input 'world': ");
        String worldin = in.nextLine();
        String world = "world";

        if (!helloin.equals(hello) || !worldin.equals(world)){
            System.out.println("invalid data");
        }
        else{
            System.out.println(helloin + " " + worldin);
        }
    }
}