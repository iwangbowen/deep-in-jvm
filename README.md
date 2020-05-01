# deep-in-jvm

一个简单的借助jdk中的内置工具帮助我们对比Java源码和生成的字节码以及探究字节码结构的项目

---

## 使用方法

1. 编写Java源码，如项目目录中的Main.java:

2. 运行javac编译成字节码

    ```sh
    javac Main.java
    ```

3. 运行javap分析Class文件字节码

    ```sh
    javap -verbose Main > Main.bytecode
    ```
