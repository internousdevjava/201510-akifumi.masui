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
	      //���ДN����ݒ肷�郁�\�b�h
	      public void setKokugo(int k){
	        if(k > 0){
	          this.kokugo = k;
	        }
	      }
	      //�N���ݒ肷�郁�\�b�h
	      public void setSansu(int s){
	        if(s > 0){
	          this.sansu = s;
	        }
	      }
	       void show(){
	    	   System.out.println("�����F"+ name);
	    	   System.out.println("����:"+ kokugo );
	    	   System.out.println("�Z��"+ sansu );
	    }
	
}
	      

	


