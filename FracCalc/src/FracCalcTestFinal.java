import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * Final FracCalc submission tests.
 */
public class FracCalcTestFinal {
	public TestName name = new TestName();
	
	@Before
	public void before() {
		Assume.assumeTrue("Skipping final tests for earlier checkpoint", FracCalcTestALL.CHECKPOINT >= 4);
	}
	
	@Test public void additionSimple1() { FracCalcTestALL.assertForFinalProject("1/5 + 1/5", "2/5", name); }
	@Test public void additionSimple2() { FracCalcTestALL.assertForFinalProject("3/5 + 1/5", "4/5", name); }
	@Test public void additionSimple3() { FracCalcTestALL.assertForFinalProject("1_1/7 + 3_2/7", "4_3/7", name); }
	
	@Test public void additionReduce1() { FracCalcTestALL.assertForFinalProject("3/5 + 3/5", "1_1/5", name); }
	@Test public void additionReduce2() { FracCalcTestALL.assertForFinalProject("4/5 + 2/5", "1_1/5", name); }
	@Test public void additionReduce3() { FracCalcTestALL.assertForFinalProject("1/8 + 1/8", "1/4", name); }
	
	@Test public void additionWholeNumbers1() { FracCalcTestALL.assertForFinalProject("2/5 + 3/5", "1", name); }
	@Test public void additionWholeNumbers2() { FracCalcTestALL.assertForFinalProject("2/3 + 1/3", "1", name); }
	@Test public void additionWholeNumbers3() { FracCalcTestALL.assertForFinalProject("3 + 7", "10", name); }
	@Test public void additionWholeNumbers8() { FracCalcTestALL.assertForFinalProject("1 + 1", "2", name); }
	@Test public void additionWholeNumbers4() { FracCalcTestALL.assertForFinalProject("1 + 3", "4", name); }
	@Test public void additionWholeNumbers5() { FracCalcTestALL.assertForFinalProject("452 + 0", "452", name); }
	@Test public void additionWholeNumbers6() { FracCalcTestALL.assertForFinalProject("0 + 254", "254", name); }
	@Test public void additionWholeNumbers7() { FracCalcTestALL.assertForFinalProject("124543 + 897235", "1021778", name); }
	
	@Test public void additionWithNegatives1() { FracCalcTestALL.assertForFinalProject("3/5 + -1/5", "2/5", name); }
	@Test public void additionWithNegatives2() { FracCalcTestALL.assertForFinalProject("978 + -78", "900", name); }
	@Test public void additionWithNegatives3() { FracCalcTestALL.assertForFinalProject("-78 + 978", "900", name); }
	@Test public void additionWithNegatives4() { FracCalcTestALL.assertForFinalProject("-3_3/4 + 2_2/4", "-1_1/4", name); }
	@Test public void additionWithNegatives5() { FracCalcTestALL.assertForFinalProject("2_2/4 + -3_3/4", "-1_1/4", name); }
	
	@Test public void additionImproperFractionsAndReductions1() { FracCalcTestALL.assertForFinalProject("20/8 + 3_1/3", "5_5/6", name); }
	@Test public void additionImproperFractionsAndReductions2() { FracCalcTestALL.assertForFinalProject("4/5 + 2/8", "1_1/20", name); }
	
	// This unit test tries a number of combined concepts
	@Test public void additionCombined1() { FracCalcTestALL.assertForFinalProject("-9035 + 0", "-9035", name); }
	@Test public void additionCombined2() { FracCalcTestALL.assertForFinalProject("64 + -128", "-64", name); }
	@Test public void additionCombined3() { FracCalcTestALL.assertForFinalProject("-98 + -35", "-133", name); }
	@Test public void additionCombined4() { FracCalcTestALL.assertForFinalProject("0 + 34_543/19", "62_11/19", name); }
	@Test public void additionCombined5() { FracCalcTestALL.assertForFinalProject("-38_3/72 + -4_82/37", "-44_229/888", name); }
	
	@Test public void subtractionSimple1() { FracCalcTestALL.assertForFinalProject("3/5 - 2/5", "1/5", name); }
	@Test public void subtractionSimple2() { FracCalcTestALL.assertForFinalProject("1/5 - 1/5", "0", name); }
	@Test public void subtractionSimple3() { FracCalcTestALL.assertForFinalProject("4_1/2 - 4_1/2", "0", name); }
	
	@Test public void subtractionReduce1() { FracCalcTestALL.assertForFinalProject("9/10 - 1/10", "4/5", name); }
	@Test public void subtractionReduce2() { FracCalcTestALL.assertForFinalProject("5/10 - 3/10", "1/5", name); }
	
	@Test public void subtractionWholeNumbers1() { FracCalcTestALL.assertForFinalProject("68591 - 68591", "0", name); }
	@Test public void subtractionWholeNumbers2() { FracCalcTestALL.assertForFinalProject("42 - 35", "7", name); }
	
