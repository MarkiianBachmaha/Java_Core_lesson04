package homework03;

public class Robot {

	protected String name;
	protected String work;

	Robot() {
		this.name = "Robot";
		this.work = "������ ������";
	}

	public Robot(String name, String work) {
		super();
		this.name = "Robot";
		this.work = "������ ������";
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

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "Robot [� " + name + " - � " + work + "]";
	}

	public void work() {

	}

}