package com.projetos.services;

import com.projetos.entities.logs.UserLogModel;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LogService {
    public void saveUserLog(UserLogModel userLog) {
        UserLogModel.persist(userLog);
    }
}
