

class Quadrangle extends Figure{

	public Quadrangle(int b, int h) {
		super(b,h);
	}
	public void show(){
		System.out.println("���:" + getBase() + " cm");
		System.out.println("����:" + getHeight() + " cm");
		System.out.println("�ʐ�:" + getArea() + " �����Z���`");
	}
	public double getArea(){
		return getBase() * getHeight();
	}

		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}
	


