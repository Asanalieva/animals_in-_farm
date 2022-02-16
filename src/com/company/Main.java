package com.company;

public class Main {

    public static void main(String[] args) {


        Cow cow1 = new Cow(33.3f,2,'F',"Milky");
        Cow cow2 = new Cow(53.2f,6,'M',"Billy");
        Cow cow3 = new Cow(87.6f,7,'F',"Anjella");
        Cow cow4 = new Cow(32.1f,2,'M',"Worse");
        Cow cow5 = new Cow(99.7f,8,'M',"Quick");
        Cow[] cows = {cow1,cow2,cow3,cow4,cow5};

        Sheep sheep1 = new Sheep(4.2f,5,'F',"Heice");
        Sheep sheep2 = new Sheep(4.2f,3,'F',"Sammy");
        Sheep sheep3 = new Sheep(3.3f,2,'M',"Tyne B");
        Sheep[] sheep = {sheep1,sheep2,sheep3};

        Horse horse1 = new Horse(77.9f,5,'M',"Smort","Brown");
        Horse horse2 = new Horse(89.7f,5,'F',"Donny","White");
        Horse[] horses = {horse1,horse2};

        //2

        Sheep sheep4 = new Sheep(44.4f,3,'M',"Iown");
        Cow cow6 = new Cow(76.6f,5,'M',"Jack");
        Horse horse3 = new Horse(98.7f,7,'F',"Jasmin","Black");
        Sheep[] sheep5 = {sheep4};
        Cow[] cows1 = {cow6};
        Horse[] horses1 = {horse3};

        Farm farm = new Farm("Naryn","Dilbara",new Cow[]{cow1,cow2,cow3,cow4,cow5},new Horse[]{horse1,horse2},new Sheep[]{sheep1,sheep2,sheep3});
        Farm farm2 = new Farm("Batken","Dinara",new Cow[]{cow6},new Horse[]{horse3},new Sheep[]{sheep4});

        System.out.println(farm);
        System.out.println("Cows:");
        for(Cow i: cows){
            System.out.println("Weight: "+i.getWeight()+" Age: "+ i.getAge()+" Gender: "+ i.getGender()+ " Nickname: " + i.getNickName());
        }
        System.out.println("Sheep:");
        for(Sheep i: sheep){
            System.out.println("Weight: "+i.getWeight()+" Age: "+ i.getAge()+" Gender: "+ i.getGender()+ " Nickname: " + i.getNickName());
        }
        System.out.println("Horses:");
        for(Horse i: horses){
            System.out.println("Weight: "+i.getWeight()+" Age: "+ i.getAge()+" Gender: "+ i.getGender()+ " Nickname: " + i.getNickName());
        }
        System.out.println(" ");
        System.out.println(farm2);
        for(Cow i: cows1){
            System.out.println("Weight: "+i.getWeight()+" Age: "+ i.getAge()+" Gender: "+ i.getGender()+ " Nickname: " + i.getNickName());
        }
        for(Sheep i: sheep5){
            System.out.println("Weight: "+i.getWeight()+" Age: "+ i.getAge()+" Gender: "+ i.getGender()+ " Nickname: " + i.getNickName());
        }
        for(Horse i: horses1){
            System.out.println("Weight: "+i.getWeight()+" Age: "+ i.getAge()+" Gender: "+ i.getGender()+ " Nickname: " + i.getNickName());
        }


    }
}
