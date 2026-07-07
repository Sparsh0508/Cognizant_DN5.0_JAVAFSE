CREATE OR REPLACE PACKAGE EmployeeManagement AS
    PROCEDURE HireEmployee(
        p_EmpID NUMBER,
        p_EmpName VARCHAR2,
        p_Salary NUMBER);

    PROCEDURE UpdateEmployee(
        p_EmpID NUMBER,
        p_Salary NUMBER);

    FUNCTION CalculateAnnualSalary(
        p_EmpID NUMBER) RETURN NUMBER;
END EmployeeManagement;
/

CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

    PROCEDURE HireEmployee(
        p_EmpID NUMBER,
        p_EmpName VARCHAR2,
        p_Salary NUMBER) IS
    BEGIN
        INSERT INTO Employees(EmployeeID, EmployeeName, Salary)
        VALUES (p_EmpID, p_EmpName, p_Salary);
    END;

    PROCEDURE UpdateEmployee(
        p_EmpID NUMBER,
        p_Salary NUMBER) IS
    BEGIN
        UPDATE Employees
        SET Salary = p_Salary
        WHERE EmployeeID = p_EmpID;
    END;

    FUNCTION CalculateAnnualSalary(
        p_EmpID NUMBER) RETURN NUMBER IS
        v_Salary NUMBER;
    BEGIN
        SELECT Salary INTO v_Salary
        FROM Employees
        WHERE EmployeeID = p_EmpID;
        RETURN v_Salary * 12;
    END;

END EmployeeManagement;
/
