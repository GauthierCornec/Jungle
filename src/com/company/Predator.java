package com.company;

public class Predator {
    private static final int s_iDrinkingQuantity = 3;


    private int m_iAgeNow;
    private int m_iAgeMax;
    private static final int s_iAgeMaxAll = 40;

    private int m_iNbLifePointsNow;
    private int m_iNbLifePointsMax;
    private static final int s_iNbLifePointsAll = 120;

    private Smelling m_smelling;
    private Vision m_vision;
    private Coords m_Coords;

    public void hunt (Prey p_prey){

    }
    public void move (){

    };
    public void eat (Prey p_prey){

    };
    public void drink (WaterSpot p_WaterSpot){
        int waterAvailable = p_WaterSpot.getWaterForDrink(s_iDrinkingQuantity);
    }
    public void mate (Predator p_predator){

    }

    void flee(Predator p_Predator){

    }

    public void update() {
        drink(EcoSystem.getInstance().getWaterSpot());
    }


}
