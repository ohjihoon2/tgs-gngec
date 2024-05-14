package io.tgsinc.tgsgngec.domain.admin.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "usr")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uidx")
    private Long uidx;

    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String pswdEncpt;

    @Column(nullable = false)
    private String role;

}
