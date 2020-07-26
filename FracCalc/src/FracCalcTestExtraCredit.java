import static org.junit.Assert.assertEquals;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * FracCalc extra credit tests. It's okay if these fail.
 */
public class FracCalcTestExtraCredit {
	public TestName name = new TestName();
	
	@Before
	public void before() {
		Assume.assumeTrue("Skipping extra credit tests for earlier checkpoint", FracCalcTestALL.CHECKPOINT == 5);
	}
	
	@Test public void multipleOps1() { FracCalcTestALL.assertForFinalProject("1_2/3 + 5/4 + 5_5/4 - 2_2/4 / -5_6/3", "-20/21", name); }
	@Test public void multipleOps2() { FracCalcTestALL.assertForFinalProject("1 + 3 + -3 - -3", "4", name); }
	@Test public void multipleOps3() { FracCalcTestALL.assertForFinalProject("12 * 18 * 18 * 0", "0", name); }
	@Test public void multipleOps4() { FracCalcTestALL.assertForFinalProject("20/8 + 3_1/3 - 4/5 - 5/4", "3_47/60", name); }
	@Test public void multipleOps5() { FracCalcTestALL.assertForFinalProject("12345 - 12345 + 12345 - 12345 + 1", "1", name); }
	@Test public void multipleOps6() { FracCalcTestALL.assertForFinalProject("0 * 0 / 1 / 4/6 / 2_3/4", "0", name); }
	@Test public void multipleOps7() { FracCalcTestALL.assertForFinalProject("1/5 + 1/5 + 1/5 + 1/5 + 1/5 - 2", "-1", name); }
	@Test public void multipleOps8() { FracCalcTestALL.assertForFinalProject("-4 + 1 + 1 + 1 + 1", "0", name); }
	@Test public void multipleOps9() { FracCalcTestALL.assertForFinalProject("16/4 / 3/2 * 3/2 + 1/2", "4_1/2", name); }
	@Test public void multipleOps10() { FracCalcTestALL.assertForFinalProject("12457 / -1 + 12457", "0", name); }
	@Test public void multipleOps11() { FracCalcTestALL.assertForFinalProject("5_3/4 - -6_8/8 - 5_3/4", "7", name); }
	@Test public void multipleOps12() { FracCalcTestALL.assertForFinalProject("2 * 3 - 6 + 1_1/2 + 1/2 - 1/2 - 1/2 + 3", "4", name); }
	@Test public void multipleOps13() { FracCalcTestALL.assertForFinalProject("2 * 3 - 6 + -1_1/2 + -1/2 - -1/2 - -1/2 - 3", "-4", name); }
	@Test public void multipleOps14() { FracCalcTestALL.assertForFinalProject("20 / 5 * -1 + 8", "4", name); }
	
	@Test public void errorEmptyInput() { assertError(""); }
	@Test public void errorSpace() { assertError(" "); }
	@Test public void error0Denominator() { assertError("1/0 + 1"); }
	@Test public void errorDivideBy0() { assertError("2_5/8 / 0"); }
	@Test public void errorNotNumbers() { assertError("hi there"); }
	@Test public void errorNumberPlusWord() { assertError("1_3/4 + hi"); }
	@Test public void errorInvalidOperator1() { assertError("1 ++ 2"); }
	@Test public void errorInvalidOperator2() { assertError("1 & 2"); }
	@Test public void errorInvalidOperator3() { assertError("2 ^ 7"); }
	@Test public void errorInvalidFormat1() { assertError("2 +"); }
	@Test public void errorInvalidFormat2() { assertError("+ 2"); }
	@Test public void errorNoSpaces() { assertError("1+2"); }
	@Test public void errorInvalidFractionFormat() { assertError("1 3/4 + 2 1/5"); }
	
	private void assertError(String input) {
		String answer;
		String error = null;
		String forInvalidInput = " for invalid input '" + input + "'";
		try {
			answer = FracCalc.produceAnswer(input);
			if (answer == null) {
				error = "Calculator returned null" + forInvalidInput;
			} else if (!answer.startsWith("ERROR:")) {
				error = "Calculator did not return answer starting with 'ERROR:'" + forInvalidInput +
						"\nReturned answer: " + answer;
			}
		} catch (Exception ex) {
			error = "Calculator threw an exception" + forInvalidInput + "'\n" + ex;
		}

		if (error != null) {
			System.err.println("FAILURE: " + name.getMethodName());
			System.err.println(error + "\n");
			assertEquals(error, true, false);
		}
	}
}
