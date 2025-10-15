package Practical;
import java.util.*;

class Player {
    String name;
    int inns, notOut, runs;

    Player(String name, int inns, int notOut, int runs) {
        this.name = name;
        this.inns = inns;
        this.notOut = notOut;
        this.runs = runs;
    }

    double avg() {
        int out = inns - notOut;
        return out == 0 ? 0 : (double) runs / out;
    }

    public String toString() {
        return "Name: " + name + ", Avg: " + avg();
    }
}

public class Cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of players: ");
        int n = sc.nextInt();
        Player[] p = new Player[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Innings: ");
            int inns = sc.nextInt();
            System.out.print("Not Out: ");
            int notOut = sc.nextInt();
            System.out.print("Runs: ");
            int runs = sc.nextInt();
            p[i] = new Player(name, inns, notOut, runs);
        }

        Arrays.sort(p, (a, b) -> Double.compare(b.avg(), a.avg()));

        System.out.println("\nSorted Player List:");
        for (Player player : p)
            System.out.println(player);
    }
}
