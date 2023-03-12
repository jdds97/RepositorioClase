public enum Nacionalidades {
    ESP("España"),
    GBR("Reino Unido"),
    USA("Estados Unidos"),
    PRT("Portugal");

    private String nombrePais;

    private Nacionalidades(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public static Nacionalidades fromNombrePais(String nombrePais) {
        for (Nacionalidades n : values()) {
            if (n.nombrePais.equalsIgnoreCase(nombrePais)) {
                return n;
            }
        }
        throw new IllegalArgumentException("Nacionalidad desconocida: " + nombrePais);
    }
}
