package org.example;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader restroReader = Files.newBufferedReader(Paths.get("/Users/subodhthakur/IdeaProjects/shardaswiggy/data/restro.rtf"));
        BufferedReader dishReader = Files.newBufferedReader(Paths.get("/Users/subodhthakur/IdeaProjects/shardaswiggy/data/dish.rtf"));
        ArrayList<Restro> restaurant = new ArrayList<>();

        String line ="";
        String dishline="";
        for (int i = 0; (line =restroReader.readLine()) != null; i++) {
            String[] restarr = line.split(",");
            Restro rest = new Restro(restarr[0],restarr[1]);
            restaurant.add(rest);


        }

        for(int i =0;(line = dishReader.readLine()) != null;i++){
            String[] disharr = line.split(",");
              for(Restro r : restaurant){
                  if(r.getRestroId().equals(disharr[0])){
                      r.addDishes(disharr[0],disharr[1],disharr[2],Integer.parseInt(disharr[3]));
                  }
              }
//            Dish dish = new Dish(disharr[0],disharr[1],disharr[2],Integer.parseInt(disharr[3]));

        }
        System.out.println("welcome to sharda swiggy !");
        System.out.println("*******************************");
        System.out.println("choose 1 for browsing through the menu and 2 for searching");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String i = input.readLine();
        switch (Integer.parseInt(i)){
            case 1:{
                for(Restro r : restaurant){
                    System.out.println(r);
                    for(Dish d : r.dishes){
                        System.out.println(d);
                    }
                    System.out.println("*******************************");
                }
            }
            break;
            case 2:{
                System.out.println("under maintainence");
            }

        }

    }
}



