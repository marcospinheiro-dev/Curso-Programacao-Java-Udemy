package com.udemy.oitoComposicao.entities;

import com.udemy.oitoComposicao.entitiesEnum.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level; //Nível do trabalhador
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

//    Esse método tem q ser removido para que não altere a lista instanciada.

//    public void setContracts(List<HourContract> contracts) {
//        this.contracts = contracts;
//    }

    public void addContract(HourContract contract) { // Adiciona um contrato
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) { // Remove um contrato
        contracts.remove(contract);
    }

    public double income(int year, int month) { // ganho do trabalhador
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if(year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
