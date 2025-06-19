import java.util.*;


public class VocabularyList implements VocabularyList_Method{
    HashMap<String,String> VocabularyList=new HashMap<>();
    List<String> GermanList=new ArrayList<>();
    Scanner scnr=new Scanner(System.in);
    boolean is_Continue;


    @Override
    public void Initialise(){
            VocabularyList.put("Apfel","apple");
            VocabularyList.put("Tschüss","Bye");
            VocabularyList.put("blau","blue");
            VocabularyList.put("weiß","white");
            VocabularyList.put("drei","three");
            System.out.println("This is the default list: ");
            ShowList();
            System.out.println();
    }

    @Override
    public void ShowList(){
        int count=1;
        Map<String, String> sortedByKey = new TreeMap<>(VocabularyList);
        for(Map.Entry <String,String> entry:VocabularyList.entrySet()){
            String key=entry.getKey();
            String value= entry.getValue();
            System.out.println(count+" "+key+": "+value);
            count+=1;
        }
        System.out.println();
    }

    @Override
    public void Addword(){
        System.out.println();
        is_Continue=true;

        while(is_Continue){
            System.out.println("Please Enter the word you want to add to your List: ");
            System.out.println("Enter German word: ");
            String German=scnr.next().trim();
            System.out.println("Enter English explaination: ");
            String English=scnr.next().trim();

            VocabularyList.put(German,English);
            System.out.println(German+" --> "+English+" Succeed added");
            System.out.println();

            System.out.println("Add more word? Y:yes, N:No ");
            String continue_answer=scnr.next();
           switch(continue_answer){
               case "Y":
               case"y":is_Continue=true;
               break;

               case "N":
               case "n":is_Continue=false;
               break;
               default:System.out.println("Please enter Y or N");
               is_Continue=false;
               break;


           }
        }
    }

    @Override
    public void ListGermanWord(){
        GermanList.addAll(VocabularyList.keySet());
        GermanList.sort((o1,o2)->o1.compareTo(o2));
        System.out.println();
        for(String GermanList:GermanList){
            System.out.println(GermanList);
        }
    }


    }

