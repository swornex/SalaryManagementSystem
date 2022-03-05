<%@include file="/templates/header.jsp" %>
<%@include file="/templates/isLoggedIn.jsp"%>

<h2 class="text-center mt-4 mx-auto text-muted fw-normal">Salary List</h2>
<div class="container w-75 my-4">
    <div class="btn-wrap d-flex flex-row-reverse mb-2">
        <a href="salary-form" class="btn btn-outline-secondary shadow">Add Salary</a>
    </div>
    <table class="table">
        <thead>
        <tr class="table-dark">
            <th class="text-center">Id</th>
            <th class="text-center">Employee Id</th>
            <th class="text-center">Basic Salary</th>
            <th class="text-center">Allowance</th>
            <th class="text-center">Total Salary</th>
            <th class="text-center">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${salaries}" var="salary">
            <tr>
                <td class="text-center">${salary.id}</td>
                <td class="text-center">${salary.employeeId}</td>
                <td class="text-center">${salary.basicSalary}</td>
                <td class="text-center">${salary.allowance}</td>
                <td class="text-center">${salary.basicSalary + salary.allowance}</td>
                <td style="text-align: center">
                    <a href="salary-form?id=${salary.id}" class="btn btn-secondary">Edit</a>
                    <a href="salary-view?id=${salary.id}" class="btn btn-outline-secondary">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="/templates/footer.jsp" %>