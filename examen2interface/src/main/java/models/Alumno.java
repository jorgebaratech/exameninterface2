package models;

public class Alumno {
    private String nombre;
    private String apellidos;
    private double ad;
    private double sge;
    private double di;
    private double pmdm;
    private double psp;
    private double eie;
    private double hlc;
    
    public Alumno(String nombre, String apellidos, double ad, double sge, double di, double pmdm, double psp, double eie, double hlc) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ad = ad;
        this.sge = sge;
        this.di = di;
        this.pmdm = pmdm;
        this.psp = psp;
        this.eie = eie;
        this.hlc = hlc;
    }
    
    // Métodos getters y setters
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public double getAd() {
        return ad;
    }
    
    public void setAd(double ad) {
        this.ad = ad;
    }
    
    public double getSge() {
        return sge;
    }
    
    public void setSge(double sge) {
        this.sge = sge;
    }
    
    public double getDi() {
        return di;
    }
    
    public void setDi(double di) {
        this.di = di;
    }
    
    public double getPmdm() {
        return pmdm;
    }
    
    public void setPmdm(double pmdm) {
        this.pmdm = pmdm;
    }
    
    public double getPsp() {
        return psp;
    }
    
    public void setPsp(double psp) {
        this.psp = psp;
    }
    
    public double getEie() {
        return eie;
    }
    
    public void setEie(double eie) {
        this.eie = eie;
    }
    
    public double getHlc() {
        return hlc;
    }
    
    public void setHlc(double hlc) {
        this.hlc = hlc;
    }
    
    // Método para calcular la nota media
    
    public double calcularNotaMedia() {
        return (ad + sge + di + pmdm + psp + eie + hlc) / 7;
    }
    
    // Método para comprobar si el alumno ha aprobado todos los módulos
    
    public boolean haAprobadoTodos() {
        return ad >= 5 && sge >= 5 && di >= 5 && pmdm >= 5 && psp >= 5 && eie >=
5 && hlc >= 5;
}
    // Método para comprobar el número de módulos suspendidos

public int numModulosSuspensos() {
    int numSuspensos = 0;
    if (ad < 5) {
        numSuspensos++;
    }
    if (sge < 5) {
        numSuspensos++;
    }
    if (di < 5) {
        numSuspensos++;
    }
    if (pmdm < 5) {
        numSuspensos++;
    }
    if (psp < 5) {
        numSuspensos++;
    }
    if (eie < 5) {
        numSuspensos++;
    }
    if (hlc < 5) {
        numSuspensos++;
    }
    return numSuspensos;
}

// Método para validar las notas

public static boolean validarNota(double nota) {
    return nota >= 0 && nota <= 10;
}

}