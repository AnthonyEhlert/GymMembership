package model;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Aug 30, 2022
 */
public class MemberName {

	public String createFullName(GymMember gymMember) {
		String fullName = gymMember.getFirstName() + " " + gymMember.getLastName();

		return fullName;
	}

	public String welcomeMessage(GymMember gymMember) {
		String welcomeMessage = "Welcome " + gymMember.getFirstName();

		return welcomeMessage;
	}

}
