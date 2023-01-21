import java.util.ArrayList;
import java.util.Collections;

public class CalculateChampion {

    public static int POINTS_WINS = 3;

    public static int execute(int[] wins, int[] ties) {
        ArrayList<Integer> num = new ArrayList<>();

        for (int index = 0; index < wins.length; index++) {
            num.add((wins[index] * POINTS_WINS) + ties[index]);
        }

        int max_points = Collections.max(num);

        return num.indexOf(max_points);
    }
}
