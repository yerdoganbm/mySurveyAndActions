package com.example.sealedtest;

public final class TwoStepExtendClass extends FirstStepExtendTwoClass {
    public TwoStepExtendClass(int loadCapacity, String registrationNumber) {
        super(loadCapacity, registrationNumber);
    }

    @Override
    public int getLoadCapacity() {
        return super.getLoadCapacity();
    }

    @Override
    public String getRegistrationNumber() {
        return super.getRegistrationNumber();
    }
}
