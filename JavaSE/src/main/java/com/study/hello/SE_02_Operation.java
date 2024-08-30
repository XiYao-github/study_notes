package com.study.hello;

public class SE_02_Operation {

    static double d;
    static int i;
    static int j;
    static int k;
    static int age;
    static String str;
    static Object obj;
    static boolean bool;

    public static void main(String[] args) {
        position();
    }

    /**
     * 算数运算符
     * - 加(+)：参考小学一年级
     * - 减(-)：参考小学一年级
     * - 乘(*)：参考小学一年级，与“×”相同
     * - 除(/)：参考小学一年级，与“÷”相同，注意：Java中两个整数相除结果还是整数
     * - 取余(%)：获取的是两个数据做除法的余数，等价：a % b = a - a / b * b
     * - 自增(++)：变量自身的值加1
     * - 自减(--)：变量自身的值减1
     */
    public static void arithmetic() {
        // 除法(/)：Java中两个整数相除结果还是整数
        // 从数学来看是2.5, 代码中是2
        i = 10 / 4; //2
        System.out.println("10 / 4 = " + i);
        // 但是浮点数参与除法运算结果就不影响
        d = 10.0 / 4; //2.5
        System.out.println("10.0 / 4 = " + d);
        // 还是两个整数相除,但是结果给了浮点数
        d = 10 / 4; //2.0
        // 原因是计算时还是整数，计算完成才赋值给浮点数
        System.out.println("10 / 4 = " + d);

        // 取余(%)
        // (%)的本质看一个公式 => a % b = a - a / b * b
        // (-10) % 3 = (-10) - (-10) / 3 * 3 = (-10) + 9 = -1
        // 10 % (-3) = 10 - 10 / (-3) * (-3) = 10 - 9 = 1
        // (-10) % (-3) = (-10) - (-10) / (-3) * (-3) = (-10) + 9 = -1
        i = 10 % 3;
        System.out.println("10 % 3 = " + i); //1
        i = -10 % 3;
        System.out.println("-10 % 3 = " + i); //-1
        i = 10 % -3;
        System.out.println("10 % -3 = " + i); //1
        i = -10 % -3;
        System.out.println("-10 % -3 = " + i); //-1

        //自增(++)单独使用,自减(--)同理
        i = 10;
        j = 10;
        i++; //自增 等价于 i = i + 1; => i = 11
        ++j; //自增 等价于 j = j + j; => j = 11
        System.out.printf("i = 10; => i++ =%d;\n", i); //11
        System.out.printf("j = 10; => ++j =%d;\n", i); //11

        //自增(++)表达式内使用,自减(--)同理
        i = 10;
        j = 10;
        // 前++：先自增后赋值, 等价于
        // i = i + 1;
        // k = i;
        k = ++i;
        System.out.printf("i = 10; k = ++i; => i = %d; k = %d;\n", i, k);
        // 后++：先赋值后自增, 等价于
        // k = j;
        // j = j + 1;
        k = j++;
        System.out.printf("j = 10; k = ++j; => j = %d; k = %d;\n", j, k);
    }

    /**
     * 关系运算符
     * - 关系运算符的结果都是boolean型，也就是要么是true，要么是false。
     * - 关系表达式经常用在分支结构的条件中或循环结构的条件中。
     * - 关系运算符组成的表达式，我们称为关系表达式。
     * - 等于(==)：a==b，判断a和b的值是否相等，成立为true，不成立为false
     * - 不等于(!=)：a!=b，判断a和b的值是否不相等，成立为true，不成立为false
     * - 大于(>)：a>b，判断a是否大于b，成立为true，不成立为false
     * - 大于等于(>=)：a>=b，判断a是否大于等于b，成立为true，不成立为false
     * - 小于(<)：a<b，判断a是否小于b，成立为true，不成立为false
     * - 小于等于(<=)：a<=b，判断a是否小于等于b，成立为true，不成立为false
     * - 比较对象(instanceof)：左侧变量所指对象，是右侧类或接口(class/interface)的一个对象，成立为true，不成立为false
     */
    public static void relational() {
        //判断是否满足条件的，返回true和false
        bool = age >= 18;
        System.out.println(bool);

        //以下代码是另一种写法形式
        bool = age >= 18;
        System.out.println(bool);

        //如果运算符左侧变量所指的对象，是操作符右侧类或接口(class/interface)的一个对象，那么结果为真。
        str = "instanceof";
        bool = str instanceof String;
        //由于str是String类型，所以返回真
        System.out.println(bool);
    }

