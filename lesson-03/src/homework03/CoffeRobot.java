package homework03;

public class CoffeRobot extends Robot {

	CoffeRobot() {
		super();
		this.name = "CoffeRobot";
		this.work = "���� ����";
	}

	public CoffeRobot(String name, String work) {

	}

	public void work(String name, String work) {
		System.out.println("�" + this.name + "�" + "�" + this.work);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CoffeRobot [� " + name + " - � " + work + "]";
	}

}