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
public class TestGymMemberBusinessLogic {

	GymMemberBusinessLogic gymMemberBL = new GymMemberBusinessLogic();
	GymMember gymMember = new GymMember("Mary", "White");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsMinor_True() {
		gymMember.setAge(17);
		assertTrue(gymMemberBL.isMinor(gymMember));
	}

	@Test
	public void testIsMinor_False() {
		gymMember.setAge(18);
		assertFalse(gymMemberBL.isMinor(gymMember));
	}

	@Test
	public void testConvertToKilos() {
		gymMember.setMaxBackSquat(325);
		assertEquals(147.42, gymMemberBL.convertToKilos(gymMember), 0.01);
	}

}
