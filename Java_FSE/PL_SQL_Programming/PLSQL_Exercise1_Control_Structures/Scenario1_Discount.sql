BEGIN
    FOR rec IN (
        SELECT c.CustomerID, c.Age, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
    )
    LOOP
        IF rec.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;
        END IF;
    END LOOP;

    COMMIT;
END;
/
