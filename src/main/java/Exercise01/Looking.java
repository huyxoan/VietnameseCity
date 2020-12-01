package Exercise01;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Looking {

    public static void main(String[] args) throws IOException {
        readInformation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so bat ky : ");
        int n = sc.nextInt();

        System.out.println("Nhap mot ten bat ky : ");
        String a = sc.nextLine();

    }

    private static void readInformation() throws IOException {
        String json = Files.readString(Path.of("Cities.json"));
        List<City> cities = new Gson().fromJson(json , new TypeToken<List<City>>(){}.getType());


        for(City city:cities){
            System.out.println(city);
            System.out.println("----------------");
        }
    }
}
