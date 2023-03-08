package uz.aliymahad.aliymahad.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import uz.aliymahad.aliymahad.enums.AuthProvider;
import uz.aliymahad.aliymahad.enums.Language;
import uz.aliymahad.aliymahad.enums.UserStatus;

import static jakarta.persistence.EnumType.ORDINAL;
import static jakarta.persistence.EnumType.STRING;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity<String>{
   private String phoneNumber;

   private String email;

   private String password;


   @Enumerated(STRING)
   private AuthProvider authProvider;

   @Column(columnDefinition = "int default 1")
   private Integer roles;

   @Enumerated(ORDINAL)
   private UserStatus status;

   @Enumerated(STRING)
   @Column(nullable = false, columnDefinition = "varchar(3) default 'UZB'")
   private Language language;

   private String imageURL;

}