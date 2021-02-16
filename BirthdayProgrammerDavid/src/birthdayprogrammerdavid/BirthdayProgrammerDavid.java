/*
AUTOR: DAVID PÉREZ MARTÍN
1 ASIX - MONLAU
FECHA: 16/02/2021
 */
package birthdayprogrammerdavid;

public class BirthdayProgrammerDavid {

    public static void main(String[] args) {

        int dia = 13, mes = 9, anio = 2021;
        String stDat = birthdayZellerMonlau(dia, mes, anio);
        System.out.println("International programmer's day: " + stDat + ", septiembre 2021");

    }

    private static String birthdayZellerMonlau(int dia, int mes, int anio) {

        String[] ArrayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int a, y, m, d;
        a = (14 - mes) / 12;
        y = anio - a;
        m = mes + 12 * a - 2;
        d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return ArrayWeek[d];

    }

}
