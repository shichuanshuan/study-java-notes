[开发细节]
1. Java 源文件以 .java 为扩展名。源文件的基本组成部分是类（class），如本类中的 Hello 类
2. Java 应用程序的执行入口是 main() 方法。它有固定书写格式：
public static void main(String[] args) {...}

3. Java 语言严格区分大小写
4. Java 方法由一条条语句构成，每个语句以";" 结束.
5. 大括号都是成对出现的，缺一不可
6. 一个源文件中最多只能有一个 public 类。 其他类不限。
```java
public class Hello {

	// 编写一个 main 方法
	public static void main(String[] args) {
		System.out.println("hello world");
	}
}

// 编译后，每一个类，都对于一个 .class
class Dog() {

}

class tiger() {

}
```

7. 如果源文件包含一个 public 类，则文件名必须按该类名命名！
8. 一个源文件中最多只能有一个 public 类。其他类的个数不限，也可以将 main 方法写在非 public 类中，然后指定运行非 public 类，这样入口方法就是非 public 的 main 方法。
```java
public class Hello {

	// 编写一个 main 方法
	public static void main(String[] args) {
		System.out.println("hello world");
	}
}

// 编译后，每一个类，都对于一个 .class
class Dog() {
	public static void main(String[] args){
		System.out.println("hello 小狗狗");	
	}
}

class tiger() {
	public static void main(String[] args) {
		System.out.println("hello 小老虎");
	}
}
```