class Exercise05{
  private static Employee[] Employee05;

public static void main(String[] args){

    //Student�N���X�ŗv�f��5�̔z��𐶐�����
	Employee05 Employee[] =new Employee05[6];
    Employee[0] = new Employee05("���W",5,28);
    Employee[1] = new Employee05("�{�{���q",10,33);
    Employee[2] = new Employee05("�������a�q",3,23);
    Employee[3] = new Employee05("�y�Y�I",25,45);
    Employee[4] = new Employee05("���肳",18,38);
    Employee[5] = new Employee05("���^��",8,31);
    
    System.out.println("---------------------------------------");
	System.out.println("*�@�@            �@�@�@�Ј�����V�X�e���@�@�@�@�@                   *");
	System.out.println("---------------------------------------");
    
	for(int i=0; i<Employee.length; i++){
		Employee[i].display();
		System.out.println("---------------------------------------");
	}

}
}