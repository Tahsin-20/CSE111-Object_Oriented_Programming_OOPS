package Task08;

public class KKFlavouredTea extends KKTea{

    public KKFlavouredTea(String n, int p, int b){
		super(p,b);
		name="KK "+n+" Tea";
	}

	public static void updateSoldStatusFlavoured(KKFlavouredTea t){
		t.status=true;
		flav_tea++;
		t_sale++;
	}

	public void productDetail(){
		super.productDetail();
	}
}