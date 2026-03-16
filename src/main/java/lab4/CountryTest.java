package lab4;

import static java.lang.IO.println;

public class CountryTest {

    static void main() {
        Country unknownCountry = new Country();
        unknownCountry.displayInfo();

        Country country1 = new Country("Франція", "Париж", 68, "Євро");
        country1.displayInfo();

        Country country2 = new Country("Японія", "Токіо", 122, "Єна");
        country2.displayInfo();

        Country countryWithBiggerPopulation = country1.comparePopulation(country2) == 1 ? country1 : country2;
        println("Країна з більшим населенням: %s".formatted(countryWithBiggerPopulation.getName()));

        Country country3 = new Country();
        country3.setName("Італія");
        country3.setCapital("Рим");
        country3.setPopulation(59);
        country3.setCurrency("Євро");
        country3.displayInfo();

        country3 = country1;
        country3.setCurrency("Долар");

        //country1 і country3 вказують на той самий об'єкт, тому в обох випадках виводиться змінене значення
        country3.displayInfo();
        country1.displayInfo();

        country2.updatePopulation(130);
    }
}
