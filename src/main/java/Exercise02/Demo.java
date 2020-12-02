package Exercise02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
// Chua viet duoc la neu b bang khong thi chua xu li duoc
public class Demo {
    public static void main(String[] args) {
      ArrayList<Fraction> Fractions = new ArrayList<>();
      Fractions.add(new Fraction(1,2));
      Fractions.add(new Fraction(2,3));
      Fractions.add(new Fraction(4,16));

      Fraction sum = new Fraction(0,1);

      for(Fraction Fraction:Fractions){
        sum = sum.minimal().plus(Fraction);
      }
      System.out.println("Tong la : " + sum);

      Fractions.sort(new Comparator<Fraction>() {
        @Override
        public int compare(Fraction o1, Fraction o2) {
          return o1.getA()*o2.getB() - o2.getA()*o1.getB();
        }
      });

      System.out.println("Danh sach sap xep la : ");
      for( Fraction Fraction:Fractions){
        System.out.println(Fraction.minimal());
      }
    }
    }

