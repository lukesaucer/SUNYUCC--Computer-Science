package marathonrunners;

import java.util.Comparator;

/**
 * The RunnerComparator class implements the Comparator of type Runner to compare each individual
 * runner in the program based on their duration of time that it took them to complete the race.
 * <p>
 * @author Lucas Saucer and Steve Cina
 * @since 04/01/2020
 * @version 2.0
 *
 */

public class RunnerComparator implements Comparator <Runner> {

	
/**
 * {@link compare()} method is used to compare the duration that it took both runner1 and runner2
 * to finish the race.
 */
	@Override
	public int compare(Runner runner1, Runner runner2) {
		return runner1.getDurationSeconds() - runner2.getDurationSeconds();
	}


}
