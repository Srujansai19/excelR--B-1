import java.util.Scanner;

class Bowler {
    public String name;
    public int wickets;
    public int matches;
    public int balls_bowled;
    public int runs_conceded;

    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }

    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public void Avg() {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("error");
            return;
        }

        float avg = (float) runs_conceded / wickets;
        System.out.println("Player bowling average is: ");
        System.out.println("Name: " + name);
        System.out.println("Bowling Average: " + avg);
    }

    public void ShowStatictics(){
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("error");
        }
        else{
            System.out.println("The statictics of player is: ");
            System.out.println("Name: " + name);
            System.out.println("Matches: " + matches);
            System.out.println("Wickets: " + wickets);
            System.out.println("Balls Bowled: " + balls_bowled);
            System.out.println("Runs Conceded: " + runs_conceded);
        }
    }

    public void strikerate(){
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("error");
        }
        else{
            double sr = (double) runs_conceded / balls_bowled;
            System.out.println("Player strike rate is: ");
            System.out.println("Name: " + name);
            System.out.println("Strike Rate: " + sr);
    }
}
}

public class ps003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the cricketer: ");
        String name = sc.nextLine();
        System.out.println("Enter number of wickets taken: ");
        int wickets = sc.nextInt();
        System.out.println("Enter number of matches played: ");
        int matches = sc.nextInt();
        System.out.println("Enter number of balls bowled: ");
        int balls_bowled = sc.nextInt();
        System.out.println("Enter number of runs conceded: ");
        int runs_conceded = sc.nextInt();


        Bowler b = new Bowler(name, wickets, matches, balls_bowled, runs_conceded);
        b.Avg();
        System.out.println(" ");
        b.ShowStatictics();
        System.out.println(" ");
        b.strikerate();
    }
}