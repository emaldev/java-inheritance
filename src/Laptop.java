public class Laptop extends Device {
    private int ram = 16;
    public void turnOn(){
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Model is: " + brand + ", and Ram is: " + ram);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>");
        super.turnOn();
    }
    public static void main(String[] args){
        Laptop L1 = new Laptop();
        L1.turnOn();
    }

}
