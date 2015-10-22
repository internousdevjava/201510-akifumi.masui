class Goods {
	String name;
	int cost;
	static double rate;

	Goods(String n) {
		this.name = n;
		this.cost = 0;
	}

	Goods(String n, int c) {
		this.name = n;
		this.cost = c;
	}

	void show(){
		System.out.println("���i���F"+name);
		System.out.println("�Ŕ����i�F"+cost);
		System.out.println("����ŗ��F"+rate );
		System.out.println("�ō����i�F"+getPrice());
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setCost(int c) {
		if (c > 0) {
			this.cost = c;
		}
	}

	public static void setRate(double r) {
		rate = r;
	}

	public String getName() {
		return name;
	}
	

	public int getCost() {
		return cost;
	}

	public double getRate() {
		return rate;
	}
	
	public int getPrice(){
		
		return (int)(cost*(1+rate));
		
	}
}
