package pe.edu.i202220880.cl1_jpa_data_villagaray_josue;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202220880.cl1_jpa_data_villagaray_josue.entity.Country;
import pe.edu.i202220880.cl1_jpa_data_villagaray_josue.repository.CountryRepository;

import java.util.Arrays;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataVillagarayJosueApplication implements CommandLineRunner {


	@Autowired
	CountryRepository countryRepository;
	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataVillagarayJosueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/**
		 * ifPresentOrElse()
		 */
//		Optional<Country> optionalArg = countryRepository.findById("ARG");
//		optionalArg.ifPresentOrElse(
//				(argCountry) -> {
//					argCountry.getLanguages().forEach(language -> System.out.println("Idioma: " + language.getLanguage()));
//				},
//				() -> {
//					Optional<Country> optionalPer = countryRepository.findById("PER");
//					optionalPer.ifPresent(perCountry -> perCountry.getLanguages().forEach(language -> System.out.println("Idioma: " + language.getLanguage())));
//				}
//		);

		/**
		 * deleteAllById()
		 */
		countryRepository.deleteAllById(Arrays.asList("COL", "ARG"));

		// Vuelve a ejecutar la consulta
		Optional<Country> optionalArgAfterDelete = countryRepository.findById("ARG");
		optionalArgAfterDelete.ifPresentOrElse(
				(argCountry) -> {
					argCountry.getLanguages().forEach(language -> System.out.println("Idioma: " + language.getLanguage()));
				},
				() -> {
					Optional<Country> optionalPerAfterDelete = countryRepository.findById("PER");
					optionalPerAfterDelete.ifPresent(perCountry -> perCountry.getLanguages().forEach(language -> System.out.println("Idioma: " + language.getLanguage())));
				}
		);


	}
}