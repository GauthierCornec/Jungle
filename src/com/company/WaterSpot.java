package com.company;

public class WaterSpot {

    private int m_iWaterQuantity;
    int m_iWidth;
    int m_iHeight;
    private Coords m_Coords;

    public WaterSpot(int p_iWaterQuantity, int p_iWidth, int p_iHeight) {

        m_iWaterQuantity = p_iWaterQuantity;
        m_iWidth = p_iWidth;
        m_iHeight = p_iHeight;
        m_Coords = new Coords(0, 0);

    }

    public void update() {
        System.out.println(("Water quantity left : " + m_iWaterQuantity));
    }

    public int getWaterForDrink(int p_WaterQuantityResquested){
        //
        int WaterAvailable = m_iWaterQuantity;

        // il rste plus d'eau que demander, on peut donc renvooyer à l'animal la quantité qu'il désier
        if (m_iWaterQuantity > p_WaterQuantityResquested){
            m_iWaterQuantity -= p_WaterQuantityResquested;
            WaterAvailable = p_WaterQuantityResquested;
        }

        // il reste encore d el'eau mais moins que e que l'animal désire. On renvoie la quantité qu'il reste et on met
        // à 0 la uantité d'eau du water spot.
        else if (m_iWaterQuantity > 0){
            m_iWaterQuantity = 0;
        }
        return WaterAvailable;
    }
}

