CREATE OR REPLACE PACKAGE CustomerManagement AS
    PROCEDURE AddCustomer(
        p_CustomerID NUMBER,
        p_CustomerName VARCHAR2,
        p_Balance NUMBER);

    PROCEDURE UpdateCustomer(
        p_CustomerID NUMBER,
        p_CustomerName VARCHAR2);

    FUNCTION GetCustomerBalance(
        p_CustomerID NUMBER) RETURN NUMBER;
END CustomerManagement;
/

CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

    PROCEDURE AddCustomer(
        p_CustomerID NUMBER,
        p_CustomerName VARCHAR2,
        p_Balance NUMBER) IS
    BEGIN
        INSERT INTO Customers(CustomerID, CustomerName, Balance)
        VALUES (p_CustomerID, p_CustomerName, p_Balance);
    END;

    PROCEDURE UpdateCustomer(
        p_CustomerID NUMBER,
        p_CustomerName VARCHAR2) IS
    BEGIN
        UPDATE Customers
        SET CustomerName = p_CustomerName
        WHERE CustomerID = p_CustomerID;
    END;

    FUNCTION GetCustomerBalance(
        p_CustomerID NUMBER) RETURN NUMBER IS
        v_Balance NUMBER;
    BEGIN
        SELECT Balance INTO v_Balance
        FROM Customers
        WHERE CustomerID = p_CustomerID;
        RETURN v_Balance;
    END;

END CustomerManagement;
/
