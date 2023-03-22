
/**
 * 变量就是可以变化的量。 比如：微信里边钱，随着我们使用时一个可以变化数据。
 *    变量：就是一个盒子（容器），用来装数据的。同一时间只能装一个数据。  它是有类型，如果是水杯以后只能往里面装水。
 * ==========定义  赋值 使用 重新设置====================
 * 1 定义变量：数据类型  变量名（标识符，遵循小驼峰userName）;
 * 2 变量赋值： 变量名 = 字面量常量;
 * 3 使用：直接通过变量名使用
 * 
 * @author EDY
 *
 */
public class Test07 {

	/*public static void main(String[] args) {
		//1 定义变量：数据类型  变量名（标识符，遵循小驼峰userName）;
		int age;
		//2 变量赋值： 变量名 = 字面量常量;
		age = 18;
		//3 使用
		System.out.println(age);
		//4 改变里边值
		age = 28;
		System.out.println(age);
		age=age+1;//长了一岁重新赋值
		System.out.println(age);
	}*/
	
	public static void main(String[] args) {
		//1 定义变量并赋值：数据类型  变量名（标识符，遵循小驼峰userName）= 值;
		int age = 18;
		//3 使用
		System.out.println(age);
		//4 改变里边值
		age = 28;
		System.out.println(age);
		age=age+1;//长了一岁重新赋值
		System.out.println(age);
	}
}
