class Employee05{
  private static int number = 0;
  private int code;
  private String name;
  private int year;
  private int age;

  //�R���X�g���N�^�̒�`
  public Employee05(String name,int year,int age){
    setName(name);
    setYear(year);
    setAge(age);
    code = ++number;
  }
  public Employee05(){
    this("����",0,0);
  }
  public Employee05(String name){
    this(name,0,0);
  }
  public Employee05(String name,int age){
	    this(name,0,age);
	  }

	  //�t�B�[���h�̃f�[�^��\�����郁�\�b�h
	  public void display(){
	    System.out.println("�Ј��ԍ��F"+code);
	    System.out.println("�Ј����F"+name);
	    System.out.println("���ДN���F"+year);
	    System.out.println("�N��F"+age);
	  }
	  //�Ј�����ݒ肷�郁�\�b�h
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
	  //�Ј��ԍ����擾���郁�\�b�h
	  public int getCode(){
	    return code;
	  }
	  //�Ј������擾���郁�\�b�h
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
	  //���Ј�����\�����郁�\�b�h
	  public static void showTotalNumber(){
	    System.out.println("���Ј�����"+number+"�l�ł��B");
	  }
	
		
	}
	