public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName;

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public static String getInstituteName() {
        return instituteName;
    }
    public static void setInstituteName(String instituteName) {
        Course.instituteName = instituteName;
    }

    public Course(String courseName, int duration, double fee) {
        setCourseName(courseName);
        setDuration(duration);
        setFee(fee);
    }

    public void displayCourseDetails(){
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
    }

    public static void updateInstituteName(String newInstituteName){
        setInstituteName(newInstituteName);
    }
}
