public class ConeVolume {
    public static void main(String[] args) {
        PieFunction pi=new PieFunction();
        int r=6;
        int h=9;
        double vol=r*r*h/3.0*pi.pie();
        System.out.println("Volume of Cone="+vol);
    }
}
