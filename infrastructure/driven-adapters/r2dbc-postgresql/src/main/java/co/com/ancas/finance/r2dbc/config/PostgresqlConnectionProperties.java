package co.com.ancas.finance.r2dbc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "adapters.r2dbc")
public class PostgresqlConnectionProperties {
    private String host;
    private Integer port;
    private String database;
    private String schema;
    private String username;
    private String password;
    private Integer connectTimeout;
    private boolean sslEnabled;
    private Integer poolSize;
    private Integer maxSize;
    private Integer maxIdleTime;
    private Integer maxLifeTime;
    private Integer maxAcquireTime;
    private Integer maxCreateConnectionTime;
    private String validationQuery = "SELECT 1";

    public PostgresqlConnectionProperties() {
    }

    // -------------------------
    // Getters & Setters
    // -------------------------
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

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public boolean isSslEnabled() {
        return sslEnabled;
    }

    public void setSslEnabled(boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
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

    public Integer getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(Integer maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public Integer getMaxAcquireTime() {
        return maxAcquireTime;
    }

    public void setMaxAcquireTime(Integer maxAcquireTime) {
        this.maxAcquireTime = maxAcquireTime;
    }

    public Integer getMaxCreateConnectionTime() {
        return maxCreateConnectionTime;
    }

    public void setMaxCreateConnectionTime(Integer maxCreateConnectionTime) {
        this.maxCreateConnectionTime = maxCreateConnectionTime;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }
}