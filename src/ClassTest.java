class ClassTest {
	 public static void main(String[] args){
		    //Employee�N���X�̃C���X�^���X�𐶐����A�Q�Ɛ��ϐ��Ɋi�[
		    Employee yamamoto = new Employee("�R�{�@���Y",2,20);
		    Employee matsuda = new Employee("���c�@���Y",4,25); //2�ڂ̃C���X�^���X
		    Employee yasuda = new Employee("���c�@�O�Y",28); 
		    Employee nanashi = new Employee();
		    
		    yamamoto.setName("�R�{�@�����Y"); //�ϐ�yamamoto�̏]�ƈ�����ύX
		    yasuda.setYear(-1);               //�ϐ�yasuda�̓��ДN����ύX
		    
		    //�ϐ�yamamoto���Q�Ƃ��Ă���C���X�^���X�̊e�t�B�[���̒l��
		    //��ʂɕ\��
		    yamamoto.display();

		    //�ϐ�matsuda���Q�Ƃ��Ă���C���X�^���X�̊e�t�B�[���̒l��
		    //��ʂɕ\��
		    matsuda.display();
		   
		  //�ϐ�matsuda���Q�Ƃ��Ă���C���X�^���X�̊e�t�B�[���h�̒l��
		    //��ʂɕ\��
		    yasuda.display();
		    
		    //�ϐ�matsuda���Q�Ƃ��Ă���C���X�^���X�̊e�t�B�[���h�̒l��
		    //��ʂɕ\��
		    nanashi.display();

		  }
}
