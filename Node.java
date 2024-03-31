/**
 * @author Harry Smith
 */

public class Node {

    private Term term;
    private int words; //is 0 or 1
    private int prefixes;
    private Node[] references;

    /**
     * Initialize a Node with an empty string and 0 weight; useful for
     * writing tests.
     */
    public Node() {
        // TODO!
        this.term = new Term("", 0);
    }

    /**
     * Initialize a Node with the given query string and weight.
     * @throws IllegalArgumentException if query is null or if weight is negative.
     */
    public Node (String query, long weight) {
        if(query == null || weight < 0) {
            throw new IllegalArgumentException();
        }
        this.term = new Term(query, weight);

    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public int getWords() {
        return words;
    }

    public void setWords(int words) {
        this.words = words;
    }

    public int getPrefixes() {
        return prefixes;
    }

    public void setPrefixes(int prefixes) {
        this.prefixes = prefixes;
    }

    public Node[] getReferences() {
        return references;
    }

    public void setReferences(Node[] references) {
        this.references = references;
    }
}
