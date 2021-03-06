package com.kodilla.hibernate.taskList.repository;

import com.kodilla.hibernate.taskList.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

  @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, "7");
        taskListRepository.save(taskList);
        int description = taskList.getId();

        //When
        List<TaskList> readTasksList = taskListRepository.findByListName(DESCRIPTION);

        //Then
        Assert.assertEquals(1, readTasksList.size());

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
