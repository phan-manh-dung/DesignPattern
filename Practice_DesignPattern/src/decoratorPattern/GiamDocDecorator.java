package decoratorPattern;
public class GiamDocDecorator extends EmployeeDecorator{
	public GiamDocDecorator(BasicEmployee dsEm) {
		super(dsEm);
    }

    @Override
    public void showNhiemVu() {
        System.out.println(" đang là giám đốc");
    }
}
