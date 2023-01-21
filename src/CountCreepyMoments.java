public class CountCreepyMoments {

    public static int MAX_RANGE = 100;

    public static int execute(String[] moments) {
        int count = 0;

        for (String moment : moments) {
            String[] time = moment.split(":");
            if (time[0].equals(time[1]) ||
                (time[0].charAt(0) == time[1].charAt(0) && time[0].charAt(1) == time[1].charAt(1)) || 
                (time[0].charAt(0) == time[1].charAt(1) && time[0].charAt(1) == time[1].charAt(0)) || 
                (time[0].charAt(0) == time[0].charAt(1) && time[1].charAt(0) == time[1].charAt(1))) {
                count += 1;
            }
        }

        return count;
    }
}
