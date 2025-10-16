package listaencadeadadeninjas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class GerenciamentoDeninjas<Ninja>  {

    private LinkedList<Ninja> ninjas = new LinkedList<>();

    public GerenciamentoDeninjas() {
    }

    public GerenciamentoDeninjas(LinkedList<Ninja> ninjas) {
        this.ninjas = ninjas;
    }

    public LinkedList<Ninja> getNinjas() {
        return ninjas;
    }

    public void setNinjas(LinkedList<Ninja> ninjas) {
        this.ninjas = ninjas;
    }

    public void listarNinjas () {
        for (Ninja n : ninjas) {
            System.out.println(n);
        }
    }
    public void adicionarninjas (Ninja ninja){
        ninjas.add(ninja);
    }
    public void removerNinja (){
        ninjas.remove();
    }


    public String toString() {
        return "Os ninjas cadastrados sao: ";
    }
}
