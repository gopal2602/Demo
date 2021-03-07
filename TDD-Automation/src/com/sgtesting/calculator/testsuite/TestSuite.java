package com.sgtesting.calculator.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({com.sgtesting.calculator.tests.AdditionTests.class,
	com.sgtesting.calculator.tests.MultiplicationTests.class})
public class TestSuite {

}
