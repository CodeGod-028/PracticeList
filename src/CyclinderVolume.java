public class CyclinderVolume {
    public static void main(String[] args) {
        PieFunction pi=new PieFunction();
        int r=4;
        int h=4;
        double vol=pi.pie()*Math.pow(r,2)*h;
        System.out.println("Volume of Cylinder="+vol);
    }
}
