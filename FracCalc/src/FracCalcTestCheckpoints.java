import org.junit.Assume;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * Tests for FracCalc checkpoints 1-3.
 */
public class FracCalcTestCheckpoints {
	@Rule public TestName name = new TestName();
	
	@Before public void before() {
		Assume.assumeTrue("Skipping checkpoint tests for final project", FracCalcTestALL.CHECKPOINT < 4);
	}
	
	@Test public void additionSimple3() {
		FracCalcTestALL.assertForCheckpoints("1_1/7 + 3_2/7", "3_2/7", "whole:3 numerator:2 denominator:7", "4_3/7", name);
	}

	@Test public void additionWholeNumbers2() {
		FracCalcTestALL.assertForCheckpoints("2/3 + 1/3", "1/3", "whole:0 numerator:1 denominator:3", "1", name);
	}

	@Test public void additionWholeNumbers7() {
		FracCalcTestALL.assertForCheckpoints("124543 + 897235", "897235", "whole:897235 numerator:0 denominator:1", "1021778", name);
	}

	@Test public void additionWithNegatives4() {
		FracCalcTestALL.assertForCheckpoints("-3_3/4 + 2_2/4", "2_2/4", "whole:2 numerator:2 denominator:4", "-1_1/4", name);
	}

	@Test public void additionImproperFractionsAndReductions2() {
		FracCalcTestALL.assertForCheckpoints("4/5 + 2/8", "2/8", "whole:0 numerator:2 denominator:8", "1_1/20", name);
	}

	@Test public void additionCombined4() {
		FracCalcTestALL.assertForCheckpoints("0 + 34_543/19", "34_543/19", "whole:34 numerator:543 denominator:19", "62_11/19", name);
	}

	@Test public void subtractionSimple3() {
		FracCalcTestALL.assertForCheckpoints("4_1/2 - 4_1/2", "4_1/2", "whole:4 numerator:1 denominator:2", "0", name);
	}

	@Test public void subtractionWithNegatives3() {
		FracCalcTestALL.assertForCheckpoints("-3_3/4 - -2_2/4", "-2_2/4", "whole:-2 numerator:2 denominator:4", "-1_1/4", name);
	}

	@Test public void subtractionCombined2() {
		FracCalcTestALL.assertForCheckpoints("-12_3/7 - -20_2/3", "-20_2/3", "whole:-20 numerator:2 denominator:3", "8_5/21", name);
	}

	@Test public void multiplicationBasic1() {
		FracCalcTestALL.assertForCheckpoints("1_1/2 * 2", "2", "whole:2 numerator:0 denominator:1", "3", name);
	}

	@Test public void multiplicationBasic10() {
		FracCalcTestALL.assertForCheckpoints("27/41 * 14/23", "14/23", "whole:0 numerator:14 denominator:23", "378/943", name);
	}

	@Test public void multiplicationBasic3() {
		FracCalcTestALL.assertForCheckpoints("234 * 702", "702", "whole:702 numerator:0 denominator:1", "164268", name);
	}

	@Test public void multiplicationWithNegatives2() {
		FracCalcTestALL.assertForCheckpoints("-12/3 * 2/1", "2/1", "whole:0 numerator:2 denominator:1", "-8", name);
	}

	@Test public void multiplicationWithNegatives6() {
		FracCalcTestALL.assertForCheckpoints("-3_2/3 * -4_2/7", "-4_2/7", "whole:-4 numerator:2 denominator:7", "15_5/7", name);
	}

	@Test public void multiplicationByZero2() {
		FracCalcTestALL.assertForCheckpoints("0 * 0", "0", "whole:0 numerator:0 denominator:1", "0", name);
	}

	@Test public void multiplicationByZero3() {
		FracCalcTestALL.assertForCheckpoints("0 * 9321", "9321", "whole:9321 numerator:0 denominator:1", "0", name);
	}

	@Test public void multiplicationByZero4() {
		FracCalcTestALL.assertForCheckpoints("0 * -5902", "-5902", "whole:-5902 numerator:0 denominator:1", "0", name);
	}

	@Test public void multiplicationCombined1() {
		FracCalcTestALL.assertForCheckpoints("-32_75/16 * -27_43/21", "-27_43/21", "whole:-27 numerator:43 denominator:21", "1065_115/168", name);
	}

	@Test public void multiplicationCombined2() {
		FracCalcTestALL.assertForCheckpoints("1_27/41 * -3_140/23", "-3_140/23", "whole:-3 numerator:140 denominator:23", "-15_67/943", name);
	}

	@Test public void divisionBasic1() {
		FracCalcTestALL.assertForCheckpoints("3/4 / 4/3", "4/3", "whole:0 numerator:4 denominator:3", "9/16", name);
	}

	@Test public void divisionBasic2() {
		FracCalcTestALL.assertForCheckpoints("3/2 / 2/3", "2/3", "whole:0 numerator:2 denominator:3", "2_1/4", name);
	}

	@Test public void divisionWithNegatives5() {
		FracCalcTestALL.assertForCheckpoints("-20 / 7", "7", "whole:7 numerator:0 denominator:1", "-2_6/7", name);
	}

	@Test public void divisionWithNegatives6() {
		FracCalcTestALL.assertForCheckpoints("-3_3/4 / -2_2/3", "-2_2/3", "whole:-2 numerator:2 denominator:3", "1_13/32", name);
	}

	@Test public void divisionWithZero5() {
		FracCalcTestALL.assertForCheckpoints("0 / 46/27", "46/27", "whole:0 numerator:46 denominator:27", "0", name);
	}

	@Test public void divisionWithZero6() {
		FracCalcTestALL.assertForCheckpoints("0/24 / 1/46", "1/46", "whole:0 numerator:1 denominator:46", "0", name);
	}

	@Test public void divisionCombined2() {
		FracCalcTestALL.assertForCheckpoints("16/4 / -3/2", "-3/2", "whole:0 numerator:-3 denominator:2", "-2_2/3", name);
	}

	@Test public void divisionCombined3() {
		FracCalcTestALL.assertForCheckpoints("-38_3/72 / -4_82/37", "-4_82/37", "whole:-4 numerator:82 denominator:37", "6_661/5520", name);
	}
}
