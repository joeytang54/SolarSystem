package com.company;

public class Main {
    public static void main(String[] args) {
        SolarSystem FactorX=new SolarSystem();
        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Planet="2";
        FactorX.Stars="10000";

        //adding features to our sun
        FeatureSun Xfact=new FeatureSun();
        Xfact.color="green";
        Xfact.radius="10000000000km";
        Xfact.heat="3044428493000kj";

        //adding features for star in the solar system
        FeatureStars FacX=new FeatureStars();
        FacX.color="green";
        FacX.radius="89304828490km";
        FacX.size="9999999999999m";
    }
}
