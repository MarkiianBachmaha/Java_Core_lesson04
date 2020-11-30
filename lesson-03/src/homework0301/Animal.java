package homework0301;

public class Animal {

	private String nameAnimal;
	private int speed;
	private int age;

	Animal(String nameAnimal, int speed, int age) {
		this.nameAnimal = nameAnimal;
		this.speed = speed;
		this.age = age;
	}

	public Animal() {

	}

	public String getNameAnimal() {
		return nameAnimal;
	}

	public void setNameAnimal(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}

	public int getSpeedAnimal() {
		return speed;
	}

	public void setSpeedAnimal(int speedAnimal) {
		this.speed = speedAnimal;
	}

	public int getAgeAnimal() {
		return age;
	}

	public void setAgeAnimal(int ageAnimal) {
		this.age = ageAnimal;
	}

	@Override
	public String toString() {
		return "Animal [nameAnimal=" + nameAnimal + ", speed=" + speed + ", age=" + age + "]";
	}

}