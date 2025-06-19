public class Application {
    public static void main(String[] args) {
        VocabularyList vl=new VocabularyList();
        Function fun=new Function();
        vl.Initialise();


        vl.ListGermanWord();

        vl.Addword();
        vl.ShowList();

       fun.practice(vl.VocabularyList);
       fun.PrintErrorList();

       fun.saveErrorListToFile("error_list.txt");
    }
}
