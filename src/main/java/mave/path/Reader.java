package mave.path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IllegalFormatFlagsException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Reader {

    //replacing the values in the template with whats in the csv
    //creating array of the read template file to identify arrays that need to be swapped
    public String replace(String s){
        String[] fields = s.split("");
        if(Arrays.asList(fields).contains("__address__")){
            fields["__address__"] = [0];
        }
        
        

        

        

        
        
        
        switch(){

        }
        return null;
        
    }
   

}

  
