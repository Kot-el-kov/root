package com.github.kotelkov.pms.dao;

import com.github.kotelkov.pms.configuration.annotation.ConfigClass;
import com.github.kotelkov.pms.configuration.annotation.ConfigProperty;
import com.github.kotelkov.pms.inject.annotation.Component;

@ConfigClass
@Component
public class Database implements DatabaseInterface{

    @ConfigProperty(configName = "app.properties", propertyName = "my.param.db")
    private String someText;
    @Override
    public String doTask() {
        return someText;
    }
}
