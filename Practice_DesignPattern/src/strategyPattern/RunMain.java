package strategyPattern;
public class RunMain {
	public static void main(String[] args) {
		NhanVienContext employee1 = new NhanVienContext(1, "Mạnh Dũng", ChucVu.GIAMDOC);
        employee1.printNhiemVu(); 

        NhanVienContext employee2 = new NhanVienContext(2, "Văn A", ChucVu.KETOAN);
        employee2.printNhiemVu(); 

        employee2.setStrategy(new KeToan());
        employee2.printNhiemVu();
	}
}
