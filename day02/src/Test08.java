
/**
 * 各种数据类型变量
 * @author EDY
 *
 */
public class Test08 {
	/**
	 * 1 整数类型：byte short int long
	 * 2 浮点类型：float double
	 * 3 字符型 ：char
	 * 4 布尔类型：boolean
	 * ====
	 * String
	 * @param args
	 */

	public static void main(String[] args) {

		//byte
		//1 定义数据类型为byte的变量
		byte byt  = 126; //-128-127
		System.out.println(byt);
		
		//2 int 
		int i = 1111111;
		
		//3 long 
		long j = 111111111111111111L; //l f d
		System.out.println("=============================");
		
		//4 一次定义多个
		int a=1,b=1,c=1;
//		a =1;
//		b =1;
//		c=2;
		int d = a+b+c;
		System.out.println(d);
		
		//boolean
		boolean sex = true; 
		System.out.println(sex);
		sex = false;
		System.out.println(sex);
		
		System.out.println("=============================");
		
		float pi = 3.1415927f; //小数数据如果什么都不加是double
		double pi1 = 3.1415927;
		double pi2 = 3.1415927d;//写了d更加明确是double
		
		System.out.println("=============================");
		
		
		char tab = '\t';
		System.out.print(tab);
		char char1 = 'a';
		System.out.println(char1);
		System.out.println("=============================");
		//字符串
		String name = "姚桑";
		System.out.println(name);
		String eat = "吃饭了没？";
		
		//两个字符串中间用+，表示字符串拼接
		System.out.println(name+eat+"吃过锤子！"+1+true);
		
	}

}
