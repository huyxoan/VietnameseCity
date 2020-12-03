package Exercise01;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Looking {



    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Danh sach sap xep thanh pho : ");
        List<City> cities = loadCities();
        printOrderByName(cities);
        System.out.print("Nhap ten thanh pho : ");
        String name = sc.nextLine();
        System.out.println("Ten cac thanh pho ; ");
        searchByName(cities, name);

        System.out.print("Nhap ten thanh pho  : ");
        String name1 = sc.nextLine();

        List<District> districts = loadDistricts();
          if(districts.contains(name1));
        System.out.println("Ten cac huyen la :");
        searchDistrict(districts);


    }

    private static List<City> loadCities() throws IOException {
        String json = Files.readString(Path.of("Cities.json"));
        return new Gson().fromJson(json , new TypeToken<List<City>>(){}.getType());
    }
    private static List<District> loadDistricts() throws IOException {
        String json = Files.readString(Path.of("Cities.json"));
        return new Gson().fromJson(json , new TypeToken<List<District>>(){}.getType());
    }
    
    

    private static void searchDistrict(List<District> districts ){
        ArrayList<District> Found = new ArrayList<>();
        for( District district:districts ){
            if(district.getName().toLowerCase().contains(district.getName().toLowerCase()));
            Found.add(district);
        }
       printDistrict(Found);
    }

    private static void searchByName(List<City> cities, String name){
        ArrayList<City> found = new ArrayList<>();
        for(City city: cities){
            if(city.getName().toLowerCase().contains(name.toLowerCase())){
                found.add(city);
            }
        }

        printOrderByName(found);
    }
    

    private static void printOrderByName(List<City> cities){
        cities.sort(new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {

                return o1.getName().compareTo(o2.getName());
            }
        });

        for(City city: cities){
            System.out.println(city);
        }
    }

    private static void printDistrict(ArrayList<District> districts) {
        districts.sort(new Comparator<District>() {
            @Override
            public int compare(District o1, District o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for(District district:districts){
            System.out.println(district);
        }
    }


}
