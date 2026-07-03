DECLARE
    CURSOR ApplyAnnualFee IS
        SELECT AccountID FROM Accounts;
    v_Fee NUMBER := 100;
BEGIN
    FOR rec IN ApplyAnnualFee LOOP
        UPDATE Accounts
        SET Balance = Balance - v_Fee
        WHERE AccountID = rec.AccountID;
    END LOOP;

    COMMIT;
END;
/
