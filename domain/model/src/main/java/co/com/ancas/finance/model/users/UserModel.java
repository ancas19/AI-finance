package co.com.ancas.finance.model.users;
public class UserModel {
    private Long id;
    private String email;
    private String pasword;
    private Long personId;

    public UserModel() {
    }

    public UserModel(Long id, String email, String pasword, Long personId) {
        this.id = id;
        this.email = email;
        this.pasword = pasword;
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

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }
}
