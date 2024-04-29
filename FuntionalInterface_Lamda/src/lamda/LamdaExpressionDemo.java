package lamda;


interface Calculator{
	int max(int a, int b);
}

interface Stringlength{
	int length(String s);
}

interface StringBlank{
	String CheckString(String s);
}


public class LamdaExpressionDemo {

	public static void main(String[] args) {
		
		Calculator calc = (a,b)-> a>b?a:b;
		int result = calc.max(5,4);
		System.out.println(result);
		
		Stringlength str = s -> s.length();
		System.out.println(str.length("Nayana"));
		
		 StringBlank stringBlank = s -> s.isEmpty()?"Yes":"No";
		 System.out.println(stringBlank.CheckString("Naaa"));
	}

}
