
public class Kisokadai2 {

	public static void main(String[] args) {
		System.out.println("数当てゲーム");
		int anser = new java.util.Random().nextInt(100);
	  
		for (int i = 0; i < 5; i++){
			System.out.println("1~100までの数字を入力してください");
			@SuppressWarnings("resource")
			int input = new java.util.Scanner(System.in).nextInt();
			try{
				if(anser == input){
					System.out.println("あたり");
					break;
				}else if(anser > input) {
					System.out.println("答えは"+input+"より大きいです");
				}else{
					System.out.println("答えは"+input+"より小さいです");
				}
			}catch(Exception e){
				System.out.println("数字以外を入力しないでください");
			}
			
		}
		System.out.println("答えは"+ anser +"でした");
	}

}
