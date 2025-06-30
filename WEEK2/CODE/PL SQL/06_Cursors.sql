-- Exercise 6: Cursors

-- Scenario 1
DECLARE
  CURSOR cur IS SELECT * FROM Transactions WHERE TransactionDate >= TRUNC(SYSDATE, 'MM');
BEGIN
  FOR rec IN cur LOOP
    DBMS_OUTPUT.PUT_LINE('Statement for Account ID: ' || rec.AccountID);
  END LOOP;
END;
/

-- Scenario 2
DECLARE
  CURSOR cur IS SELECT * FROM Accounts;
BEGIN
  FOR rec IN cur LOOP
    UPDATE Accounts SET Balance = Balance - 100 WHERE AccountID = rec.AccountID;
  END LOOP;
END;
/

-- Scenario 3
DECLARE
  CURSOR cur IS SELECT * FROM Loans;
BEGIN
  FOR rec IN cur LOOP
    UPDATE Loans SET InterestRate = InterestRate * 1.02 WHERE LoanID = rec.LoanID;
  END LOOP;
END;
/