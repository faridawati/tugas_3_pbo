public class Oprator{ 
	public static void main(String[] args) {   
   		boolean Bool1, Bool2, TF; 
		int i,j, hsl ;    
		float x,y,res;   
		System.out.println("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output"); 
 
    		Bool1 = true; Bool2 = false;     
		TF = Bool1 && Bool2 ;     
		TF = Bool1 || Bool2 ;      
		TF = ! Bool1 ;      
		TF = Bool1  ^Bool2;        
		i = 5; j = 2 ;       
		hsl = i+j; hsl = i - j; 
		hsl = i / j; 
		hsl = i * j;     
		hsl = i /j ; 
		hsl = i%j ; 
		x = 5 ; 
		y = 5 ;       
		res = x + y; 
		res = x - y; 
		res = x / y; 
		res = x * y;    
		TF = (i==j); 
		TF = (i!=j);     
		TF = (i < j); 
		TF = (i > j); 
		TF = (i <= j); 
		TF = (i >= j);    
		TF = (x != y);       
		TF = (x < y); 
		TF = (x > y); 
		TF = (x <= y); 
		TF = (x >= y);
		System.out.println("Nilai hsl = " +hsl);
		System.out.println("Nilai res = " +res);
		System.out.println("Nilai TF = " +TF);
	}
 
} 
  