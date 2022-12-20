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
public class TenantAccount {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tenantId;
    @NotNull
    private int accountId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TenantAccount that)) return false;
        return getTenantId() == that.getTenantId() && getAccountId() == that.getAccountId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTenantId(), getAccountId());
    }
}
