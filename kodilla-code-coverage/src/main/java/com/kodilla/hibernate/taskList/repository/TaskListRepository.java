package com.kodilla.hibernate.taskList.repository;

import com.kodilla.hibernate.taskList.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public interface TaskListRepository extends CrudRepository<TaskList, Integer> {
    List<TaskList> findByListName(String listName);
}
