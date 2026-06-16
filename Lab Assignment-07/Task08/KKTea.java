package Task08;

public class KKTea extends Tea{

	public int weight;
	public int t_bags;
	public static int t_sale;
	public static int reg_tea;
	public static int flav_tea;

	public KKTea(int p, int b){
		super("KK Regular Tea",p);
		t_bags=b;
		weight=t_bags*2;
	}

	public void productDetail(){
		super.productDetail();
		System.out.println("Weight: "+weight+", "+"Tea Bags: "+t_bags);
	}

	public static void totalSales(){
		System.out.println("Total Sales: "+t_sale);
		System.out.println("KK Regular Tea: "+reg_tea);

		if(flav_tea==0){
			
		}
		else{
			System.out.println("Flavoured Tea: "+flav_tea);
		}
	}

	public static void updateSoldStatusRegular(KKTea t){
		t.status=true;
		reg_tea++;
		t_sale++;
	}
}
