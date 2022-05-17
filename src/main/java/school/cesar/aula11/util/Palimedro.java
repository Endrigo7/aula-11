package school.cesar.aula11.util;

public class Palimedro {

    public static boolean pal(String palavra){
        for(int i = palavra.length() -1, j = 0; i >= 0; i--, j++){
            char letraLida = palavra.charAt(i);
            char letraEquivalente = palavra.charAt(j);

            if(letraEquivalente != letraLida){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(pal("Sairam otio e oito Marias"));
    }

}
