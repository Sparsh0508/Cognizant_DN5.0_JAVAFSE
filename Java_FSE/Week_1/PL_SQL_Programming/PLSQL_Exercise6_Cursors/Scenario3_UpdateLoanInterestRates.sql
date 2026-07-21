DECLARE
    CURSOR UpdateLoanInterestRates IS
        SELECT LoanID, InterestRate
        FROM Loans;
BEGIN
    FOR rec IN UpdateLoanInterestRates LOOP
        UPDATE Loans
        SET InterestRate = rec.InterestRate + 0.5
        WHERE LoanID = rec.LoanID;
    END LOOP;

    COMMIT;
END;
/
