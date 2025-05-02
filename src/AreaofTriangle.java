class AreaofTriangle{
    public static void main(String[] args) {
      Result r=new Result();
        r.display();
        r.method1(5);
        r.method2(5,8);
    }
}
class Area{
    void method1(int s){
        double area1=((1.73*s*s)/4);
        System.out.println("Area1="+area1);
    }
    void method2(double b,double h){
        double area2= ((b*h)/2);
        System.out.println("Area2="+area2);
    }
}
class Result extends Area{
    void display(){
        System.out.println("Area of Triangle");
    }
}