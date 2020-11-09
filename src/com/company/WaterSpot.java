package com.company;

public class WaterSpot {

    int m_iWaterQuantity;
    int m_iWidth;
    int m_iHeight;
    private Coords m_Coords;

    public WaterSpot(int p_iWaterQuantity, int p_iWidth, int p_iHeight) {

        m_iWaterQuantity = p_iWaterQuantity;
        m_iWidth = p_iWidth;
        m_iHeight = p_iHeight;
        m_Coords = new Coords(0, 0);

    }
}