    /**
     * 逻辑运算符
     * - 短路与(&&)：只要有一个为false，结果是false。前一个为false，后面的条件不再判断
     * - 短路或(||)：只要有一个为true，结果是true。前一个为true，后面的条件不再判断
     * - 逻辑非(!)：你真我假、你假我真。!true=false、!false=true
     * - 逻辑与(&)：只要有一个为false，结果是false，两个都为true，结果才是true
     * - 逻辑或(|)：只要有一个为true，结果是true，两个都为false，结果才是false
     * - 逻辑异或(^)：当两个相同时，结果为true，否则为false
     */
    public static void logic() {
        i = 10;
        j = 10;
        System.out.printf("初始值：i = %d; j = %d;\n", i, j);
        bool = false && i++ == i; //i = 10
        System.out.println("短路与(&&)：对于&&短路与而言，如果第一个条件为false ,后面的条件不再判断");
        System.out.printf("判断：(false && i++ == i) => 结果：%s  => i = %d;\n", bool, i);
        bool = false & j++ == j; //j = 11
        System.out.println("逻辑与(&)：对于&逻辑与而言，如果第一个条件为false ,后面的条件仍然会判断");
        System.out.printf("判断：(false & j++ == j) => 结果：%s  => j = %d;\n", bool, j);
        System.out.println();

        i = 10;
        j = 10;
        System.out.printf("初始值：i = %d; j = %d;\n", i, j);
        bool = true || i++ == i; //j = 10
        System.out.println("短路或(||)：对于||短路或而言，如果第一个条件为true ,后面的条件不再判断");
        System.out.printf("判断：(true || i++ == i) => 结果：%s  => i = %d;\n", bool, i);
        bool = true | j++ == j; //j = 11
        System.out.println("逻辑或(|)：对于|逻辑或而言，如果第一个条件为true ,后面的条件仍然会判断");
        System.out.printf("判断：(true | j++ == j) => 结果：%s  => j = %d;\n", bool, j);
        System.out.println();

        System.out.println("逻辑非(!)：操作是取反(T->F),(F->T)");
        bool = !true; // false
        System.out.printf("判断：(!true) => 结果：%s\n", bool);
        System.out.println();

        System.out.println("逻辑异或(^)：当两个相同时，结果为true，否则为false");
        bool = true ^ true; // false
        System.out.printf("判断：(true ^ true) => 结果：%s\n", bool);
        bool = false ^ false; // false
        System.out.printf("判断：(false ^ false) => 结果：%s\n", bool);
        bool = true ^ false; // true
        System.out.printf("判断：(true ^ false) => 结果：%s\n", bool);
    }

