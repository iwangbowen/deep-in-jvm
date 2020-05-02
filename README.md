# deep-in-jvm

简单的借助jdk中的内置工具帮助我们对比Java源码和生成的字节码以及探究Class文件字节码结构

---

## 使用方法

1. 编写Java源码，如项目目录中的Main.java:

2. 运行javac编译成字节码

    ```sh
    javac -g:vars Main.java
    ```

    编译生成LocalVariableTable(局部变量表)

3. 运行javap分析Class文件字节码

    ```sh
    javap -verbose Main > Main.bytecode
    ```

4. 分析包含内部类的源码编译出的Class文件

    ```sh
    javap -verbose 'Main$Box.class' > 'Main$Box.bytecode'
    ```
