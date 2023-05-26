package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksTest {
    @Test
    public void matchInSimpleTask() {
        SimpleTask task = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = task.matches("Позвонить");
        assertEquals(expected, actual);
    }

    @Test
    public void matchInEpic() {
        Epic epic = new Epic(55, new String[]{"Молоко, Яйца, Хлеб"});

        boolean expected = false;
        boolean actual = epic.matches("Печеньки");
        assertEquals(expected, actual);
    }

    @Test
    public void matchInMeeting() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        boolean expected = true;
        boolean actual = meeting.matches("Выкатка");
        assertEquals(expected, actual);
    }
}

