public class catBoy extends cat {
           public void displayInfo(){
               System.out.println("This is from CatBoy class :");
               super.displayInfo();
           }
    public static void main(String[] args){
        catBoy animal = new catBoy();
        animal.displayInfo();


    }
}
