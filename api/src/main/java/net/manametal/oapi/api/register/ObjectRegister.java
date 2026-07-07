package net.manametal.oapi.api.register;

import com.google.common.collect.Sets;

import java.util.Objects;
import java.util.Set;

public class ObjectRegister<T> {
  private final Set<T> objectSet = Sets.newHashSet();

  public void register(T object) {
    Objects.requireNonNull(object);
    objectSet.add(object);
  }

  public void unregister(T object) {
    Objects.requireNonNull(object);
    objectSet.remove(object);
  }

  public boolean find(T object) {
    return Objects.nonNull(object) && objectSet.contains(object);
  }
}
