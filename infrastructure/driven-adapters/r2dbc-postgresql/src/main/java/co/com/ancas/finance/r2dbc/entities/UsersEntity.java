package co.com.ancas.finance.r2dbc.entities;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Table(name = "users")
public class UsersEntity extends AuditEntity {
    @Id
    @Column("id")
    private Long id;
    @Column("email")
    private String email;
    @Column("password")
    private String password;
    @Column("person_id")
    private Long personId;

    public UsersEntity(){

    }

    public UsersEntity(String createdBy, String updatedBy, LocalDateTime createdAt, LocalDateTime updatedAt, Long id, String email, String password, Long personId) {
        super(createdBy, updatedBy, createdAt, updatedAt);
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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder{
        private Long id;
        private String email;
        private String password;
        private Long personId;
        private String createdBy;
        private String updatedBy;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder personId(Long personId) {
            this.personId= personId;
            return this;
        }


        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public UsersEntity build(){
            return new UsersEntity(this.createdBy,this.updatedBy,this.createdAt,this.updatedAt,this.id,this.email,this.password,this.personId);
        }
    }
}
