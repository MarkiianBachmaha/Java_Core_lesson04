package homework03;

public class Robot {

	protected String name;
	protected String work;

	Robot() {
		this.name = "Robot";
		this.work = "просто працюю";
	}

	public Robot(String name, String work) {
		super();
		this.name = "Robot";
		this.work = "просто працюю";
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

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "Robot [я " + name + " - € " + work + "]";
	}

	public void work() {

	}

}