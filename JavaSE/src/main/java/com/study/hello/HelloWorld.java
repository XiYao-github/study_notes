package com.study.hello;

/**
 * SE_01_Variable(变量)
 * SE_02_Operation(运算符)
 * SE_03_Process(流程控制)
 * SE_04_Array(数组)
 * SE_05_Method(方法)
 * SE_06_Object(类与对象)
 * SE_07_Encapsulation(封装)
 * SE_08_Inheritance(继承)
 * SE_09_Static(静态)
 * SE_10_Final(最终)
 * SE_11_Abstraction(抽象)
 * SE_12_Interface(接口)
 * SE_13_Polymorphism(多态)
 * SE_14_Inner(内部类)
 * SE_15_lambda
 * SE_16_Enum(枚举)
 * SE_17_Exception(异常)
 * SE_18_String(字符串)
 * SE_19_Date(时间)
 * SE_20_Generics(泛型)
 * SE_21_Collection
 * SE_22_Map
 * SE_23_Stream(流)
 * SE_24_optional
 * SE_25_File(文件)
 * SE_26_IO(io流)
 * SE_27_Thread(多线程)
 * SE_28_Socket(网络通信)
 * SE_29_Reflect(反射)
 * SE_30_Annotation(注解)
 */
public class HelloWorld {
    /**
     * JDK基本介绍
     * JDK(Java Development Kit Java开发工具包)
     * JDK = JRE + java开发工具集(Javac，java，javadoc，javap等)
     * JDK是提供给Java开发人员使用的，其中包含了java的开发工具，也包括了JRE，所以安装了JDK，就不用在单独安装JRE了。
     *
     * JRE基本介绍
     * JRE(Java Runtime Environment Java运行环境)
     * JRE = JVM + JavaSE标准类库(java核心类库)
     * JRE包括Java虚拟机(JVM Java Virtual Machine)和Java程序所需的核心类库等，如果想要运行一个开发好的Java程序，计算机中只需要安装JRE即可。
     *
     * JVM基本介绍
     * Java核心机制：Java虚拟机JVM(Java Virtual Machine)
     * JVM是一个虚拟的计算机，具有指令集并使用不同的存储区域，负责执行指令，管理数据、内存、寄存器。
     * Java虚拟机机制屏蔽了底层运行平台的差别，不同的平台有不同的虚拟机，实现了“一次编译，到处运行”。
     *
     * 配置环境变量(JAVA_HOME，Path)
     * JAVA_HOME => C:\Software\Programs\JDK\jdk1.8.0
     * Path => %JAVA_HOME%\bin
     *
     * 开发Java程序
     * 需要三个步骤：编写代码，编译代码，运行代码
     *
     * 编写代码
     * 将Java代码编写到扩展名为HelloWorld.java的文件中
     *
     * 编译代码
     * 打开命令行窗口(Win+R->cmd回车)，通过javac命令编译java文件，编译后会产生一个class文件
     * javac Hello.java => 生成：HelloWorld.class
     *
     * 运行代码
     * 打开命令行窗口(Win+R->cmd回车)，通过java命令执行class文件，本质就是把class文件加载到JVM运行
     * java Hello => 输出：hello world
     */
    /**
     * 文档注释示例
     * - 它通常包含有关类、方法或字段的详细信息
     * - 文档注释的内容是可以提取到一个程序说明文档中去的
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        多行注释示例
         */
        // 单行注释示例
        // 它将输出 Hello World
        System.out.println("Hello World");
    }
}