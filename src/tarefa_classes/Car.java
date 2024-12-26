package tarefa_classes;

public class Car {
    // Instance variables (attributes)
    private int codigo;
    private String modelo;
    private int ano;
    private String cor;
    
    // Constructor
    public Car(int codigo, String modelo, int ano, String cor) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    
    // Getters and Setters
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
}