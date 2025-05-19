package examen;

class Vehicle {
    private String matricula;
    private String marca;
    private String model;
    private int any;
    private double preu;

    public Vehicle(String matricula, String marca, String model, int any, double preu) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.any = any;
        this.preu = preu;
    }

    public int getAny() {
        return any;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModel() {
        return model;
    }

    public double getPreu() {
        return preu;
    }
    

}