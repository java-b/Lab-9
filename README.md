# 抽象类与接口 
##1.抽象类 
>实现一个abstract类，类名为Employee。实现三个继承自Employee的子类分别为 YearWorker，MonthWorker和WeekWorker。YearWorker对象按年领取薪水， MonthWorker对象按月领取薪水，WeekWorker对象按周领取薪水。Employee类有一个抽象 方法： 

```
public abstract double earnings( ); 
```

>子类必须重写父类的earnings方法，给出各自领取报酬的具体方式，其中YearWorker 挣180/year，MonthWorker挣10/month，WeekWorker挣2/week。 

>实现一个Company类，该类用employee数组和double的salaries作为成员， employee数组的成员可以是YearWorker对象的上转型对象、MonthWorker对象的上转型
>对 象或WeekWorker对象的上转型对象，同时具有一个有参构造函数如下： 

```
public Company(Employee[ ] employee){
    this.employee=employee;
} 
 
 ```
 
>Company类实现了一个salariesPay（）方法能够输出Company对象一年需要支付的 薪水总额，（一年算有52 个星期），函数框架如下： 
 
>```
 public double salariesPay( ){       
      this.salaries = 0;  // 计算salaries       
      return salaries;    
 } 
 ```
 
> 实现上述几个类之后，将Lab10_1.java放置在同一目录下。编译并运行Lab10_1.java。 如果一切正确（不允许修改Lab10_1.java），显示如下： 
>![alt tag](https://github.com/java-b/Lab-9/blob/master/1.png)
 
 ##2.接口 
>实现一个 ComputeTotalSales 接口，该接口中有一个方法： 

>```
public int totalSalesByYear( ); 
```

>实现三个 implement 该接口的类：Television、Computer 和 Mobile。这三个类通过实现接 口 ComputeTotalSales，给出自己的年销售额（其中 television >
>为 1000，computer 为 2000，mobile 为 3000）。 

>实现一个 shop 类，该类用 ComputeTotalSales 数组和 int 的 totalSales 作为成员， ComputeTotalSales 数组的单元可以存放 Television 对象的引用、
>Computer 对象的引用或 Mobile 对 象的引用。同时具有一个有参构造函数如下： 

>```
public Shop(ComputeTotalSales[] goods){   
    this.goods = goods;  
} 
 ```
 >shop类实现了一个totalSales（）方法能够输出shop对象的年销售额。函数框架如 下：  
 
 >```
 public int giveTotalSales( ){
    this.totalSales = 0;        
    return totalSales;  
 } 
 ```
 
 >实现上述几个类之后，将Lab10_2.java放置在同一目录下。编译并运行Lab10_2.java。 如果一切正确（不允许修改Lab10_2.java），显示如下：  
 
 >![alt tag](https://github.com/java-b/Lab-9/blob/master/2.png)
 
 ##3.抽象类与接口
>同学们已经简单试过抽象类和接口了，是不是发现两者很相似的，那么我们在什么情况下该使用抽象类在什么情况下使用接口？写一份 200 字以上自己的理解作为这个 
>lab的结尾吧~ 
