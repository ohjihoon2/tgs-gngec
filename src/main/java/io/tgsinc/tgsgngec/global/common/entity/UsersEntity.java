package io.tgsinc.tgsgngec.global.common.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "usr")
public class UsersEntity {

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
