package fr.myt.learning.petclinicclone.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

  protected Map<ID, T> map = new HashMap<>();

  T findById(ID id) {
    return map.get(id);
  }

  Set<T> findAll() {
    return new HashSet<>(map.values());
  }

  T save(ID id, T data) {
    map.put(id, data);
    return data;
  }

  void deleteById(ID id) {
    map.remove(id);
  }

  void delete(T data) {
    map.entrySet().removeIf(entrie -> entrie.getValue().equals(data));
  }
}
