public class ConcatDemo
{
    public static void main(String[] args)
    {
        String animal1 = " quick brown fox";
        String animal2 = " lazy dog";
        String article = "the";
        String action = " jumps over ";
        String carrier1 = article.concat(animal1);
        String carrier2 = action.concat(article);
        String carrier3 = carrier1.concat(carrier2);
        String carrier4 = carrier3.concat(animal2);
        System.out.println(carrier4);
    }
}