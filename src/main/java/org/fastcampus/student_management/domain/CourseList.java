package org.fastcampus.student_management.domain;

import java.util.List;

public class CourseList {

    private final List<Course> courses;

    public CourseList(List<Course> courses) {
        this.courses = courses;
    }

    public void changedCourseFee(int fee) {
        for (Course course : courses) {
            if (course.getDayOfWeek() == DayOfWeek.SATURDAY || course.getDayOfWeek() == DayOfWeek.SUNDAY) {
                fee = (int) (fee * 1.5);
            }
            course.changeFee(fee);
        }
    }
}
