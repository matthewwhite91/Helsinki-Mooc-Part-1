
import nhlstats.NHLStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner reader = new Scanner(System.in);
    
    //Top 10 goals

    System.out.println("Top ten by goals");
    NHLStatistics.sortByGoals();
    NHLStatistics.top(10);
    
    System.out.println("Top 25 by penalty amounts");
    NHLStatistics.sortByPenalties();
    NHLStatistics.top(25);
    
    System.out.println("Stats for Sidney Crosby");
    NHLStatistics.searchByPlayer("Sidney Crosby");
    
    System.out.println("Philly Flyers Stats");
    NHLStatistics.teamStatistics("PHI");
    
    System.out.println("Players for Anaheim Ducks ordered by points");
    NHLStatistics.sortByPoints();
    NHLStatistics.teamStatistics("ANA");
        
        
    }
}
