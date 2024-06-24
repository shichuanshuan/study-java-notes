## 枚举的二种实现方式
### 自定义枚举类
1. 不需要提供 SetXxx 方法，因为枚举对象值通常为制度
2. 对枚举对象/属性使用 final + static 共同修饰，实现底层优化
3. 枚举对象名通常使用全部大写

### 使用 enum 关键字实现枚举


## 反编译
javap Season.class

## 基本的 Annotation 介绍
1. @override:限定某个方法，是重写父类方法，该注释只能用于方法
2. @Deprecated:用于表示某个程序元素（类，方法等）已过时
3. @SuppressWarnings:抑制编译器警告