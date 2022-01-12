package com.example.sealedtest;
public non-sealed class FirstStepExtendOneClass extends ExtendClass implements FirstStepExtendInterface {

    private final int numberOfSeats;

    public FirstStepExtendOneClass(String registrationNumber, int numberOfSeats) {
        super(registrationNumber);
        this.numberOfSeats = numberOfSeats;
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 12;
    }

}