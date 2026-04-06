package co.com.ancas.finance.model.users;

public class UserCreationModel {
    private String names;
    private String lastNames;
    private String dni;
    private String cellphone;
    private String email;
    private String password;

    public UserCreationModel() {
    }

    public UserCreationModel(String names, String lastNames, String dni, String cellphone, String email, String password) {
        this.names = names;
        this.lastNames = lastNames;
        this.dni = dni;
        this.cellphone = cellphone;
        this.email = email;
        this.password = password;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
