package listaencadeadadeninjas;

public class Ninja {
    private String name;
    private int age;
    private String vila;

    public Ninja(String name, int age, String vila) {
        this.name = name;
        this.age = age;
        this.vila = vila;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }
    public void mostrarInformacoes ( ){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getVila());
    }

    @Override
    public String toString() {
        return "Nome do Ninja é " + name + " sua idade é " +  age + " anos e pertence a vila " + vila;
    }
}
