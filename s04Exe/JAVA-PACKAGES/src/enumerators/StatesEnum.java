package enumerators;

public enum StatesEnum { // ## https://www.devmedia.com.br/tipos-enum-no-java/25729 ## //
    DF ("Distrito Federal",    1), // ## duas propriedades name e taxRegion ## //
    GO ("Goiás",               1),
    MS ("Mato Grosso do Sul",  1),
    MT ("Mato Grosso",         1),
    TO ("Tocantins",           1),
    AC ("Acre",                2),
    AM ("Amazonas",            2),
    AP ("Amapá",               2),
    PA ("Pará",                2),
    RO ("Rondônia",            2),
    RR ("Roraima",             2),
    CE ("Ceará",               3),
    MA ("Maranhão",            3),
    PI ("Piauí",               3),
    AL ("Alagoas",             4),
    PB ("Paraíba",             4),
    PE ("Pernambuco",          4),
    RN ("Rio Grande do Norte", 4),
    BA ("Bahia",               5),
    SE ("Sergipe",             5),
    MG ("Minas Gerais",        6),
    ES ("Espírito Santo",      7),
    RJ ("Rio de Janeiro",      7),
    SP ("São Paulo",           8),
    PR ("Paraná",              9),
    SC ("Santa Catarina",      9),
    RS ("Rio Grande do Sul",   0);

    private String stateName;
    public String getStateName() {
        return stateName;
    }
    private int taxRegion;
    public int getTaxRegion() {
        return taxRegion;
    }
    private StatesEnum(String stateName, int taxRegion) {
        this.stateName = stateName;
        this.taxRegion = taxRegion;
    }
}