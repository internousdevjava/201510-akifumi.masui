class Exercise05{
  private static Employee[] Employee05;

public static void main(String[] args){

    //Studentクラスで要素が5つの配列を生成する
	Employee05 Employee[] =new Employee05[6];
    Employee[0] = new Employee05("矢沢晃",5,28);
    Employee[1] = new Employee05("宮本純子",10,33);
    Employee[2] = new Employee05("藤原美和子",3,23);
    Employee[3] = new Employee05("土浦巧",25,45);
    Employee[4] = new Employee05("野崎りさ",18,38);
    Employee[5] = new Employee05("浅井真治",8,31);
    
    System.out.println("---------------------------------------");
	System.out.println("*　　            　　　社員名簿システム　　　　　                   *");
	System.out.println("---------------------------------------");
    
	for(int i=0; i<Employee.length; i++){
		Employee[i].display();
		System.out.println("---------------------------------------");
	}

}
}