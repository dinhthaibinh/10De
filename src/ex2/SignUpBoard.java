package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SignUpBoard {
    private List<Student> students;
    private Student student;
    private int n;

    public SignUpBoard() {
        this.student = new Student();
        this.students = new ArrayList<>();
    }

    public void registration(){
        do {
            System.out.println("=== Đăng kí ===");
            student.input();
            students.add(student);
            System.out.println("bạn có muốn đki thêm không (1/0)");
            this.n = new Scanner(System.in).nextInt();
        }while (this.n == 1);
    }

    public void out(){
        for (Student student : students) {
            student.output();

        }
    }
}
