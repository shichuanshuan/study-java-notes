按位与 &：两位全为1，结果为1，否则为0
按位或 |：两位一个为1，结果为1，否则为0；
按位异或 ^: 两位一个为0，一个为1，结果为1，否则为0
按位取反 ~: 0->1, 1->0
比如：2&3=? ~-2=? ~2=? 2|3=? 2^3=?

1. 算术右移 >> : 低位溢出，符号位不变，并用符号位补溢出的高位
2. 算术左移 << : 符号位不变，低位补 0
3. >>> 逻辑右移也叫无符号右移，运算规则是：低位溢出，高位补 0