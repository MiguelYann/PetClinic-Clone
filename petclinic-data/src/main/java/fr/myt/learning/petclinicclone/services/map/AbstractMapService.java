package fr.myt.learning.petclinicclone.services.map;

import fr.myt.learning.petclinicclone.domain.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    T findById(ID id) {
        return map.get(id);
    }

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T save(T data) {
        if (data.getId() == null) {
            data.setId(nextId());
            map.put(data.getId(), data);
        } else {
            throw new RuntimeException("Cannot be null");
        }

        return data;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T data) {
        map.entrySet().removeIf(entrie -> entrie.getValue().equals(data));
    }

    private Long nextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;

            return nextId;

        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;

    }
}
