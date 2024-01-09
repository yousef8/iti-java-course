import dao.InMemoryWorldDao;
import domain.City;
import domain.Country;

import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance();
        final Map<String, Country> countries = worldDao.getCountries();
        final Map<Integer, City> cities = worldDao.getCities();

        Stream<Country> countriesStream = countries.values().stream();
        countriesStream.filter(country -> country.getPopulation() > 1_000_000_000).forEach(System.out::println);

    }
    }