class Figure{
	//�t�B�[���h
	private int base;		//��Ӄt�B�[���h
	private int height;		//�����t�B�[���h
	//�R���X�g���N�^
	public Figure(int base,int height){
		setBase(base);
		setHeight(height);
	}
	//�\���p���\�b�h
	public void show(){
		System.out.println("���:" + base + " cm");
		System.out.println("����:" + height + " cm");
	}
	//�ʐς����߂郁�\�b�h
	public double getArea(){
		return 0.0;
	}
	//�����̒l��base�t�B�[���h�ɐݒ肷��
	public void setBase(int base){
		if(base > 0){
			this.base = base;
		}
	}
	//�����̒l��height�t�B�[���h�ɐݒ肷��
		public void setHeight(int height){
			if(height > 0){
				this.height = height;
			}
		}
		//base�t�B�[���h�̒l���擾����
		public int getBase(){
			return base;
		}
		//height�t�B�[���h�̒l���擾����
		public int getHeight(){
			return height;
		}
	}