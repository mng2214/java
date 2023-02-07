package RecapJava;

import java.util.HashMap;
import java.util.Map;

public class MapRecap {

    /*
    INTERVIEW QUESTIONS:

    1-Can you tell me about map and where do you use map in your project?

    *Map is an awesome interface to be used in my project to share/store the data as KEY AND VALUE

    2-What is the connection between map and collection?

    To be honest, I would say it is a combination of collections. List refers to the VALUE of the map (value can be dublicates)
                                                                  Set refers to the KEY of the map (key needs to be unique)

    3-What is the type of map?

    HashMap-->random order
    LinkedHashMap-->insertion order
    TreeMap -->ascending order

    4-What is synchronization? can you give examples and what do you know about ?

     -->It executes any actions one by one.

     -->As you know we have two most common concepts in java -->HashTable and StringBuffer

       They are synchronized --> THREAD SAFE ************* -->
       Non synchronize --> MAP,SET,LIST --> NOT- THREAD SAFE ***********


     */



        /*
        HOMEWORK:
          String[] fruits = {"Apple","Banana","Peach","Orange","Apple","Strawberry","Banana","Apple","Cherry","Orange"}
          TASK:I want you get te output of totall item for each
           {Apple=3,Banana=2 ...etc}

           TIPS:You can use a method from map --> ContainsKey
           TIPS:you can use if condition

         */
        public static void main(String[] args) {
            Map<String,Integer> counts=new HashMap<>();
            String[] fruits = {"Apple","Banana","Peach","Orange","Apple","Strawberry","Banana","Apple","Cherry","Orange"};

            for(String fruit:fruits){
                if(!counts. containsKey(fruit)){
                    counts.put(fruit,1);
                }else{
                    counts.put(fruit,counts.get(fruit)+1);
                }
            }
            System.out.println(counts);
        }




















    }

