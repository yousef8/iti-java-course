import dao.InMemoryWorldDao;
import domain.City;
import domain.Country;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    // Highest Populated city in Each Continent
    System.out.println("\n######################  Highest Populated City in Each Continent  ###############################");
    countries.values().stream().collect(Collectors.groupingBy(Country::getContinent))
        .entrySet().stream()
        .map(entry -> Map.entry(entry.getKey(),
            entry.getValue().stream().map(Country::getCities)
                .reduce(new ArrayList<City>(), (dest, src) -> {
                  dest.addAll(src);
                  return dest;
                })
        ))
        .map(entry -> Map.entry(entry.getKey(),
            entry.getValue().stream().max(Comparator.comparingInt(City::getPopulation))
            ))
        .filter(entry -> entry.getValue().isPresent())
        .map(entry -> Map.entry(entry.getKey(), entry.getValue().get()))
        .forEach(entry -> System.out.println(entry.getKey() + "\t=>\t" + entry.getValue()));


  }
}