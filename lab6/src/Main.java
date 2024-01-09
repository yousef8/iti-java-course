import dao.InMemoryWorldDao;
import domain.City;
import domain.Country;

import java.util.Comparator;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance();
    final Map<String, Country> countries = worldDao.getCountries();

    // Highest Populations city in every Country
    System.out.println("######################  Highest Population City in Each Country  ###############################");
    countries.values().stream().map((country) -> Map.entry(country.getName(), country.getCities().stream().max(Comparator.comparingInt(City::getPopulation))))
        .filter((entry) -> entry.getValue().isPresent())
        .map((entry) -> Map.entry(entry.getKey(), entry.getValue().get()))
        .forEach(System.out::println);
  }
}