public class PostgraduateStudent extends Student {
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public PostgraduateStudent(int rollNo, String name, String cgpa){
        this.rollNo = rollNo;
        setName(name);
        setCgpa(cgpa);
    }

    public void display(){
        System.out.println("Postgraduate Student");
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("CGPA: " + getCgpa());
    }
}
