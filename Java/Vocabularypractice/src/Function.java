import java.util.*;

import java.io.*;

public class Function implements Learnword_function {
    Scanner scnr=new Scanner(System.in);
    boolean is_Continue=true;
    boolean is_Correct=true;
    HashMap<String,String>ErrorList=new HashMap<>();

    @Override
    public void practice( HashMap<String,String> Vocabulary){
        System.out.println("Please enter english explaination, Press 0 to exit ");
        while(is_Continue){
            for(String Germanword:Vocabulary.keySet()){
                System.out.println();
                System.out.println(Germanword);
                String input=scnr.next().trim();
                String answer=Vocabulary.get(Germanword);

                if(input.equalsIgnoreCase(answer)){
                    is_Correct=true;
                    System.out.println("Good job!^_^");
                }
                if(!(input.equalsIgnoreCase(answer))){
                    is_Correct=false;
                    System.out.println("Sorry, it's wriong >_<.");
                    ErrorList.put(Germanword,answer);

                }
                if(input.equalsIgnoreCase("0")){
                    System.out.println("Exit");
                    is_Continue=false;
                    break;
                }
            }

            is_Continue=false;
        }

    }

    @Override
    public void PrintErrorList(){
        int count=1;
        Map<String, String> sortedByKey = new TreeMap<>(ErrorList);
        System.out.println();
        System.out.println("This is your Errorlist");
        for(Map.Entry <String,String> entry:ErrorList.entrySet()){
            String key=entry.getKey();
            String value= entry.getValue();
            System.out.println(count+" "+key+": "+value);
            count+=1;
        }
    }
    public HashMap<String, String> getErrorList() {
        return ErrorList;
    }

    public void saveErrorListToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Map.Entry<String, String> entry : ErrorList.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.newLine();
            }
            System.out.println("ErrorList saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Failed to save ErrorList: " + e.getMessage());
        }
    }
}
