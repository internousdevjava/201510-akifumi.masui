import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 
 */

/**
 * @author internous
 *
 */
public class KisoKadai3 {

	/**
	 * @param args
	 */
	public static void main(String args[]) throws IOException {
		System.out.println("--�����J�n--");
		if(args.length==0){
			System.out.println("�R�}���h���C���������w�肵�ē��͂��Ȃ����Ă�������");
			System.out.println("[��] > java TextStream C:��Users��internous���V�����t�H���_�[��");
			System.out.println("\n�������I�����܂�");
			return;
		}

	}
	private String[] args;
		File file = new File(args[0]);
		File dir = new File(file.getParent());{
		
		if(!dir.exists()){
			System.out.println("�t�H���_������܂���B�F"+file.getAbsolutePath());
	        dir.mkdir();
	        System.out.println("�쐬����");
		}else{
			System.out.println("�t�H���_�͊��ɑ��݂��܂��B");
		}
		if(file.exists()){
			System.out.println("�t�@�C���͊��ɑ��݂��܂��B\n" + file.getAbsolutePath());
		}else{
			System.out.println("�t�H���_�͑��݂��܂���B\n" + file.getAbsolutePath());
			try{
				if(file.createNewFile()){ 
					System.out.println("�쐬����");
				}else{
					System.out.println("�쐬���s");
				}
			}catch(IOException e){
				System.out.println(e);
			}
		}
		int end = 0;
		while(end==0){
			System.out.println("\n\n--���j���[--\n\n 1:�ǂݍ���\n 2:��������\n99:�I��\n����͂��Ă�������");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
 			String str = null;
			try {
				str = br.readLine();
			} catch (IOException e1) {
				e1.printStackTrace();
			} 
 		int nu = 0;
 		
 		if(str.matches("^[0-9]+$")){
 			nu=Integer.parseInt(str);
 		}else{
 			System.out.println("\n----------\n���p���l�Ń��j���[��I�����Ă��������B\n----------\n");
 		}
 		if(nu==99){
 			System.out.println("�t�@�C����ǂ�");
 			try{
 				FileReader filereader = new FileReader(file.getAbsolutePath());
 				int ch;
 				while((ch = filereader.read()) != -1 ){
 					System.out.println((char)ch);
 				}
 				filereader.close();
 			}catch(FileNotFoundException e){
 				System.out.println(e);
 			}catch(IOException e){
 				System.out.println(e);
 			}
 		}
		if(nu==2){
			System.out.println("�t�@�C��������");
			try{
				boolean mode = false;
				System.out.println("���[�h�̐ݒ�B1:�ǋL�A2:�㏑��");
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String str2 = br2.readLine();
				switch(str2){
				case"1":
					mode = true;
					break;
				case"2":
					mode = false;
				default:
					break;
					
				}
				FileWriter fw = new FileWriter(file.getAbsolutePath(), mode);
				PrintWriter pw = new PrintWriter(new BufferedWriter(fw)); 
				
				BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
				String str3 = br3.readLine();
				pw.println(str3);
				
				pw.close();
				System.out.println("�o�͂��������܂����B");
			} catch (IOException ex){
				ex.printStackTrace();
			}
		}
			
		}
}
{
System.out.println("--�����I��--");
}
}