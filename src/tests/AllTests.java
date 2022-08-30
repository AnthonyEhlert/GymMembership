package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Aug 30, 2022
 */
@RunWith(Suite.class)
@SuiteClasses({ TestGymMemberBusinessLogic.class, TestMemberName.class })
public class AllTests {

}
