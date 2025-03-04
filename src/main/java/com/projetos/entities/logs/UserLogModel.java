package com.projetos.entities.logs;

import com.projetos.constants.enums.OperationEnum;
import com.projetos.constants.enums.UserTypeEnum;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb501_user_log")
public class UserLogModel extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idLog;
    public Long idUser;
    public String name;
    private String username;
    private String password;
    private String email;
    private UserTypeEnum userType;
    private Timestamp operationDateTime;
    private OperationEnum operation;
}
