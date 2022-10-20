package com.odegaa.projections;

import com.odegaa.models.Employee;
import com.odegaa.models.Warehouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(types = Employee.class)
public interface EmployeeProjection {
    String getName();
    String getSurname();
    String getPhone();
    String getCode();

    List<Warehouse> getWarehouse();

    Boolean getStatus();
}
