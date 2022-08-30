package model;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Aug 29, 2022
 */
public class GymMember {

	private String firstName;
	private String lastName;
	private int age;
	private double maxBackSquat;

	public GymMember() {
		super();
	}

	public GymMember(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	// getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMaxBackSquat() {
		return maxBackSquat;
	}

	public void setMaxBackSquat(double maxBackSquat) {
		this.maxBackSquat = maxBackSquat;
	}

}
