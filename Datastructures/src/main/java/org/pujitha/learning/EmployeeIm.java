package org.pujitha.learning;

import java.util.Date;

public final class EmployeeIm {
    private final String empName;
    private final Integer empId;
    private final Date dateOfJoining;

    public EmployeeIm(String empName, Integer empId, Date doj) {
        this.empId = empId;
        this.empName = empName;
        this.dateOfJoining = doj;
    }


}
