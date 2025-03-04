package decoratorPattern;
public class BasicEmployee implements EmployeeComponent {

	private String name;

	public BasicEmployee(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showNhiemVu() {
		System.out.println(name);
	}
	
}
