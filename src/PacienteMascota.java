import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PacienteMascota {
private String nombremascota;
private Especie especie;
private int pesoideal;
private String nombreDueno;
private LocalDate fechaProximavacuna;
private static String nombreRedVeterinaria = "VetPlus";

public PacienteMascota(String nombremascota, Especie especie, int pesoideal, String nombreDueno, LocalDate fechaProximavacuna) {
    this.nombremascota = nombremascota;
    this.especie = especie;
    this.pesoideal = pesoideal;
    this.nombreDueno = nombreDueno;
    this.fechaProximavacuna = fechaProximavacuna;
}
public String getNombreMascota() {
    return nombremascota;
}
public void setNombreMascota(String nombremascota) {
    this.nombremascota = nombremascota;
}
public long DiasParaVacuna () {
    LocalDate hoy = LocalDate.now();
    long dias = ChronoUnit.DAYS.between(fechaProximavacuna, hoy);
    //System.out.println(dias);
    return dias;
}
public static String Actualizarnombrered(String nuevoNombre) {
    nuevoNombre = "Letirinaria";
    return nuevoNombre;
}
public Especie getEspecie() {
    return especie;
}
public void setEspecie(Especie especie) {
    this.especie = especie;
}
public int getPesoideal() {
    return pesoideal;
}
public void setPesoideal(int pesoideal) {
    this.pesoideal = pesoideal;
}
public String getNombreDueno() {
    return nombreDueno;
}
public void setNombreDueno(String nombreDueno) {
    this.nombreDueno = nombreDueno;
}

    @Override
    public String toString() {
        return "PacienteMascota{" +
                "nombremascota='" + nombremascota + '\'' +
                ", especie=" + especie +
                ", pesoideal=" + pesoideal +
                ", nombreDueno='" + nombreDueno + '\'' +
                ", fechaProximavacuna=" + fechaProximavacuna +
                '}';
    }
}
