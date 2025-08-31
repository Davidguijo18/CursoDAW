package U4.tarea1.Ejercicio6;

public class CuentaCorriente {
    private double saldo;
    private double limiteDescubrimiento;

    public String nombre;
    protected String dni;

    private String banco;

    Banco bancoClase = new Banco();

    public CuentaCorriente() {
    }

    public CuentaCorriente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        saldo = 0;
        limiteDescubrimiento = -50;
    }

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        limiteDescubrimiento = 0;
    }

    public CuentaCorriente(double saldo, int limiteDescubrimiento, String dni) {
        this.saldo = saldo;
        this.limiteDescubrimiento = limiteDescubrimiento;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteDescubrimiento() {
        return limiteDescubrimiento;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setLimiteDescubrimiento(double limiteDescubrimiento) {
        this.limiteDescubrimiento = limiteDescubrimiento;
    }

    public boolean sacarDinero(double dinero) {
        boolean resultado;

        if (dinero < limiteDescubrimiento + saldo) {
            saldo -= dinero;
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public void ingresarDinero(double dinero) {
        saldo = saldo + dinero;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Dni del cliente: " + dni);
        System.out.println("Saldo de la cuenta: " + saldo);
        System.out.println("El limite es: " + limiteDescubrimiento);
    }
}

