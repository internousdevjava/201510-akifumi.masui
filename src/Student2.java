import javax.management.loading.PrivateClassLoader;

class Student2 {


		private String name;
		private int kokugo;
		private int sansu;
		
		
		Student2(String name,int kokugo,int sansu){
	        this.name = name;
	        this.kokugo = kokugo;
            this.sansu = sansu;
		}
		
		Student2(String name){
			    this.name = name;
		        this.kokugo = 0;
	            this.sansu = 0;
		}
	         void show(){
	    	   System.out.println("–¼F"+ name);
	    	   System.out.println("‘Œê:"+ kokugo );
	    	   System.out.println("Z”"+ sansu );
	    }
	
}
	      

	


