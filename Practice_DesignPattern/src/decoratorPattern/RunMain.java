package decoratorPattern;
public class RunMain {
	public static void main(String[] args) {
		System.out.println("Decorator Pattern");
		BasicEmployee bsEm = new BasicEmployee("Dung");
		
		GiamDocDecorator gd = new GiamDocDecorator(bsEm);
		gd.showNhiemVu();
	}

}
