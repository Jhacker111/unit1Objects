public class TrimIt
{
    public static void main(String[] args)
    {
        String sentence1 = "      abc   ";
        String sentence2 = "   def";
        String sentence3 = "ghi         ";
        String sentence_1 = sentence1.trim();
        String sentence_2 = sentence2.trim();
        String sentence_3 = sentence3.trim();
        System.out.println(sentence_1 + sentence_2 + sentence_3);
    }
}