// TODO: package包结构，传参
public class HelloWorld {
    /* 定义一个类文件，然后在屏幕上显示 "Hello, World!"
     * 源代码的文件名必须与公共类的名字相同，并用 .java 作为扩展名。成功编译之后会生成一个HelloWorld.class文件
     */
    // public 即一种 Java 访问修饰符，用来定义类、方法或者变量
    // class 是一种关键字，表示类；HelloWorld 即类名
    public static void main(String[] args) {
        // static 是一种非访问修饰符，用来创建类方法和类变量
        //  类方法：独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据
        //  类变量：独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。局部变量不能被声明为 static 变量
        // void 意味着此方法不返回任何值；main 是方法的名称，源代码中必须包含，因为运行时就从这里开始
        // String 是一个 java.lang.String 类的类名，表示字符串类型；String[] 表示字符串数组类型；String[] args 整体表示运行程序的参数
        //  注意java.lang包是自动加载的，所以不需要在程序之前加入import java.lang.*
        System.out.println("Hello, World!");
        // System 是一个预先定义的类，Java为我们提供，它拥有一些有用的方法和变量
        // out 是系统类 System 中的静态变量，可以提供打印输出
        // println 是出一种方法，可用于打印一行
    }
}

/* See also:
 *  Java核心技术·卷1：基础知识（原书第9版）-->3.1
 *  [Java/HelloWorld - 维基教科书，自由的教学读本]（https://zh.wikibooks.org/wiki/Java/HelloWorld）
 *  [Hello, World! - Learn Java](http://www.learnjavaonline.org/cn/Hello%2C_World%21)
 *  [Java 基础语法 | 菜鸟教程 #Java关键字](http://www.runoob.com/java/java-basic-syntax.html)
 *  [Java 修饰符 | 菜鸟教程](http://www.runoob.com/java/java-modifier-types.html)
 *  [Java关键字分类解析 - Ider](http://blog.iderzheng.com/category-of-java-keywords/)
 *  [Java 中 String[] args 和 String args[] 有什么区别？ - 知乎](https://www.zhihu.com/question/20665174)
 *  [Java 数组 | 菜鸟教程](http://www.runoob.com/java/java-array.html)
 */