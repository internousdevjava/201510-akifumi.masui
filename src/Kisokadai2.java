
public class Kisokadai2 {

	public static void main(String[] args) {
		System.out.println("”“–‚ÄƒQ[ƒ€");
		int anser = new java.util.Random().nextInt(100);
	  
		for (;;){
			System.out.println("1~100‚Ü‚Å‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
			
			try{
				@SuppressWarnings("resource")
				int input = new java.util.Scanner(System.in).nextInt();
				if(anser == input){
					System.out.println("‚ ‚½‚è");
					break;
				}else if(anser > input) {
					System.out.println("“š‚¦‚Í"+input+"‚æ‚è‘å‚«‚¢‚Å‚·");
				}else{
					System.out.println("“š‚¦‚Í"+input+"‚æ‚è¬‚³‚¢‚Å‚·");
				}
			}catch(Exception e){
				System.out.println("”šˆÈŠO‚Ì•¶š‚ª“ü—Í‚³‚ê‚Ä‚¢‚Ü‚·B");
				System.out.println("‚à‚¤‚¢‚¿‚Ç");
			}
			
		}
		System.out.println("“š‚¦‚Í"+ anser +"‚Å‚µ‚½");
	}

}
