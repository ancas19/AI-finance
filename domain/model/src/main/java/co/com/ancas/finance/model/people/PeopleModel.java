package co.com.ancas.finance.model.people;
public class PeopleModel {
    private Long id;
    private String names;
    private String lastNames;
    private String dni;
    private String cellphone;

    public PeopleModel() {
    }

    public PeopleModel(Long id, String names, String lastNames, String dni, String cellphone) {
        this.id = id;
        this.names = names;
        this.lastNames = lastNames;
        this.dni = dni;
        this.cellphone = cellphone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
