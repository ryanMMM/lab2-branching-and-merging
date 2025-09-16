public class DataTypes {
    public static long sum(int[] numbers) {
        long s = 0L; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        // error: bit overflow as we went over the amount of the int limit
        // int s = 0 -> long s = 0L
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
