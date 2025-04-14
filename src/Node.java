package src;

public class Node {
    private boolean fixed;
    private Integer actualNumber;
    private Integer expectedNumber;

    /*Quando um node for fixed, o actual já é preenchido e o expected é marcado com o actual
    * automaticamente
    * Eu não preciso definir que o fixed é true ou false sempre, se eu chamar um construtor de
    * um nodo vazio que deve ser preenchido ele já coloca o fixed automaticamente como false
    * Quando o usuário quiser mudar o valor de um nodo, primeiro deve ser verificado se ele é
    * fixed, se sim não deve ser permitida a modificação
    * O */

    public Node(boolean fixed,Integer actualNumber){
        this.actualNumber = actualNumber;
        if(fixed)
            this.expectedNumber = this.actualNumber;
    }

    public Node(){
        this.fixed = false;
        this.actualNumber = null;
        this.expectedNumber = 0;
    }

    public void setActualNumber(Integer number){
        if(fixed)
            return;

        this.actualNumber = number;
    }
}
