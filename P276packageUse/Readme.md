# 包的命名
一般是小写字母+小圆点

com.公司名.项目名.业务模块名

例如：

com.hspedu.oa.model;
com.sina.crm.user // 用户模块

# 包的使用细节
## 如何进入包
import java.util.Scanner 就只是引入一个类 Scanner (推荐此方法)

import java.util.*  表示将 java.util 包所有都引入

## 注意事项和使用细节
1. package 的作用是声明当前类所在的包，需要放在类的最上面，一个类中最多只有一句 package
2. import 指令位置放在 package 的下面，在类定义前面，可以有多句且没有顺序要求