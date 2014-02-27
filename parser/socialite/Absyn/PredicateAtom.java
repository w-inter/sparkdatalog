package socialite.Absyn; // Java Package generated by the BNF Converter.

public class PredicateAtom extends Predicate {
  public final Atom atom_;

  public PredicateAtom(Atom p1) { atom_ = p1; }

  public <R,A> R accept(socialite.Absyn.Predicate.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof socialite.Absyn.PredicateAtom) {
      socialite.Absyn.PredicateAtom x = (socialite.Absyn.PredicateAtom)o;
      return this.atom_.equals(x.atom_);
    }
    return false;
  }

  public int hashCode() {
    return this.atom_.hashCode();
  }


}
