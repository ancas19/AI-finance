package co.com.ancas.finance.model.users;
public class UserModel {
    private Long id;
    private String email;
    private String password;
    private Long personId;

    public UserModel() {
    }

    public UserModel(Long id, String email, String password, Long personId) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.personId = personId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }
}
