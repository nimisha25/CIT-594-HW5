public class Term implements ITerm {

    // TODO: instance variables
    String term;
    long weight;

    /**
     * Initialize a Term with a given query String and weight
     */
    public Term(String term, long weight) {
        if (term == null || weight<0) {
            throw new IllegalArgumentException("Term cannot be null");
        }
        this.term=term;
        this.weight = weight;
    }

    // =================
    // TODO: Overrides!
    // =================
    @Override
    public int compareTo(ITerm that) {
        return this.term.compareTo(that.getTerm());
    }

    @Override
    public String toString() {
        return this.weight + '\t' + this.term;
    }

    @Override
    public long getWeight() {
        return this.weight;
    }

    @Override
    public String getTerm() {
        return term;
    }

    @Override
    public void setWeight(long weight) {
        this.weight = weight;
    }

    @Override
    public String setTerm(String term) {
        return this.term=term;
    }


}
