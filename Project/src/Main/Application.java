package Main;

import Agentes.*;
import Ambiente.*;
import java.util.Random;

/**
 *
 * @author Gabriel Breno Lima Sousa de Amorim - RA:21496990
 * @author Rafael
 */
public class Application {

    public static int areaX;
    public static int areaY;
    public static int planta;
    public static Posicao[][] area;
    private static Random r = new Random();

    public static void main(String[] args) {
        areaX = areaY = 50;
        criarArea(areaX, areaY);
        planta = (areaX*areaY)/2;
        System.out.println("\n"+planta+" plantas criadas!\n");
        for (int i = 0; i < planta; i++) {
            criarPlantas();
        }
        mostraArea();
    }

    public static void criarArea(int posX, int posY) {
        area = new Posicao[posX][posY];
        for (int i = 0; i < areaX; i++) {
            for (int j = 0; j < areaY; j++) {
                area[i][j] = new Posicao();
            }
        }
        System.out.println("Área " + posX + "x" + posY + " criada.");

    }

    public static void criarPlantas() {
        int x, y;
        x = y = 0;
        boolean sair = true;
        while ((x == 0 && y == 0) || (x == areaX - 1 && y == areaY - 1) || sair == false) {
            x = r.nextInt(areaX);
            y = r.nextInt(areaY);
            sair = !area[x][y].getPlanta();
            area[x][y].setPlanta();
        }
    }

    public static void mostraArea() {
        String a = "";
        for (int i = 0; i < areaX; i++) {
            for (int j = 0; j < areaY; j++) {
                Posicao p = area[i][j];
                if(p.getPlanta()){
                    a = a + "|" + "Y";
                }
                else{
                    a = a + "|" + " ";
                }
            }
            a = a + "\n";
        }
        System.out.println(a);
    }
}
