package co.com.ancas.finance.r2dbc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "adapters.r2dbc")
public class PostgresqlConnectionProperties{
    private String host;
    private Integer port;
    private String database;
    private String schema;
    private String username;
    private String password;
    private Integer poolSize;
    private Integer maxSize;
    private Integer maxIdleTime;
    private String validationQuery;

    public PostgresqlConnectionProperties() {
    }

    public PostgresqlConnectionProperties(String host, Integer port, String database, String schema, String username, String password, Integer poolSize, Integer maxSize, Integer maxIdleTime, String validationQuery) {
        this.host = host;
        this.port = port;
        this.database = database;
        this.schema = schema;
        this.username = username;
        this.password = password;
        this.poolSize = poolSize;
        this.maxSize = maxSize;
        this.maxIdleTime = maxIdleTime;
        this.validationQuery = validationQuery;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(Integer poolSize) {
        this.poolSize = poolSize;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public Integer getMaxIdleTime() {
        return maxIdleTime;
    }

    public void setMaxIdleTime(Integer maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }
}
