package homework0301;

public class Application {

	public static void main(String[] args) {

		Animal animal = new Animal("Бик", 2, 14);

		String nameAnimal = animal.getNameAnimal();
		int speed = animal.getSpeedAnimal();
		int age = animal.getAgeAnimal();

		System.out.println("Назва тварини = " + nameAnimal + ", Швидкість тварини = " + speed
				+ " км/год, Вік тварини = " + age + " років");

		animal.setNameAnimal("Леопард");
		animal.setSpeedAnimal(20);
		animal.setAgeAnimal(7);

		nameAnimal = animal.getNameAnimal();
		speed = animal.getSpeedAnimal();
		age = animal.getAgeAnimal();

		System.out.println("\n");
		System.out.println("Назва тварини = " + nameAnimal + ", Швидкість тварини = " + speed
				+ " км/год, Вік тварини = " + age + " років");

	}

}