import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();

        //Add method
        names.add("Stephen");
        names.add("Ivan");
        names.add("Jacob");
        names.add("Christine");
        names.add("Clare");

        //Remove
        names.remove("Jacob");

        //Set
        names.set(1, "Alex");

        //Get && Size
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}
