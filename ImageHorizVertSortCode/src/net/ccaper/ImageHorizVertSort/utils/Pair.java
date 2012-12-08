package net.ccaper.ImageHorizVertSort.utils;

public class Pair<FIRST, SECOND> {
  private final FIRST first;
  private final SECOND second;

  public Pair(FIRST first, SECOND second) {
    this.first = first;
    this.second = second;
  }

  public FIRST getFirst() {
    return first;
  }

  public SECOND getSecond() {
    return second;
  }

  @Override
  public int hashCode() {
    return first.hashCode() ^ second.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    if (o == null)
      return false;
    if (!(o instanceof Pair))
      return false;
    Pair<?, ?> pair = (Pair<?, ?>) o;
    return this.first.equals(pair.getFirst())
        && this.second.equals(pair.getSecond());
  }
}
