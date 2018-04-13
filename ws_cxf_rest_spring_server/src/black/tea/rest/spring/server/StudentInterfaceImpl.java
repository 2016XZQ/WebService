package black.tea.rest.spring.server;


import black.tea.rest.spring.pojo.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentInterfaceImpl implements StudentInterface {
    @Override
    public Student query(long id) {
        Student student = new Student();
        student.setId(101);
        student.setName("老王");
        student.setBirthday(new Date());
        return student;
    }

    @Override
    public List<Student> queryList(String name) {
        Student student1 = new Student();
        student1.setId(101);
        student1.setName("老王");
        student1.setBirthday(new Date());
        Student student2 = new Student();
        student2.setId(102);
        student2.setName("老王");
        student2.setBirthday(new Date());
        Student student3 = new Student();
        student3.setId(103);
        student3.setName("老王");
        student3.setBirthday(new Date());

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        return list;
    }
}
