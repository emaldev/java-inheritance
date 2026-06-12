public class Manager extends Employee{
    private int teamSize;

 public int getTeamSize(){
     return teamSize;
  }
  public void setTeamSize(int teamSize){
     this.teamSize = teamSize;
  }

    public void work(){
        System.out.println("Manager is managing a team of size " + teamSize);
        super.work();
    }
    public static void main(String[] args){
        Manager maniging = new Manager();
        maniging.setTeamSize(5);
        maniging.work();
        System.out.println( "Team Size: " + maniging.teamSize);
    }

}
