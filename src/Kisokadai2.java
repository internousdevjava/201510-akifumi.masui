
public class Kisokadai2 {

	public static void main(String[] args) {
		System.out.println("数当てゲーム");
		int anser = new java.util.Random().nextInt(100);
	  
		for (;;){
			System.out.println("1~100までの数字を入力してください");
			
			try{
				@SuppressWarnings("resource")
				int input = new java.util.Scanner(System.in).nextInt();
				if(anser == input){
					System.out.println("あたり");
					break;
				}else if(anser > input) {
					System.out.println("答えは"+input+"より大きいです");
				}else{
					System.out.println("答えは"+input+"より小さいです");
				}
			}catch(Exception e){
				System.out.println("数字以外の文字が入力されています。");
				System.out.println("もういちど");
			}
			
		}
		System.out.println("答えは"+ anser +"でした");
	}

}
