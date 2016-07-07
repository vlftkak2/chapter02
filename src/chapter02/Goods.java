package chapter02;

public class Goods {

	public static int counfoffGoods;
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods(){
		
	}
	
	public Goods(String name, int price, int countStock, int countSold){
		 this.name=name;
		 this.price=price;
		 this.countStock=countStock;
		 this.countSold=countSold;
		
	}

	public void setName(String name) { // 구분을 해줄 필요가 있다., 메소드를 호출할때 파라미터
		this.name = name; // this는 인스턴스 자체를 가리키는 키워드
	}

	public String getName() {
		return name;

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			price = 0;
		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public void showInfo() {
		System.out.println("[name" + name + "," + "price" + "=" + price+","+"countStock"+"="+countStock+","+"countSold"+"="+countSold);
	}
	
	public int calDiscoutPrice(int percentage){
		return price*percentage/10;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}

}
