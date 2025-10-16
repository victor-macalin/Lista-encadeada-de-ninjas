package listaencadeadadeninjas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Ninja ninja1 = new Ninja("Naruto Uzumaki", 18, "Aldeia da folha");
        Ninja ninja2 = new Ninja("Kakashi Hatake", 26, "Aldeia da folha");
        Ninja ninja3 = new Ninja("Sasuke Uchiha", 17, "Aldeia da folha");
        Ninja ninja4 = new Ninja("Sakura Haruno", 18, "Aldeia da folha");
        Ninja ninja5 = new Ninja("Hinata Hyuga", 16, "Aldeia da folha");
        Ninja ninja6 = new Ninja("Gaara", 19, "Aldeia da Areia");
        Ninja ninja7 = new Ninja("Sarutobi", 52, "Aldeia da folha");


        GerenciamentoDeninjas<Ninja> ninjas = new GerenciamentoDeninjas();
        ninjas.adicionarninjas(ninja1);
        ninjas.adicionarninjas(ninja2);
        ninjas.adicionarninjas(ninja3);
        ninjas.adicionarninjas(ninja4);
        ninjas.adicionarninjas(ninja5);
        ninjas.adicionarninjas(ninja6);
        ninjas.adicionarninjas(ninja7);

        Scanner sc = new Scanner(System.in);

        int opcoes = 0;
        while (opcoes < 6) {

            System.out.println("=======Menu de interação=======");
            System.out.println("1 - Listar ninjas");
            System.out.println("2 - Adicionar Ninja");
            System.out.println("3 - Remover Ninja");
            System.out.println("4 - Buscar informação de um ninja por index");
            System.out.println("5 - Buscar ninja por nome");
            System.out.println("6 - Renomear um ninja");
            System.out.println("7 - Finalizar sistema");

            opcoes = sc.nextInt();
            sc.nextLine();

            switch (opcoes) {
                case 1:
                    if (ninjas.getNinjas().isEmpty()) {
                        System.out.println("A lista esta vazia");
                    } else {
                        ninjas.listarNinjas();
                        break;
                    }
                case 2:
                    System.out.println("=======Digite o nome do ninja=======");
                    String nomeDoNinja = sc.nextLine();
                    System.out.println("=======digite a sua idade=======");
                    int idadeDoNinja = sc.nextInt();
                    System.out.println("=======Qual vila ele pertence=======");
                    sc.nextLine();
                    String vila = sc.nextLine();
                    ninjas.adicionarninjas(new Ninja(nomeDoNinja, idadeDoNinja, vila));
                    System.out.println("=======Pronto ninja adicionado com sucesso!!!=======");
                    break;
                case 3:
                    System.out.println("=======Qual ninja deseja remover - Digite o index:=======");
                    int indexRemove = sc.nextInt();
                    ninjas.getNinjas().remove(indexRemove);
                    break;
                case 4:
                    System.out.println("=======Digite o index que deseja ver as informacoes=======");
                    int index = sc.nextInt();
                    System.out.println(ninjas.getNinjas().get(index));

                    break;
                case 5:
                    System.out.println("=======Digite o nome que deseja pesquisar:=======");
                    String nomePesquisar = sc.nextLine();
                    System.out.println("Buscando ninja...");
                    for (Ninja n : ninjas.getNinjas()) {
                        if (nomePesquisar.equals(n.getName())) {
                            System.out.println(n);
                        }
                    }
                    break;
                case 6:
                    System.out.println("=======Qual ninja deseja renomear?======");
                    ninjas.listarNinjas();
                    String resposta = sc.nextLine();
                    for (Ninja n : ninjas.getNinjas()){
                        if (n.getName().equals(resposta)){
                            System.out.println("=======Digite o novo nome do ninja=======");
                            String novoNome = sc.nextLine();
                            n.setName(novoNome);
                            System.out.println("========Lista atualizada=======");
                            ninjas.listarNinjas();

                        }else {
                            System.out.println("=======Esse nome não esta na lista!!!=======");
                        }
                    }
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digitacao invalida");
                    break;

            }
        }


    }
}



