package statePattern;
public class NhanVienState implements ChucVuState {

	@Override
	public void showNhiemVu() {
		System.out.println("Nhiệm vụ của nhân viên");
	}

}
