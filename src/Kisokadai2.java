
public class Kisokadai2 {

	public static void main(String[] args) {
		System.out.println("�����ăQ�[��");
		int anser = new java.util.Random().nextInt(100);
	  
		for (int i = 0; i < 5; i++){
			System.out.println("1~100�܂ł̐�������͂��Ă�������");
			@SuppressWarnings("resource")
			int input = new java.util.Scanner(System.in).nextInt();
			try{
				if(anser == input){
					System.out.println("������");
					break;
				}else if(anser > input) {
					System.out.println("������"+input+"���傫���ł�");
				}else{
					System.out.println("������"+input+"��菬�����ł�");
				}
			}catch(Exception e){
				System.out.println("�����ȊO����͂��Ȃ��ł�������");
			}
			
		}
		System.out.println("������"+ anser +"�ł���");
	}

}
