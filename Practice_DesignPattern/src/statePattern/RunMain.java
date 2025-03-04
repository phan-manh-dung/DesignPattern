package statePattern;

public class RunMain {
	
	public static void main(String[] args) {
		System.out.println("Design Pattern State");
		
		EmployeeContext emp = new EmployeeContext();
		
		ChucVuState giamDoc = new GiamDocState();
		emp.setChucVu(giamDoc);
		
		emp.showNhiemVu();
		
		
	}

}
