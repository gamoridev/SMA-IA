package Agentes;

import java.util.Random;
import Main.Application;

public class Coelho extends Agente {

    private Random r = new Random();

    @Override
    public void acao(int posX, int posY) {

    }

    private int[] movimentar(int posX, int posY) {
        int[] tmp = new int[2];
        int rd = r.nextInt(4);
        if (rd == 0 && posX > 0) {
            tmp[0] = posX - 1;
            tmp[1] = posY;
            return tmp;
        }
        if ((rd == 1) && (posX + 1 < Application.areaX)) {
            tmp[0] = posX + 1;
            tmp[1] = posY;
            return tmp;
        }
        if (rd == 2 && posY > 0) {
            tmp[0] = posX;
            tmp[1] = posY - 1;
            return tmp;
        }
        if ((rd == 3) && (posY + 1 < Application.areaY)) {
            tmp[0] = posX;
            tmp[1] = posY + 1;
            return tmp;
        }
        return null;
    }
}
