import org.apache.commons.math3.distribution.*;

public class ZScorePercentile {
    /**
     * Converts a bell curve z score --> a percentile
     * represents the integral from -infinity to the x of the bell curve
     * @param zScore
     * @author moxprox
     * @return percentile
     */
	public static double zScoreToPercentile(double zScore)
	{
		double percentile = 0;

		NormalDistribution dist = new NormalDistribution();
		percentile = dist.cumulativeProbability(zScore) * 100;
		return percentile;
	}
}
