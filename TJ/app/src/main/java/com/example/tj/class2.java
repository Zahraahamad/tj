package com.example.tj;

public class class2 {
    private String job;
    private int image;
    private int salary;
    private String company;

    public class2(String job, int image, int salary, String company) {
        this.job = job;
        this.image = image;
        this.salary = salary;
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