    /**
     * 赋值运算符
     * - 赋值运算符的左边只能是变量，右边可以是变量、表达式、常量值。
     * - 复合赋值运算符自带强制类型转换。
     * - 加后赋值(+=)：a+=b等价于a=(a的数据类型)(a+b)，将a+b的值给a
     * - 减后赋值(-=)：a-=b等价于a=(a的数据类型)(a-b)，将a-b的值给a
     * - 乘后赋值(*=)：a*=b等价于a=(a的数据类型)(a*b)，将a*b的值给a
     * - 除后赋值(/=)：a/=b等价于a=(a的数据类型)(a/b)，将a/b的商给a
     * - 取余后赋值(%=)：a%=b等价于a=(a的数据类型)(a%b)，将a%b的商给a
     */
    public static void assignment() {
        i = 5;
        i += 5; // 等价 i = i + 5; // 10
        System.out.printf("初始值：i = %d;\n", i);
        System.out.printf("i += 5 = %d => i = i + 5\n", i);
        System.out.println();

        j = 5;
        d = 5.0;
        j += d; // 等价 b = (byte)(b + 2); // 10
        System.out.println("复合赋值运算符自带强制类型转换");
        System.out.printf("初始值：j = %d; d = %.1f;\n", j, d);
        System.out.printf("j += d = %d => j = (int)(j + d)\n", j);
        System.out.println();

        d = 5.0;
        d++; //等价 b = (byte)(b+1); // 6
        System.out.println("自增自减自带赋值符号所以也有强制类型转换");
        System.out.printf("初始值：d = %.1f;\n", d);
        System.out.printf("d++ = %.1f => d = (double)(b + 1)\n", d);
    }

    /**
     * 条件运算符
     * - 三元运算符是一个整体
     * - 格式：条件表达式?表达式1:表达式2;
     * - 如果条件表达式为true，运算后的结果是表达式1；
     * - 如果条件表达式为false，运算后的结果是表达式2；
     */
    public static void condition() {
        k = 10;
        d = 5.0;
        bool = k > d;
        obj = bool ? k : d;
        System.out.printf("初始值：k = %d; d = %f;\n", k, d);
        System.out.println("obj = k > d ? k : d ");
        System.out.println("k > d = " + bool);
        System.out.println("因为三元运算符是一个整体，相当于一个表达式运算，所以最后提高了结果的精度");
        bool = obj instanceof Double;
        System.out.println("obj instanceof Double => " + bool);
        System.out.println("obj = " + obj);
    }

    /**
     * 运算符优先级
     */
    public static void priority() {
        /*
           1    ( )　[ ] 　.	                                                    从左到右
           2    ! 　~　 ++　 –	                                                从右到左
           3    *　 /　 %	                                                    从左到右
           4    +　 -	                                                        从左到右
           5    << 　>>　 >>>	                                                从左到右
           6    < 　<=　 > 　>=　 instanceof	                                    从左到右
           7    == 　!=	                                                        从左到右
           8    &	                                                            从左到右
           9    ^	                                                            从左到右
           10   |	                                                            从左到右
           11   &&	                                                            从左到右
           12   ||	                                                            从左到右
           13   ? :	                                                            从左到右
           14   = 　+= 　-= 　*=　 /=　 %=　 &=　 |=　 ^=　 ~= 　<<= 　>>=　 >>>=	从右到左
           15   ，	                                                            从右到左
         */
    }

