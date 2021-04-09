package josezaquinaula.dam.m05.uf2.p2;

public class ComplexitatCiclomatica {
    public int metodeRaro(int opcio, String paraula, char lletra){
         //i
        if (opcio == 0) //1
            return paraula.length(); //2
        else {
            int coincidencies=0;
            for (int i = 0; i < paraula.length(); i++) { //3
                //4
                if (paraula.charAt(i) == lletra) coincidencies++; //5
            }
            //6
            if (coincidencies > 5) return -1; //7
            return coincidencies; //8
        }
        //f
        //comentario adicional sin sentido :D
    }
}
