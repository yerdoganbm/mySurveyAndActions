package com.example.sealedtest;

public  interface FirstStepExtendInterface {

    int getMaxServiceIntervalInMonths();

    default int getMaxDistanceBetweenServicesInKilometers() {
        return 100000;
    }

}