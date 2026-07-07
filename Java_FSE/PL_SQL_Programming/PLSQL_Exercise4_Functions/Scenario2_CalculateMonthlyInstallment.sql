CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_LoanAmount IN NUMBER,
    p_InterestRate IN NUMBER,
    p_Years IN NUMBER
) RETURN NUMBER
AS
    v_MonthlyRate NUMBER;
    v_Months NUMBER;
    v_EMI NUMBER;
BEGIN
    v_MonthlyRate := p_InterestRate / (12 * 100);
    v_Months := p_Years * 12;

    IF v_MonthlyRate = 0 THEN
        v_EMI := p_LoanAmount / v_Months;
    ELSE
        v_EMI := p_LoanAmount * v_MonthlyRate *
                 POWER(1 + v_MonthlyRate, v_Months) /
                 (POWER(1 + v_MonthlyRate, v_Months) - 1);
    END IF;

    RETURN ROUND(v_EMI, 2);
END;
/
