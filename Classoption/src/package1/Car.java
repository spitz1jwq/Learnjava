package package1;

public class Car {
    private String name; //修改属性的可见性来限制对属性的访问（一般限制为private）
    private int price;
    public Car(){

    }
    private Car(String name, int price){
       this.name = name;
       this.price = price;
    }
    //对每个值属性提供对外的公共方法访问，也就是创建一对赋取值方法，用于对私有属性的访问
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public void show(){
        System.out.println("车型号");
    }

    public static class Minicooper extends Car{  //继承 父类
        private int size;
        public Minicooper(String name, int price, int size){
            super(name,price);
            this.size=size;
        }
        public int getSize(){
            return size;
        }

        public void show(){ //重写是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。
            System.out.println("车型的号 ");
        }
    }



}
