/**
 * Randomized Portion Generator based on percentile of dog weight
 */
public class PortionGenerator {
    private static String[] adjectives;
    private static String[] foods;
    private static String[] times;

    /**
     * returns string representation of a portion size in format
     * (amount) of (adjective) (food) (times)
     * @return string representation of a portion size in format
     */
    public static String getPortion(){

    }

    /**
     * returns string representation of a portion size in format, based on percentile
     * (amount) of (adjective) (food) (times)
     * @param percentile
     * @return string representation of a portion size
     */
    public static String getPortion(double percentile){
        assert (percentile>=0)&&(percentile<=1);
    }
}
