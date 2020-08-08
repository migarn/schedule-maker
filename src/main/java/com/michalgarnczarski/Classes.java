package com.michalgarnczarski;

public class Classes {

    private String title;
    private String teacher;
    private int weeklyHours;
    private String category;
    private Group forWhomMandatory;
    private boolean everyTwoWeeks;
    private Classroom classroom;
    private ClassesTime classesTime;


    public Classes(String title, String teacher, int weeklyHours, boolean everyTwoWeeks) {
        this.title = title;
        this.teacher = teacher;
        this.weeklyHours = weeklyHours;
        this.everyTwoWeeks = everyTwoWeeks;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setForWhomMandatory(Group forWhomMandatory) {
        this.forWhomMandatory = forWhomMandatory;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public void setClassesTime(ClassesTime classesTime) {
        this.classesTime = classesTime;
    }

    public String getTitle() {
        return title;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getWeeklyHours() {
        return weeklyHours;
    }

    public String getCategory() {
        return category;
    }

    public Group getForWhomMandatory() {
        return forWhomMandatory;
    }

    public boolean isEveryTwoWeeks() {
        return everyTwoWeeks;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public ClassesTime getClassesTime() {
        return classesTime;
    }
}
