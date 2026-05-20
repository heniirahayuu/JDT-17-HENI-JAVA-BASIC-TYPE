package com.indivaragroup.activitys.dto;

public class ToDoListDTO {
     String taskId;
     String task;
     String assignee;
     String priority;
     String status;
     int estimatedHour;
     int actualHour;
     int weight;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTask() {
        return task;
    }

    public void setTitle(String title) {
        this.task = title;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEstimatedHour() {
        return estimatedHour;
    }

    public void setEstimatedHour(int estimatedHour) {
        this.estimatedHour = estimatedHour;
    }

    public int getActualHour() {
        return actualHour;
    }

    public void setActualHour(int actualHour) {
        this.actualHour = actualHour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
