package eu.sirotin.example.tuple;

import java.util.Objects;

/**
 * Class-container for pairs with different types by both components.
 * Can be imagines as vector with different componebt types.
 * @param <A> Type for first component.
 * @param <B> Type fo second component.
 */
public class Tuple2<A, B> {
	public final A _1;
	public final B _2;
	
	public Tuple2(A t, B u) {
	    _1 = Objects.requireNonNull(t);
	    _2 = Objects.requireNonNull(u);
	}
	
	@Override
	public boolean equals(Object o) {
	    if (!(o instanceof Tuple2))
	      return false;
	    else {
	      @SuppressWarnings("rawtypes")
	      Tuple2 that = (Tuple2) o;
	      return _1.equals(that._1) && _2.equals(that._2);
	    }
	}
	  
	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + _1.hashCode();
	    result = prime * result + _2.hashCode();
	    return result;
	}
}
