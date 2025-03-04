package NoPattern;
import NoPattern.ChucVu;
import NoPattern.Employee;

public class RunMain {
	public static void main(String[] args) {
		Employee employ = new Employee(1, "Mạnh Dũng", ChucVu.GIAMDOC);
		employ.getChucVu();
	}
}
