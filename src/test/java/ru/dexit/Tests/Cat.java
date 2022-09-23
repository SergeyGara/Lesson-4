package ru.dexit.Tests;

public class Cat {
    String name;
    int age;
    String gender;
    String colour;
    int weight;
    int height;

    public Cat(String name, int age, String gender, String colour, int weight, int height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.colour = colour;
        this.weight = weight;
        this.height = height;
    }
    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void sayName(){
        System.out.println("Имя: " + name);
    }
    public void sayAge(){
        System.out.println("Возраст: " + age);
    }
    public void sayGender(){
        System.out.println("Пол: " + gender);
    }
    public void sayColour(){
        System.out.println("Цвет: " + colour);
    }
    public void sayHeight(){
        System.out.println("Имя: " + height);
    }
    public void sayWeight(){
        System.out.println("Вес: " + weight);
    }
    public void printInfo() {
        sayWeight();
        sayHeight();
        sayColour();
        sayGender();
        sayAge();
        sayName();
    }
}
