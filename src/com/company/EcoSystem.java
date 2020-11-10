package com.company;

public class EcoSystem {
    private static final int MAX_ARRAY_ELEMENTS = 100;

    private static EcoSystem s_EcoSystemInstance;

    private int m_iWidth;
    private int m_iHeight;

    private WaterSpot   m_WaterSpot;
    private Predator[]  m_PredatorArray;
    private Prey[]      m_PreyArray;
    private Plant[]     m_PlantArray;

    static public EcoSystem getInstance(){
        if (s_EcoSystemInstance == null) {
            s_EcoSystemInstance = new EcoSystem();
        }
        return s_EcoSystemInstance;
    }

    /***
     * constructeur de la classe
     * L'écosysteme est responsable de la création des éléments qu'il contient.
     */


    private EcoSystem(){
        m_iHeight = 30;
        m_iWidth = 120;
        /*** On défiinti le water spot pour qu'il fasse une taille du quart du terrain
         * de l'écosytem.
         */
        m_WaterSpot = new WaterSpot(1500,
                m_iHeight/4,
                m_iHeight/4);


        m_PredatorArray = new Predator[MAX_ARRAY_ELEMENTS];
        m_PreyArray = new Prey[MAX_ARRAY_ELEMENTS];
        m_PlantArray = new Plant[MAX_ARRAY_ELEMENTS];


        for (int i = 0; i < MAX_ARRAY_ELEMENTS; i++) {
            m_PredatorArray[i] = new Predator();
            m_PreyArray[i] = new Prey();
            m_PlantArray[i] = new Plant();

        }
    }
    // Game loop qui va permetrre a chaque element des tableaux de se mettre a jour.
    public void startLifeCycle(){

        // il faudra définir les conditions d'arrets
        // ca parrait etre
        // il n'y a plus d'eau => tous les animaux vont mourrir
        // il n'ya  plus de prédateur => les proies vont se multiplier et boufffer toutes les plantes
        // il n'y a plus de proies => les prédateurs vont mourrir de faim
        while (true){

            m_WaterSpot.update();

            for (Predator pred: m_PredatorArray){
                pred.update();
            }

            for (Prey prey: m_PreyArray){
                prey.update();
            }

            for (Plant plant: m_PlantArray){
                plant.update();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public WaterSpot getWaterSpot() {
        return m_WaterSpot;
    }
}


