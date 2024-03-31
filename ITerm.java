import java.util.Comparator;

/**
 * @author ericfouh
 */
public interface ITerm
        extends Comparable<ITerm>
{

    /**
     * Compares the two terms in descending order by weight.
     *
     * @return comparator Object
     */
    public static Comparator<ITerm> byReverseWeightOrder()
    {
        return new Comparator<ITerm>() {
            @Override
            public int compare(ITerm t1, ITerm t2) {
                // Assuming weight is positive. Reverse order so subtract t2 from t1
                return Long.compare(t2.getWeight(), t1.getWeight());
            }
        };
    }


    /**
     * Compares the two terms in lexicographic order but using only the first r
     * characters of each query.
     *
     * @param
     * @return comparator Object
     */
    public static Comparator<ITerm> byPrefixOrder(int r)
    {
        if(r < 0) {
            throw new IllegalArgumentException();
        }
        return new Comparator<ITerm>() {
            @Override
            public int compare(ITerm t1, ITerm t2) {
                String prefix1 = t1.getTerm().length() > r ? t1.getTerm().substring(0, r) : t1.getTerm();
                String prefix2 = t2.getTerm().length() > r ? t2.getTerm().substring(0, r) : t2.getTerm();
                return prefix1.compareTo(prefix2);
            }
        };
    }

    // Compares the two terms in lexicographic order by query.
    public int compareTo(ITerm that);


    // Returns a string representation of this term in the following format:
    // the weight, followed by a tab, followed by the query.
    public String toString();

    // Required getters.
    public long getWeight();
    public String getTerm();

    // Required setters (mostly for autograding purposes)
    public void setWeight(long weight);
    public String setTerm(String term);

}
