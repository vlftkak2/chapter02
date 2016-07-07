package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goods camera=new Goods();
		camera.setName("nickon");
		camera.setPrice(50000);
		camera.setCountSold(10);
		camera.setCountStock(10);
	
		System.out.println(Goods.counfoffGoods);
		
//		camera.showInfo();
//		System.out.println(camera.toString());
		
		int discountPrice=camera.calDiscoutPrice(43);
		System.out.println(discountPrice);
		
		Goods goods1=new Goods("nickon",30000,0,100);
		System.out.print(goods1);

	}

}
