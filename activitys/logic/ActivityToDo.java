package com.indivaragroup.activitys.logic;

import com.indivaragroup.activitys.dto.ToDoListDTO;
import java.util.ArrayList;

public class ActivityToDo {

    public void main() {
        ArrayList<ToDoListDTO> todoList = new ArrayList<>();
        ToDoListDTO todo1 = new ToDoListDTO();
        todo1.setTaskId("TASK-001");
        todo1.setTask("Belajar Java");
        todo1.setAssignee("There");
        todo1.setPriority("High");
        todo1.setStatus("In Progress");
        todo1.setEstimatedHour(4);
        todo1.setActualHour(2);
        todo1.setWeight(40);
        todoList.add(todo1);

        ToDoListDTO todo2 = new ToDoListDTO();
        todo2.setTaskId("TASK-002");
        todo2.setTask("Mengerjakan Tugas");
        todo2.setAssignee("There");
        todo2.setPriority("Medium");
        todo2.setStatus("Done");
        todo2.setEstimatedHour(3);
        todo2.setActualHour(3);
        todo2.setWeight(30);
        todoList.add(todo2);

        ToDoListDTO todo3 = new ToDoListDTO();
        todo3.setTaskId("TASK-003");
        todo3.setTask("Olahraga");
        todo3.setAssignee("There");
        todo3.setPriority("Low");
        todo3.setStatus("Open");
        todo3.setEstimatedHour(2);
        todo3.setActualHour(0);
        todo3.setWeight(20);
        todoList.add(todo3);

        ToDoListDTO todo4 = new ToDoListDTO();
        todo4.setTaskId("TASK-004");
        todo4.setTask("Code Review");
        todo4.setAssignee("Reviewer");
        todo4.setPriority("Critical");
        todo4.setStatus("Ready Review");
        todo4.setEstimatedHour(2);
        todo4.setActualHour(1);
        todo4.setWeight(10);
        todoList.add(todo4);

        int totalWeight = 0;
        double progressWeight = 0;
        int workload = 0;

        System.out.println("=========== TO DO LIST ===========");

        for (ToDoListDTO todo : todoList) {

            int progress = 0;

            if (todo.getStatus().equals("Open")) {
                progress = 0;
            } else if (todo.getStatus().equals("In Progress")) {
                progress = 50;
            } else if (todo.getStatus().equals("Ready Review")) {
                progress = 80;
            } else if (todo.getStatus().equals("Done")) {
                progress = 100;
            }

            int variance = todo.getActualHour() - todo.getEstimatedHour();

            if (
                    todo.getStatus().equals("Open") ||
                            todo.getStatus().equals("In Progress") ||
                            todo.getStatus().equals("Ready Review")
            ) {
                workload += todo.getEstimatedHour();
            }

            totalWeight += todo.getWeight();
            progressWeight += todo.getWeight() * progress / 100.0;

            System.out.println("Task ID : " + todo.getTaskId());
            System.out.println("Task : " + todo.getTask());
            System.out.println("Assignee : " + todo.getAssignee());
            System.out.println("Priority : " + todo.getPriority());
            System.out.println("Status : " + todo.getStatus());
            System.out.println("Progress : " + progress + "%");
            System.out.println("Estimated Hour : " + todo.getEstimatedHour());
            System.out.println("Actual Hour : " + todo.getActualHour());
            System.out.println("Variance : " + variance + " jam");
            System.out.println("Weight : " + todo.getWeight());
            System.out.println();
        }

        // =========================
        // PROJECT SUMMARY
        // =========================
        double projectProgress = progressWeight / totalWeight * 100;

        String overallStatus;
        if (projectProgress == 0) {
            overallStatus = "Not Started";
        } else if (projectProgress == 100) {
            overallStatus = "Completed";
        } else {
            overallStatus = "In Progress";
        }

        System.out.println("=========== PROJECT SUMMARY ===========");
        System.out.println("Project Progress     : " + projectProgress + "%");
        System.out.println("Workload Remaining   : " + workload + " jam");
        System.out.println("Estimated Completion : " + workload + " jam");
        System.out.println("Overall Status       : " + overallStatus);
    }
}