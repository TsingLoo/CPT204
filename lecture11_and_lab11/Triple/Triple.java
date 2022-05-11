public class Triple<T extends Comparable<T>, S extends Comparable<S>, U extends Comparable<U>>
        implements Comparable<Triple<T, S, U>> {

    private T first;
    private S second;
    private U third;

    public Triple(T firstElement, S secondElement, U thirdElement) {
        first = firstElement;
        second = secondElement;
        third =  thirdElement;
    }

    public T getFirst() { return first; }
    public S getSecond() { return second; }
    public U getThird() { return third; }


    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    // CODING ASSIGNMENT 11.1  COMPARETO

    @Override
    public int compareTo(Triple<T, S, U> other) {
        if(this.first.compareTo(other.first)==0){
            if(this.second.compareTo(other.second)==0){
                if(this.third.compareTo(other.third)==0){
                    return 0;
                }
                return this.third.compareTo(other.third);
            }
            return this.second.compareTo(other.second);
        }
        return this.first.compareTo(other.first);
    }

}