package homework03;

public class RobotDancer extends Robot {

	RobotDancer() {
		super();
		this.name = "RobotDancer";
		this.work = "просто танцюю";
	}

	public RobotDancer(String name, String work) {

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
		return "RobotDancer [я " + name + " - € " + work + "]";
	}

}