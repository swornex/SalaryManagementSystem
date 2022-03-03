<%@include file="/templates/header.jsp" %>

<h2 class="text-center mt-4 mx-auto">Salary List</h2>
<div class="container w-75 my-4">
    <div class="btn-wrap d-flex flex-row-reverse">
        <a href="salary-form" class="btn btn-primary btn-sm">Add Salary</a>
    </div>
    <table class="table">
        <thead>
        <tr>
            <th class="text-center">Id</th>
            <th class="text-center">Employee Id</th>
            <th class="text-center">Basic Salary</th>
            <th class="text-center">Allowance</th>
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
                <td>
                    <a href="salary-form?id=${salary.id}">Edit</a>
                    <a href="salary-view?id=${salary.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="/templates/footer.jsp" %>