package org.wso2.carbon.is.migration.util;

public class SQLQueries {
    public static final String SELECT_FROM_ACCESS_TOKEN = "SELECT ACCESS_TOKEN, TOKEN_SCOPE, AUTHZ_USER FROM " +
            "IDN_OAUTH2_ACCESS_TOKEN";

    public static final String INSERT_SCOPE_ASSOCIATION = "INSERT INTO IDN_OAUTH2_SCOPE_ASSOCIATION (TOKEN_ID, " +
            "TOKEN_SCOPE) VALUES (?, ?)";

    public static final String INSERT_TOKEN_SCOPE_HASH = "UPDATE IDN_OAUTH2_ACCESS_TOKEN SET TOKEN_SCOPE_HASH=? WHERE" +
            " ACCESS_TOKEN=?";

    public static final String INSERT_TOKEN_ID = "UPDATE IDN_OAUTH2_ACCESS_TOKEN SET TOKEN_ID=? WHERE ACCESS_TOKEN=?";

    public static final String UPDATE_USER_NAME = "UPDATE IDN_OAUTH2_ACCESS_TOKEN SET AUTHZ_USER=?, TENANT_ID=?, " +
            "USER_DOMAIN=? WHERE ACCESS_TOKEN=?";

    public static final String DROP_TOKEN_SCOPE_COLUMN = "ALTER TABLE IDN_OAUTH2_ACCESS_TOKEN DROP COLUMN TOKEN_SCOPE";

    public static final String SET_ACCESS_TOKEN_PRIMARY_KEY = "ALTER TABLE IDN_OAUTH2_ACCESS_TOKEN ADD PRIMARY KEY " +
            "(TOKEN_ID)";

    public static final String SET_SCOPE_ASSOCIATION_PRIMARY_KEY = "ALTER TABLE IDN_OAUTH2_SCOPE_ASSOCIATION ADD " +
            "FOREIGN KEY (TOKEN_ID) REFERENCES IDN_OAUTH2_ACCESS_TOKEN(TOKEN_ID) ON DELETE CASCADE";

    public static final String ALTER_TOKEN_ID_NOT_NULL_ORACLE = "ALTER TABLE IDN_OAUTH2_ACCESS_TOKEN MODIFY TOKEN_ID " +
            "VARCHAR2 (255) NOT NULL";

    public static final String ALTER_TOKEN_ID_NOT_NULL_MYSQL = "ALTER TABLE IDN_OAUTH2_ACCESS_TOKEN MODIFY TOKEN_ID " +
            "VARCHAR (255) NOT NULL";

    public static final String SELECT_FROM_AUTHORIZATION_CODE = "SELECT AUTHORIZATION_CODE, AUTHZ_USER FROM " +
            "IDN_OAUTH2_AUTHORIZATION_CODE";

    public static final String UPDATE_USER_NAME_AUTHORIZATION_CODE = "UPDATE IDN_OAUTH2_AUTHORIZATION_CODE SET AUTHZ_USER=?, TENANT_ID=?, " +
            "USER_DOMAIN=? WHERE ACCESS_TOKEN=?";

}
