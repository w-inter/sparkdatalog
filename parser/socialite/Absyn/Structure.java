package socialite.Absyn; // Java Package generated by the BNF Converter.

public abstract class Structure implements java.io.Serializable {
  public abstract <R,A> R accept(Structure.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(socialite.Absyn.Struct p, A arg);

  }

}
