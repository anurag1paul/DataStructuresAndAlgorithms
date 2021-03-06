package applications.scheduling;

/**
 * @author Anurag Paul
 *         Date: 18/1/18
 */
public class DifferenceScoreCalculator implements ScoreCalculator {

    @Override
    public double calculateScore(Job job) {
        return job.weight - job.length;
    }
}
