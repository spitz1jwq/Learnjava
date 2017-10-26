package package1;

public class Cartest {
    public static void main(String[] args) {
        Car.Minicooper mini = new Car.Minicooper("x1",300000, (int) 2.5);
        System.out.println("当前名称："+ mini.getName());
        System.out.println("当前价格："+mini.getPrice());
        System.out.println("当前型号 "+ mini.getSize());
        Car ca = new Car.Minicooper("x1",300000, (int) 2.5);//父类引用指向子类对象。
        ca.show();
    }

}
