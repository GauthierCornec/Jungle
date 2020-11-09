package com.company;

public class EcoSystem {
    private int m_iWidth;
    private int m_iHeight;

    private WaterSpot m_WaterSpot;

    /***
     * constructeur de la classe
     * L'écosysteme est responsable de la création des éléments qu'il contient.
     */

    public EcoSystem(){
        m_iHeight = 30;
        m_iWidth = 120;
        /*** On défiinti le water spot pour qu'il fasse une taille du quart du terrain
         * de l'écosytem.
         */
        m_WaterSpot = new WaterSpot(500,
                m_iHeight/4,
                m_iHeight/4);
    }

}


