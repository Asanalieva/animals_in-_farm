package com.company;

public abstract class AbstractAnimal {
    private float weight;
    private int age;
    private char gender;
    private String nickName;

    public AbstractAnimal(){}
    public AbstractAnimal(float weight, int age, char gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }
    @Override
    public String toString() {
        return
                "weight: " + weight +'\n'+
                "age: " + age +'\n'+
                "nickName: " + nickName + '\n' +
                "gender: " + gender ;
    }


    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
