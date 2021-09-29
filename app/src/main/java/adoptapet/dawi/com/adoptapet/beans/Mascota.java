package adoptapet.dawi.com.adoptapet.beans;

public class Mascota {
    private int id_mas;
    private String nom_mas;
    private String raza_mas;
    private String edad_mas;
    private String des_mas;
    private String sexo_mas;
    private int id_estado;

    public Mascota(){};

 /*   public Mascota(int id_mas, String nom_mas, String raza_mas, String edad_mas, String tam_mas, String des_mas, String vac_mas, int id_estado) {
        this.id_mas = id_mas;
        this.nom_mas = nom_mas;
        this.raza_mas = raza_mas;
        this.edad_mas = edad_mas;
        this.tam_mas = tam_mas;
        this.des_mas = des_mas;
        this.vac_mas = vac_mas;
        this.id_estado = id_estado;
    }
*/
    public int getId_mas() {
        return id_mas;
    }

    public void setId_mas(int id_mas) {
        this.id_mas = id_mas;
    }

    public String getNom_mas() {
        return nom_mas;
    }

    public void setNom_mas(String nom_mas) {
        this.nom_mas = nom_mas;
    }

    public String getRaza_mas() {
        return raza_mas;
    }

    public void setRaza_mas(String raza_mas) {
        this.raza_mas = raza_mas;
    }

    public String getEdad_mas() {
        return edad_mas;
    }

    public void setEdad_mas(String edad_mas) {
        this.edad_mas = edad_mas;
    }

    public String getDes_mas() {
        return des_mas;
    }

    public void setDes_mas(String des_mas) {
        this.des_mas = des_mas;
    }

    public String getSexo_mas() {
        return sexo_mas;
    }

    public void setSexo_mas(String sexo_mas) {
        this.sexo_mas = sexo_mas;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }
}
