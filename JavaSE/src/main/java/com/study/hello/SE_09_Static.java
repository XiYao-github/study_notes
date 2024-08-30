package com.study.hello;

/**
 * static
 * - static是静态的意思，可以修饰成员变量,成员方法。
 * - static修饰成员变量之后称为静态成员变量(类变量)，修饰方法之后称为静态方法(类方法)。
 * - static修饰后的成员变量，可以被类的所有对象共享(访问,修改)。
 * - 类方法中可以直接访问类的成员，不可以直接访问实例成员，方法内部不可以出现this和super关键字。
 * - 实例方法中可以直接访问类成员，也可以直接访问实例成员，方法内部可以出现this和super关键字。
 * <p>
 * 工具类
 * - 工具类中的方法都是类方法，每个方法完成一个功能，一次编写，处处可用，提高代码的重用性。
 * - 工具类的类方法可以直接用类名访问，调用方便，提高了开发效率。
 * - 工具类没有创建对象的需求，建议将工具类的构造器进行私有。
 */
public class SE_09_Static {
    public static void main(String[] args) {
        // 调用类方法
        Static.myName(Static.name);
        // 调用成员方法
        Static aStatic = new Static();
        aStatic.myPhone(aStatic.phone);
    }
}

class Static {
    /**
     * 静态成员变量
     * - 有static修饰，属于类,加载一次，内存中只有一份
     * 访问格式：
     * - 类名.静态成员变量
     * - 对象.静态成员变量(不推荐)
     */
    public static String name;

    /**
     * 静态成员方法
     * - 有static修饰，属于类,加载一次，内存中只有一份
     * 访问格式：
     * - 类名.静态成员方法
     * - 对象.静态成员方法(不推荐)
     */
    public static void myName(String name) {
        System.out.println("用户名：" + name);
    }

    /**
     * 实例成员变量
     * - 无static修饰，属于对象
     * 访问格式：
     * - 对象.实例成员变量
     */
    public String phone;

    /**
     * 实例成员方法
     * - 无static修饰，属于对象
     * 访问格式：
     * - 对象.实例成员方法
     */
    public void myPhone(String phone) {
        System.out.println("手机号：" + this.phone);
    }

    /**
     * 代码块
     * - 相当于另外一种形式的构造器(构造器的补充机制)，可以做初始化的操作
     */
    static {
        /**
         * 静态代码块
         * - 特点：需要通过static关键字修饰，随着类的加载而加载，并且自动触发,只执行一次
         * - 使用场景：在类加载的时候做一些静态数据初始化的操作，以便后续使用。
         */
        name = "张三";
    }

    {
        /**
         * 构造代码块
         * - 特点：每次创建对象，调用构造器执行时，都会执行该代码块中的代码，并且在构造器执行前执行
         * - 使用场景：初始化实例资源。
         */
        phone = "17720202177";
    }
}
