package com.school.dao;

import java.util.List;
public interface ITemplate<T,ID> {
	T save(T student);

    T delete(ID id);

    T edit(T student);

    T getById(ID id);

    List<T> filterByFieldName(String fieldName, Object value);

    List<T> list();
}
