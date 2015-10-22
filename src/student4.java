class Student4 {


		private String name;
		private int kokugo;
		private int sansu;
		
		
		Student4(String name,int kokugo,int sansu){
	        this.name = name;
	        this.kokugo = kokugo;
            this.sansu = sansu;
		}
		
		Student4(String name){
			    this.name = name;
		        this.kokugo = 0;
	            this.sansu = 0;
		}
	         void show(){
	    	   System.out.println("–¼F"+ name);
	    	   System.out.println("‘Œê:"+ kokugo );
	    	   System.out.println("Z”"+ sansu );
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
	public void setKokugo(int k){
		if(k > 0);
		this.kokugo = k;
	}
	public void setSansu(int s){
		if(s > 0)
		this.sansu = s;
	}
}
	      
