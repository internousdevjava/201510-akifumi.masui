import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KisoKadai1
{
	  public static void main(String args[]) //void���߂�l
	  {
		    System.out.println("���̕\");

		    int x;
            int y;
                       
            // x����
            System.out.print("x����͂��Ă�������: ");
            InputStreamReader isrx = new InputStreamReader(System.in);
            BufferedReader brx = new BufferedReader(isrx);
            try{
                    String bufx = brx.readLine();
                    x = Integer.parseInt(bufx);
                    if(0 < x & 100 < x){
                    	System.out.println("1�`100�܂ł̐����ł��肢���܂�");
                    	return;//�߂�l�܂Ŗ߂�
                    }
            }catch(Exception e){
                    System.out.println("x�ɐ����ȊO�������Ă��܂�");
                    return;//�߂�l�܂Ŗ߂�
            }
         
            //�@y����
            System.out.print("y����͂��Ă�������: ");
            InputStreamReader isry = new InputStreamReader(System.in);
            BufferedReader bry = new BufferedReader(isry);
            try{
                String bufy = bry.readLine();
                y = Integer.parseInt(bufy);
                if(y > 100 & y > 0){
                	System.out.println("1�`100�܂ł̐����ł��肢���܂�");
                	return;
                }
            }catch(Exception e){
                System.out.println("y�ɐ����ȊO�������Ă��܂�");
                return;
            }
            
		    // �z��̐錾�B
		    int kuku[][] = new int[x][y];

		    // ���̌��ʂ�z��ɕۑ��B
		    for( int i=0; i<x; i++ ) {

for( int j=0; j<y; j++ ){
		    	  kuku[i][j] = (i+1) * (j+1);
		      }
		    }

		    // ���̌��ʂ�\���B
		    for( int i=0; i<x; i++ ) {
		      for( int j=0; j<y; j++ ) { 
		    	  System.out.print(kuku[i][j] + " "); 
		      }
		      	  System.out.println(""); 
		    }	    
	  }
}
