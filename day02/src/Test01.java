
/**
 *  注释是什么：就是标注解释代码的意义，使用它以后代码可读性增强
 *  注释的类型：
 *     1 单行注释:作用于一行  //  快捷键：ctrl+/ 来回切换就能注释与不注释之间切换
 *     2 多行注释 :作用于多行  见下面  快捷键:注释 ctrl+shift+/  取消注释 ctrl+shift+\
 *     3 文档注释:是写在类上面 /**+回车  快捷键：alt+shift+j
 *        project-->ge....生成java的文档注释
 * @author yaosang
 *
 */
public class Test01 {
	
	/**
	 * 这是程序的入口
	 * @param args
	 */
	public static void main(String[] args) {
		//1 单行注释:下面这句话是往控制台输出"姚桑你好！"
		System.out.println("姚桑你好！");//下面这句话是往控制台输出"姚桑你好！"
		//2 多行注释:注释太多一行放不下，或者一坨代码不想要，但是不能删除万一以后还要。
		/*jfjjfjfj
		jfjjfjf
		jfjjfjfj*/
		System.out.println("J");
		
	}
}
