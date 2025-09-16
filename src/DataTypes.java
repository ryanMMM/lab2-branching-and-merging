public class DataTypes {
    public static long sum(int[] numbers) {
        long s = 0L; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        for (long x : numbers) {
            s += x;
        }
        return s;
    }
}
