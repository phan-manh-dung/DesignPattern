package strategyPattern;
public class NhanVienContext {
	private int id;
    private String name;
    private NhiemVuComponent strategy;

    public NhanVienContext(int id, String name, ChucVu chucVu) {
        this.id = id;
        this.name = name;
        setStrategyByChucVu(chucVu); // Gán chiến lược dựa trên chức vụ
    }

    private void setStrategyByChucVu(ChucVu chucVu) {
        switch (chucVu) {
            case GIAMDOC:
                this.strategy = new GiamDoc();
                break;
            case KETOAN:
                this.strategy = new KeToan();
                break;
            default:
                throw new IllegalArgumentException("Chức vụ không hợp lệ");
        }
    }

    public void setStrategy(NhiemVuComponent strategy) {
        this.strategy = strategy;
    }

    public void printNhiemVu() {
        System.out.println("Nhiệm vụ của " + name + ": " + strategy.showNhiemVu());
    }
}
