＃-Java<br/>
java课程作业项目仓库<br/>

##实验目的<br/>
1.掌握类的设计<br/>
2.写出程序并初步设计学会调试<br/>
3.利用github平台写报告总计<br/>

##实验过程——<br/>
>>首先完成代码的初步程序，区分出不同的类为CPU,PC,HardDisk，Test。在每个类中建立公共类。<br/>
  public class CPU，public class PC，public class HardDisk，名称与类的包名称一样。<br/>
>>在类中定义方法的操作属性。在CPU中定义prince价格和speed速度，并返回值。在PC,和HardDisk中也一样，<br/>
  定义PC和HardDisk，以及brand品牌和amount。<br/>
>>随后在Test中调用，赋予每个变量值。最后在PC中调用这些变量，使用他们的值。通过系统输出文字。<br/>
  结果在下面的实验结果中。<br/>


##实验设计<br/>
1.用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk和Test，其中Test是主类。<br/>
  其中，CPU类要求getSpeed()返回speed的值，要求setSpeed(int m)方法将参数m的值赋值给speed; HardDisk类要求getAmount()返回amount的值，<br/>
  要求setAmount(int m)方法将参数 m的值赋值给amount;PC类要求setCPU(CPU c)将参数c的值赋值给cpu，要求setHardDisk (HardDisk h)方法将<br/>
  参数h的值赋值给HD，要求show()方法能显示cpu的速度和硬盘的容量。<br/>
##核心代码<br/>
···<br/>
String brand(String b) {<br/>
			brand=b;<br/>
			return brand;<br/>
      }<br/>
···<br/>
···<br/>
int getPrice() {<br/>
		return price;<br/>
	}<br/>
···<br/>
···<br/>
public static void main(String args[]) {<br/>
···<br/>

##实验结果<br/>
   CPU的速度为2200<br/>
   硬盘的容量为200<br/>
   硬盘的品牌sansung<br/>
   cpu价格284<br/>
##实验敢想<br/>
我觉得这次试验是一次锻炼我Java读写的好机会。本来不是特别清楚的地方，在同学和老师的帮助下慢慢清楚明白了。有一些跟C语言很像，但是名称却不一样。<br/>
我总是不知道如何正确称呼他们。这些通过后期的联系是会慢慢了解的。Java的设计是为了在打长代码的过程中更加省力简便。所以有一些规则容易使我搞混。<br/>
阅读代码的问题不是很大。但是在编写的过程中容易让我的程序出问题。因为我不了解java的“潜规则”是什么。这一点在以后的学习中要注意。<br/>
