CREATE OR REPLACE PACKAGE AccountOperations AS
    PROCEDURE OpenAccount(
        p_AccountID NUMBER,
        p_CustomerID NUMBER,
        p_Balance NUMBER);

    PROCEDURE CloseAccount(
        p_AccountID NUMBER);

    FUNCTION GetTotalBalance(
        p_CustomerID NUMBER) RETURN NUMBER;
END AccountOperations;
/

CREATE OR REPLACE PACKAGE BODY AccountOperations AS

    PROCEDURE OpenAccount(
        p_AccountID NUMBER,
        p_CustomerID NUMBER,
        p_Balance NUMBER) IS
    BEGIN
        INSERT INTO Accounts(AccountID, CustomerID, Balance)
        VALUES (p_AccountID, p_CustomerID, p_Balance);
    END;

    PROCEDURE CloseAccount(
        p_AccountID NUMBER) IS
    BEGIN
        DELETE FROM Accounts
        WHERE AccountID = p_AccountID;
    END;

    FUNCTION GetTotalBalance(
        p_CustomerID NUMBER) RETURN NUMBER IS
        v_Total NUMBER;
    BEGIN
        SELECT NVL(SUM(Balance),0)
        INTO v_Total
        FROM Accounts
        WHERE CustomerID = p_CustomerID;

        RETURN v_Total;
    END;

END AccountOperations;
/
