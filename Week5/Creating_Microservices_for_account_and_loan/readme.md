# 🏦 Microservices Hands-on Exercise 

This exercise covers building two independent Spring Boot microservices for a bank:

- `Account Service` – to handle account details
- `Loan Service` – to handle loan details

Both services are built using **Spring Boot** with **no database connectivity** (dummy data only).

---

## Folder Structure

C:
└── <employee_id>
└── microservices
├── account
└── loan\


---

## Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Boot DevTools
- Maven (Embedded in Eclipse)
- Eclipse or Spring Tool Suite (STS)

---

## 📦 Account Microservice

**Port:** `8080`  
**Base Package:** `com.cognizant.account`

### ➤ Endpoint
Loan Microservice
Port: 8081
Base Package: com.cognizant.loan

➤ Endpoint

GET /loans/{number}
➤ Sample Response
json

{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
Running the Microservices in Eclipse
✅ Step 1: Import Projects
Go to: File → Import → Maven → Existing Maven Projects

Browse to the account and loan directories

✅ Step 2: Build Project
Right-click on each project → Run As → Maven build...

In Goals, type:
clean package

✅ Step 3: Run Services
Right-click AccountApplication.java → Run As → Java Application

Right-click LoanApplication.java → Run As → Java Application

Use the monitor icon in Eclipse’s Console View to switch between service outputs.

Testing the APIs
Microservice	URL
Account	http://localhost:8080/accounts/00987987973432
Loan	http://localhost:8081/loans/H00987987972342

Configuration Tip
To avoid port conflicts:

Edit the following in loan/src/main/resources/application.properties:

properties
server.port=8081



