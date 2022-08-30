package model;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Aug 29, 2022
 */
public class GymMemberBusinessLogic {

	public boolean isMinor(GymMember gymMember) {
		boolean isMinor = false;
		
		if (gymMember.getAge() < 18) {
			isMinor = true;
		}
		
		return isMinor;
	}
	
	public double convertToKilos(GymMember gymMember) {
		final double POUND_TO_KILOGRAM = 0.453592;
		double kilos = 0;
		
		kilos = gymMember.getMaxBackSquat() * POUND_TO_KILOGRAM;
		
		return kilos;
	}
	
}
