public class Oper4 { 
	public static void main(String[] args) {  
  		int i = 0; 
		int j = 0; 
 
  		char c = 8; char d = 10;   
		int e = (((int)c > (int)d) ? c: d);
		//akan menampilkan nilai e dari proses pernyataan nilai c yang lebih besar dari nilai d, dan yang salah yang terambil    
		int k = ((i>j) ? i: j);  
 		//akan menampilkan nilai k dari proses pernyataan nilai i yang lebih besar dari nilai j, dan yang salah yang terambil 
  		System.out.print  ("Nilai e = "+ e);    
		System.out.print  ("\nNilai k = "+ k);   
		i = 2;   
		j = 3; 
 
  		k = ((i++>j++) ? i: j) ; 
 		//akan menampilkan nilai k dari proses pernyataan nilai i yang lebih besar dari nilai j, dan yang salah yang terambil kemudian bertambah 1
 		System.out.print  ("\nNilai k = "+ k);   
	} 

} 