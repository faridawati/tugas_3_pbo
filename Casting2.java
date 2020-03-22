public class Casting2 { 
 
	public static void main(String[] args) {     
		int a=8, b=9;   
		float d=2.f, e=3.2f;   
		char g='5';   
		double k=3.14;
		/* merupakan tipe data setiap variable yang ada */   
		String n="67", m="45", l="100";
		// menampilkan bil n, m, dan l   
		a = Integer.parseInt(n);    
		k = Double.parseDouble(m);  
		d = Float.parseFloat(l);
		//mengalokasikan nilai n, m, dan l ke dalam bil a, k, dan d    

		System.out.println("a : "+a+"\nk : "+k+"\nd : "+d);      
		n = String.valueOf(b);  
		m = String.valueOf(g);   
		l = String.valueOf(e);
		//mengalokasikan nilai b, g, dan e ke dalam bil n, m, dan l    
		System.out.println("n : "+n+"\nm : "+m+"\nl : "+l);      
		k = Double.valueOf(a).intValue(); 
		double c = Integer.valueOf(b).doubleValue(); 
		// mengalokasi nilai pada bil b dari nilai n     
		System.out.println("k : "+k+"\nc : "+c+"\nl : "+l);      
	} 
 
} 