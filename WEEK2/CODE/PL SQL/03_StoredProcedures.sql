-- Exercise 3: Stored Procedures

-- Scenario 1
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE Accounts SET Balance = Balance * 1.01 WHERE AccountType = 'Savings';
END;
/

-- Scenario 2
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(p_dept VARCHAR2, p_bonus NUMBER) IS
BEGIN
  UPDATE Employees SET Salary = Salary + (Salary * p_bonus / 100) WHERE Department = p_dept;
END;
/

-- Scenario 3
CREATE OR REPLACE PROCEDURE TransferFunds(p_from NUMBER, p_to NUMBER, p_amount NUMBER) IS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from;
  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20004, 'Insufficient balance.');
  END IF;
  UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_from;
  UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_to;
  COMMIT;
END;
/