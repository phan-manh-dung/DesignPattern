package NoPattern;
public class Employee {
	
	private int id;
	private String name;
	private ChucVu chucVu;
	
	public Employee(int id, String name, ChucVu chucVu) {
		super();
		this.id = id;
		this.name = name;
		this.chucVu = chucVu;
	}
	
	public ChucVu getChucVu() {
		if(chucVu == ChucVu.GIAMDOC) {
			System.out.println("Công việc của giám đốc");
		}else if(chucVu == ChucVu.PHOGIAMDOC) {
			System.out.println("Công việc của Phó giám đốc");
		}else if(chucVu == ChucVu.NHANVIEN) {
			System.out.println("Công việc của nhân viên");
		}else {			
			System.out.println("Không rõ công việc");
		}
		return chucVu;
	}
	
}
