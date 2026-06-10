public class parrot extends Bird{
    public void Speek(){
        System.out.println("Parrot is Speaking.");
    }
    public static void main(String[] args){
        parrot information =  new parrot();
        information.fly();
        information.Speek();
        System.out.println("<:===========================================:>");
    }
}
