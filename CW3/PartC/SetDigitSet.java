import java.util.HashSet;
import java.util.Set;

public class SetDigitSet {
    private Set<String> setDigitSet;
    private int size;

    public SetDigitSet(String[] inputSets) {
        setDigitSet = new HashSet<>();
        for (String set : inputSets) {
            setDigitSet.add(set);
            size++;
        }
    }

    public int size() {
        return size;
    }
	
	
	// CW3 Part C.3

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object other) {
		if(this == null & other == null)
        {
            return  true;
        }
		
		return  false;
    }

}
