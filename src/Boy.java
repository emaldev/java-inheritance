public class Boy extends Person{
    private int studentId;

    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int studentId){
        this.studentId= studentId;

    }
    public void displayInfo(){
             System.out.println("Name: " + name + ",ID: " + studentId);
        super.displayInfo();

    }
    public  static  void  main(String[] args){
        Boy  student = new Boy();
        student.setStudentId(23);
             student.displayInfo();
    }

}
