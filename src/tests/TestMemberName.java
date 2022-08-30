package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.GymMember;
import model.MemberName;


/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Aug 29, 2022
 */
public class TestMemberName {
	MemberName memberMemo = new MemberName();
	GymMember gymMember = new GymMember("Tim", "White");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateFullName() {
		String fullName = "Tim White";
		assertEquals(fullName, memberMemo.createFullName(gymMember));
	}
	
	@Test
	public void testWelcomeMessage() {
		String welcomeMessage = "Welcome Tim";
		assertEquals(welcomeMessage, memberMemo.welcomeMessage(gymMember));
	}

}