    /**
     * 机器码
     * - 二进制的最高位是符号位：0表示整数，1表示负数
     * - 正数原码、反码、补码都一样(三码合一)，0的原码、反码、补码都是0
     * - 负数反码=负数原码符号位不变，其它位取反，负数原码=负数反码符号位不变，其它位取反
     * - 负数补码=负数反码+1，负数的反码=负数补码-1
     * - 计算机运算的时候，都是使用补码来运算，但是运算结果都是原码。
     * <p>
     * 位运算符
     * - 按位与(&)：两个相应的二进制位都为1，则该位为1，否则为0
     * - 按位或(|)：两个相应的二进制位存在1，则该位为1，否则为0
     * - 按位异或(^)：两个相应的二进制位相同为0，否则该位为1
     * - 取反(〜)：一元运算符，用来对一个二进制数连同符号位按位取反，即将0变1，将1变0
     * - 左移(<<)：左边最高位丢弃，右边补齐0；相当于乘以2的x次幂
     * - 右移(>>)：左边最高位是0，左边补齐0；左边最高为是1，左边补齐1；相当于除以2的x次幂
     * - 无符号右移(>>>)：无论最高位是0还是1，左边补齐0；相当于除以2的x次幂
     */
    public static void position() {
        //2的原码      00000000 00000000 00000000 00000010
        //2的反码      00000000 00000000 00000000 00000010
        //2的补码      00000000 00000000 00000000 00000010
        //3的原码      00000000 00000000 00000000 00000011
        //3的反码      00000000 00000000 00000000 00000011
        //3的补码      00000000 00000000 00000000 00000011
        //2 & 3       补码运算：两个相应的二进制位都为1，则该位为1，否则为0
        //2的补码      00000000 00000000 00000000 00000010
        //            &
        //3的补码      00000000 00000000 00000000 00000011
        //            结果：正数的原码、反码、补码都一样
        //结果补码     00000000 00000000 00000000 00000010
        //结果反码     00000000 00000000 00000000 00000010
        //结果原码     00000000 00000000 00000000 00000010  ->2
        System.out.println(2 & 3);//2
        //2的原码      00000000 00000000 00000000 00000010
        //2的反码      00000000 00000000 00000000 00000010
        //2的补码      00000000 00000000 00000000 00000010
        //-3的原码     10000000 00000000 00000000 00000011
        //-3的反码     11111111 11111111 11111111 11111100
        //-3的补码     11111111 11111111 11111111 11111101
        //2 & 3       补码运算：两个相应的二进制位都为1，则该位为1，否则为0
        //2的补码      00000000 00000000 00000000 00000010
        //            &
        //-3的补码     11111111 11111111 11111111 11111101
        //            结果：0的原码、反码、补码都是0
        //结果补码     00000000 00000000 00000000 00000000
        //结果反码     00000000 00000000 00000000 00000000
        //结果原码     00000000 00000000 00000000 00000000  ->0
        System.out.println(2 & -3);//0
        //-2的原码     10000000 00000000 00000000 00000010
        //-2的反码     11111111 11111111 11111111 11111101
        //-2的补码     11111111 11111111 11111111 11111110
        //3的原码      00000000 00000000 00000000 00000011
        //3的反码      00000000 00000000 00000000 00000011
        //3的补码      00000000 00000000 00000000 00000011
        //-2 & 3      补码运算：两个相应的二进制位都为1，则该位为1，否则为0
        //-2的补码     11111111 11111111 11111111 11111110
        //            &
        //3的补码      00000000 00000000 00000000 00000011
        //            结果：正数的原码、反码、补码都一样
        //结果补码     00000000 00000000 00000000 00000010
        //结果反码     00000000 00000000 00000000 00000010
        //结果原码     00000000 00000000 00000000 00000010  ->2
        System.out.println(-2 & 3);//2
        //-2的原码     10000000 00000000 00000000 00000010
        //-2的反码     11111111 11111111 11111111 11111101
        //-2的补码     11111111 11111111 11111111 11111110
        //-3的原码     10000000 00000000 00000000 00000011
        //-3的反码     11111111 11111111 11111111 11111100
        //-3的补码     11111111 11111111 11111111 11111101
        //-2 & -3     补码运算：两个相应的二进制位都为1，则该位为1，否则为0
        //-2的补码     11111111 11111111 11111111 11111110
        //            &
        //-3的补码     11111111 11111111 11111111 11111101
        //            结果：负数反码=负数补码-1,负数原码=负数反码符号位不变，其它位取反
        //结果补码     11111111 11111111 11111111 11111100
        //结果反码     11111111 11111111 11111111 11111011
        //结果原码     10000000 00000000 00000000 00000100  ->-4
        System.out.println(-2 & -3);//-4
        //2的原码      00000000 00000000 00000000 00000010
        //2的反码      00000000 00000000 00000000 00000010
        //2的补码      00000000 00000000 00000000 00000010
        //3的原码      00000000 00000000 00000000 00000011
        //3的反码      00000000 00000000 00000000 00000011
        //3的补码      00000000 00000000 00000000 00000011
        //2 | 3       补码运算：两个相应的二进制位存在1，则该位为1，否则为0
        //2的补码      00000000 00000000 00000000 00000010
        //            |
        //3的补码      00000000 00000000 00000000 00000011
        //            结果：正数的原码、反码、补码都一样
        //结果补码     00000000 00000000 00000000 00000011
        //结果反码     00000000 00000000 00000000 00000011
        //结果原码     00000000 00000000 00000000 00000011  ->3
        System.out.println(2 | 3);//3
        //2的原码      00000000 00000000 00000000 00000010
        //2的反码      00000000 00000000 00000000 00000010
        //2的补码      00000000 00000000 00000000 00000010
        //-3的原码     10000000 00000000 00000000 00000011
        //-3的反码     11111111 11111111 11111111 11111100
        //-3的补码     11111111 11111111 11111111 11111101
        //2 | 3       补码运算：两个相应的二进制位存在1，则该位为1，否则为0
        //2的补码      00000000 00000000 00000000 00000010
        //            |
        //-3的补码     11111111 11111111 11111111 11111101
        //            结果：负数反码=负数补码-1,负数原码=负数反码符号位不变，其它位取反
        //结果补码     11111111 11111111 11111111 11111111
        //结果反码     11111111 11111111 11111111 11111110
        //结果原码     10000000 00000000 00000000 00000001  ->-1
        System.out.println(2 | -3);//-1
        //-2的原码     10000000 00000000 00000000 00000010
        //-2的反码     11111111 11111111 11111111 11111101
        //-2的补码     11111111 11111111 11111111 11111110
        //3的原码      00000000 00000000 00000000 00000011
        //3的反码      00000000 00000000 00000000 00000011
        //3的补码      00000000 00000000 00000000 00000011
        //-2 | 3      补码运算：两个相应的二进制位存在1，则该位为1，否则为0
        //-2的补码     11111111 11111111 11111111 11111110
        //            |
        //3的补码      00000000 00000000 00000000 00000011
        //            结果：负数反码=负数补码-1,负数原码=负数反码符号位不变，其它位取反
        //结果补码     11111111 11111111 11111111 11111111
        //结果反码     11111111 11111111 11111111 11111110
        //结果原码     10000000 00000000 00000000 00000001  ->-1
        System.out.println(-2 | 3);//-1
        //-2的原码     10000000 00000000 00000000 00000010
        //-2的反码     11111111 11111111 11111111 11111101
        //-2的补码     11111111 11111111 11111111 11111110
        //-3的原码     10000000 00000000 00000000 00000011
        //-3的反码     11111111 11111111 11111111 11111100
        //-3的补码     11111111 11111111 11111111 11111101
        //-2 | -3     补码运算：两个相应的二进制位存在1，则该位为1，否则为0
        //-2的补码     11111111 11111111 11111111 11111110
        //            |
        //-3的补码     11111111 11111111 11111111 11111101
        //            结果：负数反码=负数补码-1,负数原码=负数反码符号位不变，其它位取反
        //结果补码     11111111 11111111 11111111 11111111
        //结果反码     11111111 11111111 11111111 11111110
        //结果原码     10000000 00000000 00000000 00000001  ->-1
        System.out.println(-2 | -3);//-1
        //2的原码      00000000 00000000 00000000 00000010
        //2的反码      00000000 00000000 00000000 00000010
        //2的补码      00000000 00000000 00000000 00000010
        //3的原码      00000000 00000000 00000000 00000011
        //3的反码      00000000 00000000 00000000 00000011
        //3的补码      00000000 00000000 00000000 00000011
        //2 ^ 3       补码运算：两个相应的二进制位相同为0，否则该位为1
        //2的补码      00000000 00000000 00000000 00000010
        //            ^
        //3的补码      00000000 00000000 00000000 00000011
        //            结果：正数的原码、反码、补码都一样
        //结果补码     00000000 00000000 00000000 00000001
        //结果反码     00000000 00000000 00000000 00000001
        //结果原码     00000000 00000000 00000000 00000001  ->1
        System.out.println(2 ^ 3);//1
        //2的原码      00000000 00000000 00000000 00000010
        //2的反码      00000000 00000000 00000000 00000010
        //2的补码      00000000 00000000 00000000 00000010
        //-3的原码     10000000 00000000 00000000 00000011
        //-3的反码     11111111 11111111 11111111 11111100
        //-3的补码     11111111 11111111 11111111 11111101
        //2 ^ 3       补码运算：两个相应的二进制位相同为0，否则该位为1
        //2的补码      00000000 00000000 00000000 00000010
        //            ^
        //-3的补码     11111111 11111111 11111111 11111101
        //            结果：负数反码=负数补码-1,负数原码=负数反码符号位不变，其它位取反
        //结果补码     11111111 11111111 11111111 11111111
        //结果反码     11111111 11111111 11111111 11111110
        //结果原码     10000000 00000000 00000000 00000001  ->-1
        System.out.println(2 ^ -3);//-1
        //-2的原码     10000000 00000000 00000000 00000010
        //-2的反码     11111111 11111111 11111111 11111101
        //-2的补码     11111111 11111111 11111111 11111110
        //3的原码      00000000 00000000 00000000 00000011
        //3的反码      00000000 00000000 00000000 00000011
        //3的补码      00000000 00000000 00000000 00000011
        //-2 ^ 3      补码运算：两个相应的二进制位相同为0，否则该位为1
        //-2的补码     11111111 11111111 11111111 11111110
        //            ^
        //3的补码      00000000 00000000 00000000 00000011
        //            结果：负数反码=负数补码-1,负数原码=负数反码符号位不变，其它位取反
        //结果补码     11111111 11111111 11111111 11111101
        //结果反码     11111111 11111111 11111111 11111100
        //结果原码     10000000 00000000 00000000 00000011  ->-1
        System.out.println(-2 ^ 3);//-3
        //-2的原码     10000000 00000000 00000000 00000010
        //-2的反码     11111111 11111111 11111111 11111101
        //-2的补码     11111111 11111111 11111111 11111110
        //-3的原码     10000000 00000000 00000000 00000011
        //-3的反码     11111111 11111111 11111111 11111100
        //-3的补码     11111111 11111111 11111111 11111101
        //-2 & -3     补码运算：两个相应的二进制位相同为0，否则该位为1
        //-2的补码     11111111 11111111 11111111 11111110
        //            &
        //-3的补码     11111111 11111111 11111111 11111101
        //            结果：正数的原码、反码、补码都一样
        //结果补码     00000000 00000000 00000000 00000011
        //结果反码     00000000 00000000 00000000 00000011
        //结果原码     00000000 00000000 00000000 00000011  ->3
        System.out.println(-2 ^ -3);//3
        //2的原码      00000000 00000000 00000000 00000010
        //2的反码      00000000 00000000 00000000 00000010
        //2的补码      00000000 00000000 00000000 00000010
        //~2          补码运算：连同符号位按位取反
        //2的补码      00000000 00000000 00000000 00000010
        //            结果：负数反码=负数补码-1,负数原码=负数反码符号位不变，其它位取反
        //结果补码     11111111 11111111 11111111 11111101
        //结果反码     11111111 11111111 11111111 11111100
        //结果原码     10000000 00000000 00000000 00000011  ->-3
        System.out.println(~2);//-3
        //-2的原码     10000000 00000000 00000000 00000010
        //-2的反码     11111111 11111111 11111111 11111101
        //-2的补码     11111111 11111111 11111111 11111110
        //~-2          补码运算：连同符号位按位取反
        //-2的补码     11111111 11111111 11111111 11111110
        //            结果：正数的原码、反码、补码都一样
        //结果补码     00000000 00000000 00000000 00000001
        //结果反码     00000000 00000000 00000000 00000001
        //结果原码     00000000 00000000 00000000 00000001  ->1
        System.out.println(~-2);//1
        //8的原码      00000000 00000000 00000000 00001000
        //8的反码      00000000 00000000 00000000 00001000
        //8的补码      00000000 00000000 00000000 00001000
        //8 << 2      补码运算：左边最高位丢弃，右边补齐0
        //8的补码      00000000 00000000 00000000 00001000
        //            结果：正数的原码、反码、补码都一样
        //结果补码     00000000 00000000 00000000 00100000
        //结果反码     00000000 00000000 00000000 00100000
        //结果原码     00000000 00000000 00000000 00100000  ->32
        System.out.println(8 << 2);//32
        //-8的原码     10000000 00000000 00000000 00001000
        //-8的反码     11111111 11111111 11111111 11110111
        //-8的补码     11111111 11111111 11111111 11111000
        //-8 << 2     补码运算：连同符号位按位取反
        //-8的补码     11111111 11111111 11111111 11111000
        //            结果：负数反码=负数补码-1,负数原码=负数反码符号位不变，其它位取反
        //结果补码     11111111 11111111 11111111 11100000
        //结果反码     11111111 11111111 11111111 11011111
        //结果原码     10000000 00000000 00000000 00100000  ->-32
        System.out.println(-8 << 2);//-32
        //8的原码      00000000 00000000 00000000 00001000
        //8的反码      00000000 00000000 00000000 00001000
        //8的补码      00000000 00000000 00000000 00001000
        //8 >> 2      补码运算：左边最高位是0，左边补齐0；左边最高为是1，左边补齐1；
        //8的补码      00000000 00000000 00000000 00001000
        //            结果：正数的原码、反码、补码都一样
        //结果补码     00000000 00000000 00000000 00000010
        //结果反码     00000000 00000000 00000000 00000010
        //结果原码     00000000 00000000 00000000 00000010  ->2
        System.out.println(8 >> 2);//2
        //-8的原码     10000000 00000000 00000000 00001000
        //-8的反码     11111111 11111111 11111111 11110111
        //-8的补码     11111111 11111111 11111111 11111000
        //-8 >> 2     补码运算：左边最高位是0，左边补齐0；左边最高为是1，左边补齐1；
        //-8的补码     11111111 11111111 11111111 11111000
        //            结果：负数反码=负数补码-1,负数原码=负数反码符号位不变，其它位取反
        //结果补码     11111111 11111111 11111111 11111110
        //结果反码     11111111 11111111 11111111 11111101
        //结果原码     10000000 00000000 00000000 00100010  ->-2
        System.out.println(-8 >> 2);//-2
        //8的原码      00000000 00000000 00000000 00001000
        //8的反码      00000000 00000000 00000000 00001000
        //8的补码      00000000 00000000 00000000 00001000
        //8 >>> 2     补码运算：无论最高位是0还是1，左边补齐0；
        //8的补码      00000000 00000000 00000000 00001000
        //            结果：正数的原码、反码、补码都一样
        //结果补码     00000000 00000000 00000000 00000010
        //结果反码     00000000 00000000 00000000 00000010
        //结果原码     00000000 00000000 00000000 00000010  ->2
        System.out.println(8 >>> 2);//2
        //-8的原码     10000000 00000000 00000000 00001000
        //-8的反码     11111111 11111111 11111111 11110111
        //-8的补码     11111111 11111111 11111111 11111000
        //-8 >>> 2    补码运算：无论最高位是0还是1，左边补齐0；
        //-8的补码     11111111 11111111 11111111 11111000
        //            结果：正数的原码、反码、补码都一样
        //结果补码     00111111 11111111 11111111 11111110
        //结果反码     00111111 11111111 11111111 11111110
        //结果原码     00111111 11111111 11111111 11111110  ->1073741822
        System.out.println(-8 >>> 2);//1073741822
    }


}
