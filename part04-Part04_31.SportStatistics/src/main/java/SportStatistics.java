
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int count = 0;
        int wins = 0;
        int losses = 0;

        try ( Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();

                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String guestTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int guestScore = Integer.valueOf(parts[3]);

                if (row.contains(team)) {
                    count += 1;
                    if (team.equals(homeTeam)) {
                        if (homeScore > guestScore) {
                            wins += 1;
                        } else {
                            losses += 1;
                        }
                    } else if (team.equals(guestTeam)) {
                        if (homeScore < guestScore) {
                            wins += 1;
                        } else {
                            losses += 1;
                        }
                    }

                }

            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
