/***Question 1 - Inner Join:**
You have two tables, "Employees" and "Departments." Write an SQL query to retrieve the names of employees along with their corresponding department names.

**Question 2 - Left Join:**
Using the same tables, write an SQL query to list all departments and the employees in each department, if available. Include departments that have no employees.

**Question 3 - Right Join:**
Given the same tables, write an SQL query to find out if there are any departments with no employees.

**Question 4 - Full Outer Join:**
Consider two tables, "Students" and "Courses." Write an SQL query to fetch all students and the courses they are enrolled in. Include courses that have no students.

**Question 5 - Combining Joins:**
You have three tables: "Customers," "Orders," and "Payments." Write an SQL query to retrieve customer names, their order details (if available), and payment amounts (if available).

**Question 6 - Joins and Aggregation:**
You have a table named "Products" and a table named "Sales." Write an SQL query to find out the total sales amount for each product, even if there were no sales for a product.

**Question 7 - Joins and Filtering:**
You're working with two tables, "Employees" and "Salaries." Write an SQL query to list employees who have salaries above $50,000 along with their salary details. Include all employees, even those with no salary record.

**Question 8 - Complex Joins:**
Consider four tables: "Students," "Courses," "Enrollments," and "Teachers." Write an SQL query to retrieve a list of courses, including the teacher's name, for students who are currently enrolled.

**Question 9 - Analyzing Data Gaps:**
You have a table named "WebsiteVisits" and another table named "Sales." Write an SQL query to analyze which dates had website visits but no sales, and which dates had sales but no website visits.

**Question 10 - Exploring Intersections:**
Imagine you have two tables, "Users" and "Subscriptions." Write an SQL query to fetch user details and the subscription plan name for users who have an active subscription, as well as those who have no subscription.
 */ 
 
 
 
#Solutions
#Question1
SELECT Employees.name, Departments.department_name
FROM Employees
INNER JOIN Departments ON Employees.department_id = Departments.department_id;

#Question2 

SELECT Departments.department_name, Employees.name
FROM Departments
LEFT JOIN Employees ON Departments.department_id = Employees.department_id;

#Question3
SELECT Departments.department_name, Employees.name
FROM Employees
RIGHT JOIN Departments ON Employees.department_id = Departments.department_id
WHERE Employees.name IS NULL;

#Question4
SELECT Students.student_name, Courses.course_name
FROM Students
LEFT JOIN Courses ON Students.course_id = Courses.course_id
UNION
SELECT Students.student_name, Courses.course_name
FROM Courses
RIGHT JOIN Students ON Students.course_id = Courses.course_id;

#Question5
SELECT c.customer_name, o.order_id, p.payment_amount
FROM Customers c
LEFT JOIN Orders o ON c.customer_id = o.customer_id
LEFT JOIN Payments p ON c.customer_id = p.customer_id;

#Question6
SELECT p.product_name, COALESCE(SUM(s.sales_amount), 0) AS total_sales_amount
FROM Products p
LEFT JOIN Sales s ON p.product_id = s.product_id
GROUP BY p.product_name;

#Question7
SELECT e.*, s.salary_amount
FROM Employees e
LEFT JOIN Salaries s ON e.employee_id = s.employee_id AND s.salary_amount > 50000;

#Questions8
SELECT c.course_name, t.teacher_name
FROM Students s
INNER JOIN Enrollments e ON s.student_id = e.student_id
INNER JOIN Courses c ON e.course_id = c.course_id
INNER JOIN Teachers t ON c.teacher_id = t.teacher_id;

#Question9
SELECT v.visit_date, 'Website Visit' AS activity_type
FROM WebsiteVisits v
WHERE v.visit_date NOT IN (SELECT DISTINCT visit_date FROM Sales)
UNION
SELECT s.sale_date, 'Sale' AS activity_type
FROM Sales s
WHERE s.sale_date NOT IN (SELECT DISTINCT visit_date FROM WebsiteVisits);

#Question10
SELECT u.*, s.subscription_plan_name
FROM Users u
LEFT JOIN Subscriptions s ON u.user_id = s.user_id;


