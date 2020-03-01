package advancedJavaTwo;

public class ComparableExecutor {
    public static void main(String[] args) {
        Comparable<Integer> comparable = new Comparable<Integer>(){
            
            @Override
            public int compareTo(Integer o) {
                return 0;
            }
        };
        Comparable<Integer> comparable1 = o -> 0;
    }
}
