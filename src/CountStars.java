public class CountStars {

    public static int points_wins = 3;
    public static int max_range = 100;

    public static int execute(String[] result) {
        int totalStars = 0;

        for (String stage : result) {
            totalStars += stage.length() - stage.replace("*", "").length();
        }

        return totalStars;
    }
}
