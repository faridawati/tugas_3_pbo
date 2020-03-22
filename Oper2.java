public class Oper2 { 

	public static void main(String[] args) {    
		char i, j; 
		i = 3;     
		j = 4;            
	
		System.out.println("i = "+ (int) i);
		// menampilkan nilai dari bilangan i yang tipe datanya integer    
		System.out.println("j = "+ j);
		// menampilkan nilai dari bilangan j   
		System.out.println("i & j = "+ (i & j));
		//menampilkan nilai dari logika and(&) diantara salah satu nilai yang di ambil   
		System.out.println("i | j = "+ (i | j));
		//menampilkan nilai dari logika or(|) diantara salah satu nilai yang di ambil  
		System.out.println("i ^ j = "+ (i ^ j)); 
		System.out.println(Math.pow(i, j));
		/* menampilkan nilai dari method pow(a,b) untuk pemangkatan*/      
		System.out.println("  ~i  = "+ ~i);
		//menampilkan negasi nilai i 
	}   
 
} 