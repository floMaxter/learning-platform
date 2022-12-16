package ru.vdovin.learningproject.OOPLearningApp.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabasePersonConfig {
    public static final String PROPERTY_PREFIX = "app.dbone.datasource";
    public static final String JPA_REPOSITORY_PACKAGE = "dev.struchkov.example.multipledatabases.repository.dbone";
    public static final String ENTITY_PACKAGE = "dev.struchkov.example.multipledatabases.domain.entity.dbone";
    public static final String ENTITY_MANAGER_FACTORY = "oneEntityManagerFactory";
    public static final String DATA_SOURCE = "oneDataSource";
    public static final String DATABASE_PROPERTY = "oneDatabaseProperty";
    public static final String TRANSACTION_MANAGER = "oneTransactionManager";
}
