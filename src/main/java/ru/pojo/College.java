package ru.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Mishin Oleg Markovich");
        student.setGroup(123);
        student.setAdmission("03.08.2024");
        System.out.println(student.getName() + ", group " + student.getGroup() + " admission " + student.getAdmission());
    }
}
