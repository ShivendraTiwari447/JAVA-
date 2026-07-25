class Xyz{
	int x;
	int y;
	void func(){
	System.out.println("A");
	}
}

class Tut02{
	static void func(){
		System.out.println("A in Tut02 class");
	}
	public static void main (String [] args){
	
		Xyz x1= new Xyz();
		x1.x=5;
		func();
		System.out.println(x1.y);
		System.out.println(x1.x);
		x1.func();
	}
}