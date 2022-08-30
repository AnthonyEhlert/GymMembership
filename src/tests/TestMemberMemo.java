package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.GymMember;
import model.GymMemberBusinessLogic;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Aug 29, 2022
 */
public class TestMemberMemo {
	GymMemberBusinessLogic gymMemBL = new GymMemberBusinessLogic();
	GymMember gymMember = new GymMember("Tim", "White");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateFullName() {
		assertEquals();
	}

}
