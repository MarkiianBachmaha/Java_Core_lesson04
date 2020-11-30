package homework03;

public class RobotCoocker extends Robot {

	RobotCoocker() {
		super();
		this.name = "RobotCoocker";
		this.work = "просто готую";
	}

	public RobotCoocker(String name, String work) {

	}

	public void work(String name, String work) {
		System.out.println("я" + this.name + "Ц" + "€" + this.work);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "RobotCoocker [я " + name + " - € " + work + "]";
	}

}