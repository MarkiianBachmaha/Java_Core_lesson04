package homework0301;

public class Application {

	public static void main(String[] args) {

		Animal animal = new Animal("���", 2, 14);

		String nameAnimal = animal.getNameAnimal();
		int speed = animal.getSpeedAnimal();
		int age = animal.getAgeAnimal();

		System.out.println("����� ������� = " + nameAnimal + ", �������� ������� = " + speed
				+ " ��/���, ³� ������� = " + age + " ����");

		animal.setNameAnimal("�������");
		animal.setSpeedAnimal(20);
		animal.setAgeAnimal(7);

		nameAnimal = animal.getNameAnimal();
		speed = animal.getSpeedAnimal();
		age = animal.getAgeAnimal();

		System.out.println("\n");
		System.out.println("����� ������� = " + nameAnimal + ", �������� ������� = " + speed
				+ " ��/���, ³� ������� = " + age + " ����");

	}

}