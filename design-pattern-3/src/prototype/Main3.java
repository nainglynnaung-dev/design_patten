package prototype;

public class Main3 {
    public static void main(String[] args) {
        Student student=new Student("Naing Lynn Aung","Yaiwai","kingkong@gmail.com");

        Student stu= (Student) student.clone();
        System.out.println(stu);

        stu.setEmail("james34@gmail.com");
        System.out.println(stu);

    }
}
