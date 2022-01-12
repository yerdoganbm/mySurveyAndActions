package com.example.sealedtest;


public sealed class FirstStepExtendTwoClass extends ExtendClass permits TwoStepExtendClass {

    private final int loadCapacity;

    public FirstStepExtendTwoClass(int loadCapacity, String registrationNumber) {
        super(registrationNumber);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }



}