import java.util.Scanner;

// Super clase Vehiculo
class Vehiculo {
    private String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método reponer/reparar
    public void Reparar(String pieza) {
        System.out.println("Reponiendo/Reparando " + pieza + " para el vehículo " + tipo);
    }
}

// Subclases de Vehiculo
class Coche extends Vehiculo {
    public Coche() {
        super("Coche");
    }
}

class Moto extends Vehiculo {
    public Moto() {
        super("Moto");
    }
}

class Camion extends Vehiculo {
    public Camion() {
        super("Camión");
    }
}

class Tractor extends Vehiculo {
    public Tractor() {
        super("Tractor");
    }
}

class Grua extends Vehiculo {
    public Grua() {
        super("Grua");
    }
}

