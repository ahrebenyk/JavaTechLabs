package lab4;

import static java.lang.IO.println;

public class Country {
    private String name;
    private String capital;
    private int population;
    private String currency;

    public Country() {
        name = "Невідомо";
        capital = "Невідомо";
        population = 0;
        currency = "Невідомо";
    }

    public Country(String name, String capital, int population, String currency) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.currency = currency;
    }

    public void displayInfo() {
        println("Країна: %s\nСтолиця: %s\nНаселення: %s млн\nВалюта: %s\n".formatted(name, capital, population, currency));
    }

    public int comparePopulation(Country other) {
        if (population > other.getPopulation()) {
            return 1;
        }
        if (population < other.getPopulation()) {
            return -1;
        }
        return 0;
    }

    public void updatePopulation(int newValue) {
        int oldValue = population;
        population = newValue;
        println("Населення країни %s оновлено: %s -> %s".formatted(name, oldValue, newValue));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
