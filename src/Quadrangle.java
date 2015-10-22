

class Quadrangle extends Figure{

	public Quadrangle(int b, int h) {
		super(b,h);
	}
	public void show(){
		System.out.println("底辺:" + getBase() + " cm");
		System.out.println("高さ:" + getHeight() + " cm");
		System.out.println("面積:" + getArea() + " 平方センチ");
	}
	public double getArea(){
		return getBase() * getHeight();
	}

		// TODO 自動生成されたメソッド・スタブ
		
	}
	


