package homework03;

public class RobotDancer extends Robot {

	RobotDancer() {
		super();
		this.name = "RobotDancer";
		this.work = "������ ������";
	}

	public RobotDancer(String name, String work) {

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
		return "RobotDancer [� " + name + " - � " + work + "]";
	}

}