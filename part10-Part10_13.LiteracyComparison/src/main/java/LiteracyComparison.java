
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Literacy> list = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Literacy(parts[3], Integer.valueOf(parts[4]), parts[2], Double.valueOf(parts[5])))
                    .forEach(row -> list.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        list.stream().sorted((p1, p2) -> Double.compare(p1.getRatio(), p2.getRatio()))
                .forEach(p -> System.out.println(p.getCountry().trim() + " (" + p.getYear()+"), " + p.getGender().trim()+", " + p.getRatio()));
    }
}
