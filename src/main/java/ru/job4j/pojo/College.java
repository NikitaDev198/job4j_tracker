package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student person = new Student();
        person.setName("Nikita");
        person.setSurname("Kharchenko");
        person.setPatronymic("Aleksandrovich");
        System.out.println("Full name of person is : " + person.getSurname() + " " + person.getName() + " " + person.getPatronymic());

    }

}
