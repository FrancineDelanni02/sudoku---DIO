package src;

import java.util.ArrayList;
import java.util.List;

public class Board {
    /*Se os nodos forem um "lista linear", então a lógica seria de que uma nova linha seria
    * iniciada a cada 9 posições, até chegar em 81
    * Não pode haver o mesmo número na mesma posição em nenhum momento
    * Também não se pode repetir número dentro do conjunto de 9 elementos
    * POSSO CRIAR UM LÓGICA QUE ME POSSIBILITE CRIAR BOARDS PERSONALIZADOS, ONDE
    * O NÚMERO DE LINHAS E COLUNA É PERSONALIZADO*/

    private List<Node> nodes;

    public Board(){
        this.nodes = new ArrayList<>(81);

    }
}
