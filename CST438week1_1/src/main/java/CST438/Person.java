package CST438;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {

	@NotNull
	@Size(min=3, max=25)
	private String firstName;
	
	@NotNull
	@Size(min=3, max=25)
	private String lastName;
	
	@NotNull
	@Size(min=3, max=25)
	private String favoriteFood;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, String favoriteFood) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.favoriteFood = favoriteFood;
	}

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

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	
	
	
}
