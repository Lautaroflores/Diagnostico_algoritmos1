
import java.util.ArrayList;
import java.util.List;

public class ListAnalyzer {

    private static int impares = 0;
    public static int ContadorImpares(List<Integer> lista){
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i)%2 != 0){
                impares++;
            }
        }
        return impares;
    }


    public static List<Integer> numerosConsecutivos(List<Integer> lista){
        List<Integer> consecutivos = new ArrayList<>();
        for (int i = 0; i < lista.size() - 1; i++){
            if (lista.get(i) + 1 == lista.get(i + 1)){
                consecutivos.add(lista.get(i));
                consecutivos.add(lista.get(i + 1));
            }
        }
        return consecutivos;
    }

}

