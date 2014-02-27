package socialite.Absyn; // Java Package generated by the BNF Converter.

public class TermValue extends Term {
  public final Value value_;

  public TermValue(Value p1) { value_ = p1; }

  public <R,A> R accept(socialite.Absyn.Term.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof socialite.Absyn.TermValue) {
      socialite.Absyn.TermValue x = (socialite.Absyn.TermValue)o;
      return this.value_.equals(x.value_);
    }
    return false;
  }

  public int hashCode() {
    return this.value_.hashCode();
  }


}
