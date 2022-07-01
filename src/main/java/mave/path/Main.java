package mave.path;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    //Instantiating reader class to use methods
    static Reader fresh = new Reader();

    public static void main(String[] args) throws IOException {

        // read the csv file that comes in
        String dataFile = args[0];
        FileReader reader = new FileReader(dataFile);
        BufferedReader br = new BufferedReader(reader);
        Map<String, ArrayList<Object>> dataSet = new HashMap<>();

        //reading the csv file and throwing in the values into an object list
        //creating map to put in the key(first name) and values(last name, address, years)
        String line = "";
        while (line != null) {
            line =br.readLine();
            String[] terms = line.split(",");
            ArrayList<Object> list = new ArrayList<Object>();
            list.add(terms[1]);
            list.add(terms[2]);
            list.add(terms[3]);
        dataSet.put(terms[0], list);
        //System.out.printf("%s\n", dataSet);
        }

        // read the template file that comes in
        String template = args[1];
        FileReader fileReader = new FileReader(template);
        BufferedReader brr = new BufferedReader(fileReader);

        String words = "";
        while (words != null) {
            words = brr.readLine();
            //converting array fo strings using transform method
           String [] transformed = fresh.transform(words);


            for (String s:transformed){
                if("__first_name__".equals(s)){

                    
                    
                }
            }

            
        }
   
    }

}
