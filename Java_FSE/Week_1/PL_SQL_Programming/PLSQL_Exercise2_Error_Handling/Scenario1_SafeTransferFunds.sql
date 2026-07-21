CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    p_FromAccount IN NUMBER,
    p_ToAccount   IN NUMBER,
    p_Amount      IN NUMBER
) AS
    v_Balance NUMBER;
BEGIN
    SELECT Balance INTO v_Balance
    FROM Accounts
    WHERE AccountID = p_FromAccount
    FOR UPDATE;

    IF v_Balance < p_Amount THEN
        RAISE_APPLICATION_ERROR(-20001,'Insufficient funds.');
    END IF;

    UPDATE Accounts
    SET Balance = Balance - p_Amount
    WHERE AccountID = p_FromAccount;

    UPDATE Accounts
    SET Balance = Balance + p_Amount
    WHERE AccountID = p_ToAccount;

    COMMIT;

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/
