package pe.edu.i202220880.cl1_jpa_data_villagaray_josue.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "city")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "District", nullable = false)
    private String district;

    @Column(name = "Population", nullable = false)
    private Integer population;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country country;
}
