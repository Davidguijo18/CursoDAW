package U9.tarea2;

public class Employee {
    private String numeroEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private String extension;
    private String email;
    private String numeroOficina;
    private String reportsTo;
    private String jobTittle;

    public Employee(String numeroEmpleado, String nombreEmpleado, String apellidoEmpleado, String extension, String email, String numeroOficina, String reportsTo, String jobTittle) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.extension = extension;
        this.email = email;
        this.numeroOficina = numeroOficina;
        this.reportsTo = reportsTo;
        this.jobTittle = jobTittle;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroOficina() {
        return numeroOficina;
    }

    public void setNumeroOficina(String numeroOficina) {
        this.numeroOficina = numeroOficina;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getJobTittle() {
        return jobTittle;
    }

    public void setJobTittle(String jobTittle) {
        this.jobTittle = jobTittle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "numeroEmpleado='" + numeroEmpleado + '\'' +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", apellidoEmpleado='" + apellidoEmpleado + '\'' +
                ", extension='" + extension + '\'' +
                ", email='" + email + '\'' +
                ", numeroOficina='" + numeroOficina + '\'' +
                ", reportsTo='" + reportsTo + '\'' +
                ", jobTittle='" + jobTittle + '\'' +
                '}';
    }
}
