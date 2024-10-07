public class Cidade implements Comparable<Cidade> {

    private String nome;
    private int temp;

    public Cidade(String nome, int tmp) {
        this.nome = nome;
        this.temp = tmp;
    }

    public void set_nome(String n) {
        this.nome = n;
    }

    public void set_temp(int t) {
        this.temp = t;
    }

    public String get_nome() {
        return this.nome;
    }

    public int get_temp() {
        return this.temp;
    }

    @Override
    public int compareTo(Cidade c) {
        return this.nome.compareTo(c.get_nome());
    }

    @Override
    public String toString() {
        return "Cidade: " + nome + ", Temperatura: " + temp;
    }
}
