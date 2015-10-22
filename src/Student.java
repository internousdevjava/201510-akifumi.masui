import javax.management.loading.PrivateClassLoader;

class Student {


		private String name;
		private int kokugo;
		private int sansu;
		
		public Student(String string, int i, int j) {
		}
		public String getName(){
			return name;
		}
		public int getKokugo(){
			return kokugo;
		}
		public int getSansu(){
			return sansu;
		}
		public void setName(String n){
	        this.name = n;
	      }
	      //入社年数を設定するメソッド
	      public void setKokugo(int k){
	        if(k > 0){
	          this.kokugo = k;
	        }
	      }
	      //年齢を設定するメソッド
	      public void setSansu(int s){
	        if(s > 0){
	          this.sansu = s;
	        }
	      }
	       void show(){
	    	   System.out.println("氏名："+ name);
	    	   System.out.println("国語:"+ kokugo );
	    	   System.out.println("算数"+ sansu );
	    }
	
}
	      

	


