public class Student {
    public int rollNo;
    protected String name;
    private String cgpa;

    public String getCgpa(){
        return cgpa;
    }
    public void setCgpa(String cgpa){
        this.cgpa = cgpa;
    }

    public Student(){

    }
}
