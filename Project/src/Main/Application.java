package Main;

import Agentes.*;
import Ambiente.*;

/**
 *
 * @author Gabriel Breno Lima Sousa de Amorim - RA:21496990
 * @author Rafael
 */
public class Application {

    public static int areaX;
    public static int areaY;
    public static Posicao[][] area;

    public static void main(String[] args) {
        areaX = areaY = 50;
        criarArea(areaX, areaY);
    }

    public static void criarArea(int x, int y) {
        area = new Posicao[x][y];
        for (int i = 0; i < areaX; i++) {
            for (int j = 0; j < areaY; j++) {
                area[i][j] = new Posicao();
            }
        }
        System.out.println("Área " + x + "x" + y + " criada.");

    }

}
