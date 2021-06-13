package com.hackaton.hackatondonatessystem.dto;

import com.hackaton.hackatondonatessystem.domain.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@NoArgsConstructor
public class CauseDTO {

    private Long id;

    @NotEmpty(message="Field title is required")
    private String title;

    @NotEmpty(message="Field description is required")
    private String description;

    @NotEmpty(message="Field valueDonated is required")
    private Long valueDonated;

    @NotEmpty(message="Field goal is required")
    private Double goal;

    @NotEmpty(message="Field minimumDonationPf is required")
    private Long minimumDonationPf;

    @NotEmpty(message="Field minimumDonationPj is required")
    private Long minimumDonationPj;

    @NotEmpty(message="Field sector is required")
    private SectorDTO sector;

    @NotEmpty(message="Field representative is required")
    private MemberDTO representative;


    public CauseDTO(Cause cause) {
        this.id = cause.getId();
        this.title = cause.getTitle();
        this.description = cause.getDescription();
        this.valueDonated = cause.getValueDonated();
        this.goal = cause.getGoal();
        this.minimumDonationPf = cause.getMinimumDonationPf();
        this.minimumDonationPj = cause.getMinimumDonationPj();
        this.sector = new SectorDTO(cause.getSector());
        this.representative = new MemberDTO(cause.getRepresentative());
    }
}
