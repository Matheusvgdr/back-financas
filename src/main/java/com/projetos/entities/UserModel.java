package com.projetos.entities;

import com.projetos.constants.enums.UserTypeEnum;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb001_user")
public class UserModel extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    public Long id;

    @Column()
    public String name;

    @Column( unique = true)
    private String username;

    @Column()
    private String password;

    @Column()
    private String email;

    @Column()
    private UserTypeEnum userType;

}
