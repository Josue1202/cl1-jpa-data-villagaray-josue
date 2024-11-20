package pe.edu.i202220880.cl1_jpa_data_villagaray_josue.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "country")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Code", length = 3)
    private String code;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Continent", nullable = false)
    private String continent;

    @Column(name = "Region", nullable = false)
    private String region;

    @Column(name = "SurfaceArea", nullable = false)
    private Double surfaceArea;

    @Column(name = "IndepYear")
    private Integer indepYear;

    @Column(name = "Population", nullable = false)
    private Integer population;

    @Column(name = "LifeExpectancy")
    private Double lifeExpectancy;

    @Column(name = "GNP")
    private Double gnp;

    @Column(name = "GNPOld")
    private Double gnpOld;

    @Column(name = "LocalName", nullable = false)
    private String localName;

    @Column(name = "GovernmentForm", nullable = false)
    private String governmentForm;

    @Column(name = "HeadOfState")
    private String headOfState;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<City> cities;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CountryLanguage> languages;
}
