package co.com.ancas.finance.r2dbc.entities;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Table(name = "people")
public class PeopleEntity extends AuditEntity {
    @Id
    @Column("id")
    private Long id;
    @Column("names")
    private String names;
    @Column("last_names")
    private String lastNames;
    @Column("dni")
    private String dni;
    @Column("cellphone")
    private String cellphone;

    public PeopleEntity() {
    }

    public PeopleEntity(String createdBy, String updatedBy, LocalDateTime createdAt, LocalDateTime updatedAt, Long id, String names, String lastNames, String dni, String cellphone) {
        super(createdBy, updatedBy, createdAt, updatedAt);
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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder{
        private Long id;
        private String names;
        private String lastNames;
        private String dni;
        private String cellphone;
        private String createdBy;
        private String updatedBy;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder names(String names) {
            this.names = names;
            return this;
        }

        public Builder lastNames(String lastNames) {
            this.lastNames = lastNames;
            return this;
        }

        public Builder dni(String dni) {
            this.dni = dni;
            return this;
        }

        public Builder cellphone(String cellphone) {
            this.cellphone = cellphone;
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

        public PeopleEntity build(){
            return new PeopleEntity(this.createdBy,this.updatedBy,this.createdAt,this.updatedAt,this.id,this.names,this.lastNames,this.dni,this.cellphone);
        }
    }


}
