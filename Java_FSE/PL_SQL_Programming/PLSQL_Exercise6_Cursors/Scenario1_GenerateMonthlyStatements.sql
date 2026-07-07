SET SERVEROUTPUT ON;

DECLARE
    CURSOR GenerateMonthlyStatements IS
        SELECT CustomerID, TransactionID, TransactionType, Amount, TransactionDate
        FROM Transactions
        WHERE TRUNC(TransactionDate,'MM') = TRUNC(SYSDATE,'MM');
BEGIN
    FOR rec IN GenerateMonthlyStatements LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Customer ID: ' || rec.CustomerID ||
            ', Transaction ID: ' || rec.TransactionID ||
            ', Type: ' || rec.TransactionType ||
            ', Amount: ' || rec.Amount ||
            ', Date: ' || TO_CHAR(rec.TransactionDate,'DD-MON-YYYY')
        );
    END LOOP;
END;
/
