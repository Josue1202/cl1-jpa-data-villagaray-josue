package pe.edu.i202220880.cl1_jpa_data_villagaray_josue.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "countrylanguage")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CountryLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("countryCode")
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country CountryCode;
    private Boolean Language;
    private Double IsOfficial;
    private Double Percentage;


}