	@Test public void subtractionWithNegatives1() { FracCalcTestALL.assertForFinalProject("2/5 - 4/5", "-2/5", name); }
	@Test public void subtractionWithNegatives2() { FracCalcTestALL.assertForFinalProject("5_3/4 - 6_5/8", "-7/8", name); }
	@Test public void subtractionWithNegatives3() { FracCalcTestALL.assertForFinalProject("-3_3/4 - -2_2/4", "-1_1/4", name); }
	@Test public void subtractionWithNegatives4() { FracCalcTestALL.assertForFinalProject("4_1/2 - 5_9/8", "-1_5/8", name); }
	@Test public void subtractionWithNegatives5() { FracCalcTestALL.assertForFinalProject("3_3/4 - 4_7/8", "-1_1/8", name); }
	@Test public void subtractionWithNegatives6() { FracCalcTestALL.assertForFinalProject("-3_3/4 - 2_2/4", "-6_1/4", name); }
	@Test public void subtractionWithNegatives7() { FracCalcTestALL.assertForFinalProject("48623 - 85514", "-36891", name); }
	@Test public void subtractionWithNegatives8() { FracCalcTestALL.assertForFinalProject("0 - 9284", "-9284", name); }
	
	@Test public void subtractionImproperFractionsAndReductions1() { FracCalcTestALL.assertForFinalProject("75/32 - 43/24", "53/96", name); }
	@Test public void subtractionImproperFractionsAndReductions2() { FracCalcTestALL.assertForFinalProject("75/4 - 43/24", "16_23/24", name); }
	
	// This unit test tries a number of combined concepts
	@Test public void subtractionCombined1() { FracCalcTestALL.assertForFinalProject("5_3/4 - -6_5/8", "12_3/8", name); }
	@Test public void subtractionCombined2() { FracCalcTestALL.assertForFinalProject("-12_3/7 - -20_2/3", "8_5/21", name); }
	@Test public void subtractionCombined3() { FracCalcTestALL.assertForFinalProject("-32_75/16 - 27_43/21", "-65_247/336", name); }
	
	@Test public void multiplicationBasic1() { FracCalcTestALL.assertForFinalProject("1_1/2 * 2", "3", name); }
	@Test public void multiplicationBasic2() { FracCalcTestALL.assertForFinalProject("3/5 * 2/5", "6/25", name); }
	@Test public void multiplicationBasic3() { FracCalcTestALL.assertForFinalProject("234 * 702", "164268", name); }
	@Test public void multiplicationBasic4() { FracCalcTestALL.assertForFinalProject("12 * 18", "216", name); }
	@Test public void multiplicationBasic5() { FracCalcTestALL.assertForFinalProject("12/3 * 2/1", "8", name); }
	@Test public void multiplicationBasic6() { FracCalcTestALL.assertForFinalProject("16 * 1/8", "2", name); }
	@Test public void multiplicationBasic7() { FracCalcTestALL.assertForFinalProject("3 * 2/3", "2", name); }
	@Test public void multiplicationBasic8() { FracCalcTestALL.assertForFinalProject("6 * 1/4", "1_1/2", name); }
	@Test public void multiplicationBasic9() { FracCalcTestALL.assertForFinalProject("1 * 8994872", "8994872", name); }
	@Test public void multiplicationBasic10() { FracCalcTestALL.assertForFinalProject("27/41 * 14/23", "378/943", name); }
	@Test public void multiplicationBasic11() { FracCalcTestALL.assertForFinalProject("1_27/41 * 3_14/23", "5_929/943", name); }
	
	@Test public void multiplicationWithNegatives1() { FracCalcTestALL.assertForFinalProject("12/3 * -2/1", "-8", name); }
	@Test public void multiplicationWithNegatives2() { FracCalcTestALL.assertForFinalProject("-12/3 * 2/1", "-8", name); }
	@Test public void multiplicationWithNegatives3() { FracCalcTestALL.assertForFinalProject("-12/3 * -2/1", "8", name); }
	@Test public void multiplicationWithNegatives4() { FracCalcTestALL.assertForFinalProject("-3_2/3 * 4_2/7", "-15_5/7", name); }
	@Test public void multiplicationWithNegatives5() { FracCalcTestALL.assertForFinalProject("3_2/3 * -4_2/7", "-15_5/7", name); }
	@Test public void multiplicationWithNegatives6() { FracCalcTestALL.assertForFinalProject("-3_2/3 * -4_2/7", "15_5/7", name); }
	@Test public void multiplicationWithNegatives7() { FracCalcTestALL.assertForFinalProject("1 * -842346", "-842346", name); }
	@Test public void multiplicationWithNegatives8() { FracCalcTestALL.assertForFinalProject("-1 * 75421", "-75421", name); }
	@Test public void multiplicationWithNegatives9() { FracCalcTestALL.assertForFinalProject("-1 * -37953", "37953", name); }
	
