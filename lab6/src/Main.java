import dao.InMemoryWorldDao;
import domain.City;
import domain.Country;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance();
    final Map<String, Country> countries = worldDao.getCountries();

    // Highest Populations city in every Country
    System.out.println("######################  Highest Population City in Each Country  ###############################");
    countries.values().stream().map((country) -> Map.entry(country.getName(), country.getCities().stream().max(Comparator.comparingInt(City::getPopulation))))
        .filter((entry) -> entry.getValue().isPresent())
        .map((entry) -> Map.entry(entry.getKey(), entry.getValue().get()))
        .forEach(entry -> System.out.println(entry.getKey() + " \t=>\t" + entry.getValue()));

    // Highest Populated city in Each Continent
    System.out.println("\n######################  Highest Populated City in Each Continent  ###############################");
    countries.values().stream().collect(Collectors.groupingBy(Country::getContinent))
        .entrySet().stream()
        .map(entry -> Map.entry(entry.getKey(),
            entry.getValue().stream().map(Country::getCities)
                .reduce(new ArrayList<>(), (dest, src) -> {
                  dest.addAll(src);
                  return dest;
                })
        ))
        .map(entry -> Map.entry(entry.getKey(),
            entry.getValue().stream().max(Comparator.comparingInt(City::getPopulation))
        ))
        .filter(entry -> entry.getValue().isPresent())
        .map(entry -> Map.entry(entry.getKey(), entry.getValue().get()))
        .forEach(entry -> System.out.println(entry.getKey() + " \t=>\t" + entry.getValue()));

    System.out.println("\n######################  Highest Populated Capital  ###############################");
    Map.Entry<String, City> highestPopulatedCapital = countries.values().stream()
        .map(cntry -> Map.entry(
            cntry.getName(),
            cntry.getCities().stream().filter(city -> city.getId() == cntry.getCapital()).findFirst()
        ))
        .filter(entry -> entry.getValue().isPresent())
        .map(entry -> Map.entry(entry.getKey(), entry.getValue().get()))
        .max(Map.Entry.comparingByValue(Comparator.comparingInt(City::getPopulation)))
        .orElse(null);

    if (null != highestPopulatedCapital) {
      System.out.println(highestPopulatedCapital);
    } else {
      System.out.println("Capital is Null");
    }
  }
}