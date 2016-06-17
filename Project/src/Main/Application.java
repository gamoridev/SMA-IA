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
        mostraArea();
    }

    public static void criarArea(int posX, int posY) {
        area = new Posicao[posX][posY];
        for (int i = 0; i < areaX; i++) {
            for (int j = 0; j < areaY; j++) {
                area[i][j] = new Posicao();
            }
        }
        System.out.println("Área " + posX + "posX" + posY + " criada.");

    }

    public static void mostraArea() {
        String a = "";
        for (int i = 0; i < areaX; i++) {
            for (int j = 0; j < areaY; j++) {
                Posicao p = area[i][j];
            }
            a = a + "[]";
        }
        System.out.println(a);
    }
}
