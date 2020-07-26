import static org.junit.Assert.assertEquals;

import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * To run all tests, just click somewhere inside this file and click the Play button.
 * 
 * Be sure to change the CHECKPOINT constant to reflect the checkpoint you're testing.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	FracCalcTestCheckpoints.class,
	FracCalcTestFinal.class,
	FracCalcTestExtraCredit.class
})
public class FracCalcTestALL {
	/**
	 * >>> CHANGE ME <<<
	 * 
	 * Checkpoint to test (1, 2, 3), 4 for the final project, 5 for extra credit
	 */
	public static final int CHECKPOINT = 3;
	
	/** printf format string for checkpoint 3 error message */
	private static final String EQUIVALENT_FORMAT = "Expected '%s' to return any answer equivalent to '%s' but got '%s'\n" +
			"For checkpoint 3, your answer need not be reduced, but it must be equivalent to the expected answer.\n\n";
	/** printf format string for generic error message */
	private static final String EQUAL_FORMAT = "Expected '%s' to return '%s' but got '%s'\n\n";

	/**
	 * Helper method that verifies the final version of the calculator produces
	 * the expected result from the given user input.
	 * 
	 * @param input 	Simulated user input
	 * @param answer 	The expected answer
	 * @param name 		Used to get the name of the currently executing test
	 */
	public static void assertForFinalProject(String input, String answer, TestName name) {
		assertForCheckpoints(input, null, null, answer, name);
	}
	
	/**
	 * Helper method that verifies the calculator produces the expected answer
	 * for the current checkpoint.
	 * 
	 * @param input 	Simulated user input
	 * @param answer1	The expected answer if CHECKPOINT == 1
	 * @param answer2	The expected answer if CHECKPOINT == 2
	 * @param answer3	The expected answer if CHECKPOINT >= 3
	 * @param testName	Used to get the name of the currently executing test
	 */
	public static void assertForCheckpoints(String input, String answer1, String answer2, String answer3, TestName testName) {
		// Figure out which answer to use
		// (will also quit the program if CHECKPOINT is invalid)
		String answer = chooseAnswer(answer1, answer2, answer3);
		// For checkpoint 3 only, fractions equivalent to the given answer are allowed
		boolean allowEquivalent = CHECKPOINT == 3;
		String checkpoint = CHECKPOINT >= 4 ? "final project" : "checkpoint " + CHECKPOINT;

		// Get the answer from student code
		String candidate;
		try {
			candidate = FracCalc.produceAnswer(input);
		} catch (Exception ex) {
			// produceAnswer threw an exception
			System.err.printf("FAILURE: %s (%s)\n", testName.getMethodName(), checkpoint);
			System.err.printf("Calculating '%s' threw an exception:\n%s\n", input, ex);
			for (StackTraceElement el : ex.getStackTrace()) {
				// Only print FracCalc parts of the stack trace
				if (el.getClassName().contains("FracCalc")) {
					System.err.println("\t" + el);
				}
			}
			System.err.println();
			throw ex;
		}

		// Check if the answer is correct (strict equality except for checkpoint 3)
		// and prepare a nice error message to use if it's incorrect
		boolean isEqual = allowEquivalent ? FracCalcTestHelper.areFracsEqual(answer, candidate) : answer.equals(candidate);
		String message = String.format(allowEquivalent ? EQUIVALENT_FORMAT : EQUAL_FORMAT, input, answer, candidate);
		
		// For an incorrect answer, print a nice message to the console before asserting
		// (since the JUnit result format in Eclipse could be a bit confusing)
		if (!isEqual) {
			System.err.printf("FAILURE: %s (%s)\n", testName.getMethodName(), checkpoint);
			System.err.printf(message);
		}
		
		if (allowEquivalent) {
			assertEquals(message, isEqual, true);
		} else {
			assertEquals(message, answer, candidate);
		}
	}
	
	/**
	 * Chooses the appropriate answer for the current value of CHECKPOINT.
	 * Prints an error and exits the program if CHECKPOINT is not a value 1-5.
	 * 
	 * @param answer1 Answer for CHECKPOINT == 1
	 * @param answer2 Answer for CHECKPOINT == 2
	 * @param answer3 Answer for CHECKPOINT >= 3
	 * @return The appropriate answer for the current checkpoint
	 */
	private static String chooseAnswer(String answer1, String answer2, String answer3) {
		switch (CHECKPOINT) {
			case 1: 
				return answer1;
			case 2:
				return answer2;
			case 3:
			case 4:
			case 5:
				return answer3;
		}
		
		System.err.println("Invalid FracCalcTestAll.CHECKPOINT specified: " + CHECKPOINT);
		System.err.println("Valid values are 1, 2, 3 (for checkpoints), 4 for final project, " +
				"or 5 for extra credit");
		System.exit(1);
		
		return "";
	}
}
