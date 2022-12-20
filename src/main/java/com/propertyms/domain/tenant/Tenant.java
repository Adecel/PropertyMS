package com.propertyms.domain.tenant;

import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Setter
@Getter
@ToString
@Entity
public class Tenant {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String username;
    @NotNull
    private String firstname;
}