	@Test public void multiplicationByZero1() { FracCalcTestALL.assertForFinalProject("0 * 4/5", "0", name); }
	@Test public void multiplicationByZero2() { FracCalcTestALL.assertForFinalProject("0 * 0", "0", name); }
	@Test public void multiplicationByZero3() { FracCalcTestALL.assertForFinalProject("0 * 9321", "0", name); }
	@Test public void multiplicationByZero4() { FracCalcTestALL.assertForFinalProject("0 * -5902", "0", name); }
	@Test public void multiplicationByZero5() { FracCalcTestALL.assertForFinalProject("146 * 0", "0", name); }
	@Test public void multiplicationByZero6() { FracCalcTestALL.assertForFinalProject("3_25/26 * 0", "0", name); }
	@Test public void multiplicationByZero7() { FracCalcTestALL.assertForFinalProject("-24_1/3 * 0", "0", name); }
	
	@Test public void multiplicationCombined1() { FracCalcTestALL.assertForFinalProject("-32_75/16 * -27_43/21", "1065_115/168", name); }
	@Test public void multiplicationCombined2() { FracCalcTestALL.assertForFinalProject("1_27/41 * -3_140/23", "-15_67/943", name); }
	@Test public void multiplicationCombined3() { FracCalcTestALL.assertForFinalProject("3_2/4 * 4/3", "4_2/3", name); }
	
	@Test public void divisionBasic1() { FracCalcTestALL.assertForFinalProject("3/4 / 4/3", "9/16", name); }
	@Test public void divisionBasic2() { FracCalcTestALL.assertForFinalProject("3/2 / 2/3", "2_1/4", name); }
	@Test public void divisionBasic3() { FracCalcTestALL.assertForFinalProject("9457 / 1", "9457", name); }
	@Test public void divisionBasic4() { FracCalcTestALL.assertForFinalProject("6 / 11", "6/11", name); }
	@Test public void divisionBasic5() { FracCalcTestALL.assertForFinalProject("4 / 9", "4/9", name); }
	@Test public void divisionBasic6() { FracCalcTestALL.assertForFinalProject("23 / 23", "1", name); }
	@Test public void divisionBasic7() { FracCalcTestALL.assertForFinalProject("20 / 7", "2_6/7", name); }
	@Test public void divisionBasic8() { FracCalcTestALL.assertForFinalProject("1_1/12 / 2", "13/24", name); }
	@Test public void divisionBasic9() { FracCalcTestALL.assertForFinalProject("3/4 / 3/4", "1", name); }
	
	@Test public void divisionWithNegatives1() { FracCalcTestALL.assertForFinalProject("-13 / -8", "1_5/8", name); }
	@Test public void divisionWithNegatives2() { FracCalcTestALL.assertForFinalProject("-2803 / 1", "-2803", name); }
	@Test public void divisionWithNegatives3() { FracCalcTestALL.assertForFinalProject("12457 / -1", "-12457", name); }
	@Test public void divisionWithNegatives4() { FracCalcTestALL.assertForFinalProject("-45236 / -1", "45236", name); }
	@Test public void divisionWithNegatives5() { FracCalcTestALL.assertForFinalProject("-20 / 7", "-2_6/7", name); }
	@Test public void divisionWithNegatives6() { FracCalcTestALL.assertForFinalProject("-3_3/4 / -2_2/3", "1_13/32", name); }
	@Test public void divisionWithNegatives7() { FracCalcTestALL.assertForFinalProject("-3_3/4 / 2_2/3", "-1_13/32", name); }
	@Test public void divisionWithNegatives8() { FracCalcTestALL.assertForFinalProject("3_3/4 / -2_2/3", "-1_13/32", name); }
	
	@Test public void divisionWithZero1() { FracCalcTestALL.assertForFinalProject("-0 / 98701", "0", name); }
	@Test public void divisionWithZero2() { FracCalcTestALL.assertForFinalProject("-0 / -98701", "0", name); }
	@Test public void divisionWithZero3() { FracCalcTestALL.assertForFinalProject("0 / -98701", "0", name); }
	@Test public void divisionWithZero4() { FracCalcTestALL.assertForFinalProject("0 / 37569", "0", name); }
	@Test public void divisionWithZero5() { FracCalcTestALL.assertForFinalProject("0 / 46/27", "0", name); }
	@Test public void divisionWithZero6() { FracCalcTestALL.assertForFinalProject("0/24 / 1/46", "0", name); }
	@Test public void divisionWithZero7() { FracCalcTestALL.assertForFinalProject("0/11 / 6/7", "0", name); }
	
	@Test public void divisionCombined1() { FracCalcTestALL.assertForFinalProject("16/4 / 3/2", "2_2/3", name); }
	@Test public void divisionCombined2() { FracCalcTestALL.assertForFinalProject("16/4 / -3/2", "-2_2/3", name); }
	@Test public void divisionCombined3() { FracCalcTestALL.assertForFinalProject("-38_3/72 / -4_82/37", "6_661/5520", name); }
	@Test public void divisionCombined4() { FracCalcTestALL.assertForFinalProject("1_2/3 / -5_6/3", "-5/21", name); }
}
