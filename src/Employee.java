class Employee {
	static int number = 0;  //���]�ƈ���
    int    code;             //�]�ƈ��ԍ�
	 String name;      //�Ј���
	    int    year;      //���ДN��
	    int    age;       //�N��
	    
	    //�R���X�g���N�^�̒�`
	    Employee(String name,int year,int age){
	      this.name = name;
	      this.year = year;
	      this.age = age;
	      code = ++number;      //number��1�J�E���g�A�b�v����
	    }
	    
	    //name�Ɂu����v�Ayear�Ɂu0�v�Aage�Ɂu0�v���i�[
	    Employee(){
	      this("����",0,0);
	    }
	    //name�Ɉ���name�Ayear�Ɂu0�v�Aage�Ɂu0�v���i�[
	    Employee(String name){
	      this(name,0,0);
	    }
	    //name�Ɉ���name�Ayear�Ɂu0�v�Aage�ɕϐ�age���i�[
	    Employee(String name,int age){
	      this(name,0,age);
	    }
	    //�e�t�B�[���h�̒l��\�����郁�\�b�h
	    void display(){
	    System.out.println("�]�ƈ��ԍ��F"+ code);
	      System.out.println("�]�ƈ����F"+ name);
	      System.out.println("���ДN���F"+ year);
	      System.out.println("�N�@�@��F"+ age);
	    }
	      
	      
	      //�]�ƈ�����ݒ肷�郁�\�b�h
	      public void setName(String name){
	        this.name = name;
	      }
	      //���ДN����ݒ肷�郁�\�b�h
	      public void setYear(int year){
	        if(year > 0){
	          this.year = year;
	        }
	      }
	      //�N���ݒ肷�郁�\�b�h
	      public void setAge(int age){
	        if(age > 0){
	          this.age = age;
	        }
	      }
	      //�]�ƈ������擾���郁�\�b�h
	      public String getName(){
	        return name;
	      }
	      //���ДN�����擾���郁�\�b�h
	      public int getYear(){
	        return year;
	      }
	      //�N����擾���郁�\�b�h
	      public int getAge(){
	        return age;
	     
	    }
}

