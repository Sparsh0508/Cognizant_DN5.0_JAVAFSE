CREATE OR REPLACE PROCEDURE AddNewCustomer(
    p_CustomerID IN NUMBER,
    p_CustomerName IN VARCHAR2,
    p_Balance IN NUMBER
) AS
BEGIN
    INSERT INTO Customers(CustomerID, CustomerName, Balance)
    VALUES (p_CustomerID, p_CustomerName, p_Balance);

    COMMIT;

EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        DBMS_OUTPUT.PUT_LINE('Customer ID already exists.');
        ROLLBACK;
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
        ROLLBACK;
END;
/
