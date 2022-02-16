package com.company;

public class Farm {
    private String address;
    private String ownerName;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheep;


    public Farm(String address, String ownerName, Cow[] cows, Horse[] horses, Sheep[] sheep) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
    }

    public Farm(){}
    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return "Farm information: " +'\n' +
                "address: " + address + '\n' +
                "ownerName: " + ownerName + '\n' +
                "sheep: " + sheep.length+'\n' +
                "horses: " + horses.length+'\n' +
                "cows: " + cows.length+'\n';}

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }


}
