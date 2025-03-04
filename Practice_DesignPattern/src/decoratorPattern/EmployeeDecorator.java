package decoratorPattern;
public class EmployeeDecorator implements EmployeeComponent {

	protected EmployeeComponent employee;
	
	@Override
	public void showNhiemVu() {
		this.employee.showNhiemVu();
	}
	
	public EmployeeComponent getEmployee() {
		return employee;
	}
	
	public void setEmployee(EmployeeComponent employee) {
		this.employee = employee;
	}

	public EmployeeDecorator(EmployeeComponent employee) {
		super();
		this.employee = employee;
	}
	
	

}
