package josezaquinaula.dam.m05.uf2.p2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class ComplexitatCiclomaticaTest {

    @Test
    void metodeRaro() {
        ComplexitatCiclomatica cc = new ComplexitatCiclomatica();
        //camino1: 1,2 --> opcio = 0
        int opcio = 0;
        String paraula = "paraula";
        char lletra = 'l';
        int metodo = cc.metodeRaro(opcio,paraula,lletra);
        assertEquals(paraula.length(),metodo);
        //camino2:1,3,4,3,6,8 --> opcio!=0, paraula no tiene ninguna letra igual a lletra,
        opcio = 1;
        paraula = "abcdefg";
        lletra = 'h';
        metodo = cc.metodeRaro(opcio,paraula,lletra);
        assertEquals(0,metodo);
        // camino3: 1,3,4,5,3,6,7 -->
        // opcio!=0, coincidencias > 5
        opcio = 1;
        paraula = "aaaaaag";
        lletra = 'a';
        metodo = cc.metodeRaro(opcio,paraula,lletra);
        assertEquals(-1,metodo);
        // camino4:  1,3,4,5,3,6,8 -->
        // opcio!=0,paraula.lenght!=0,coincidencias<=5
        opcio = 1;
        paraula = "aaaaabg";
        lletra = 'a';
        metodo = cc.metodeRaro(opcio,paraula,lletra);
        assertEquals(5,metodo);
        //camino5: opcio!=0,paraula.lenght=0
        opcio = 1;
        paraula = "";
        lletra = 'a';
        metodo = cc.metodeRaro(opcio,paraula,lletra);
        assertEquals(0,metodo);
    }
}