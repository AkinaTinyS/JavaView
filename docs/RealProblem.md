#Problem

1. 接口和抽象的区别

有抽象方法一定为抽象类
抽象类不是被实例化
抽象类不一定含有抽象方法
类可以实现多个接口但是只能继承一个抽象类
接口所有方法都是都是public，抽象类允许private,Protected方法
抽象类可以有普通方法和静态方法

2. java中有哪些异常

分为错误和异常，异常包含运行时异常和非运行是异常
OutOfMemoryError
StackOverflowError
RuntimeException子类NullPointerException，IndexOutOfBoundsException

3. 内存溢出出现的原因
程序中存在死循环
静态变量和静态方法太多了
内存泄漏
大对象过多
程序分配内存过小

4. ==和equals的区别

==用于基本类型比较，或者两个对象的引用
equals用于比较两个对象的值


5.HashMap实现原理，如何保证HashMap的线程安全
