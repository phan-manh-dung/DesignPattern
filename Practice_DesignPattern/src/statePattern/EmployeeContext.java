package statePattern;
public class EmployeeContext implements ChucVuState {
	
	private ChucVuState chucVu;
	
	public ChucVuState getChucVu() {
		return chucVu;
	}
	
	public void setChucVu(ChucVuState chucVu) {
		this.chucVu = chucVu;
	}

	@Override
	public void showNhiemVu() {
		this.chucVu.showNhiemVu();
		
	}
	
	
	
}
