-- Exercise 1: Control Structures

-- Scenario 1
BEGIN
  FOR rec IN (SELECT * FROM Customers) LOOP
    IF MONTHS_BETWEEN(SYSDATE, rec.DOB)/12 > 60 THEN
      UPDATE Loans SET InterestRate = InterestRate - 1 WHERE CustomerID = rec.CustomerID;
    END IF;
  END LOOP;
END;
/

-- Scenario 2
BEGIN
  FOR rec IN (SELECT * FROM Customers) LOOP
    IF rec.Balance > 10000 THEN
      UPDATE Customers SET IsVIP = 'TRUE' WHERE CustomerID = rec.CustomerID;
    END IF;
  END LOOP;
END;
/

-- Scenario 3
BEGIN
  FOR rec IN (SELECT * FROM Loans WHERE EndDate <= SYSDATE + 30) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan for Customer ID ' || rec.CustomerID || ' is due soon.');
  END LOOP;
END;
/